#!/bin/bash

# Author : Stan Strum <sstrum@student.sdccd.edu>
# Date   : 16 Feb 2024
# Purpose: to make submission archives quickly and without using Eclipse :)

CONFIG=".mk_archive.json"

echoError() {
  if [ ! -z "$*" ]; then
    echo -n "error: " >&2
  fi

  echo "${@}" >&2
}

usageExit() {
  echoError "usage: ./mk_archive.sh <input folder> [author?]"
  echoError " "
  echoError -e "author\t\tAuthor's name, can also be set via env AUTHOR"

  exit 1
}

# validate arguments
if [ -z "$*" ]; then
  echoError "no arguments provided"
  echoError
  usageExit
fi

# validate dir from $1
if [ -d "${1}" ]; then
  cd "${1}"

  absoluteDirectory="$(pwd -P)"
else
  echoError "no input directory provided"
  echoError
  usageExit
fi

# validate & get author via $2 or env AUTHOR
if [ ! -z "${2}" ]; then
  author="${2}"
elif [ ! -z "${AUTHOR}" ]; then
  author="${AUTHOR}"
else
  echoError "no author provided"
  echoError
  usageExit
fi

parsedAuthor="$(sed 's/\W/_/' <<< "${author}")"
echo "author: ${author} (${parsedAuthor})"

# recurse upwards until we find .mk_archive.json
lastPwd=""

while [ ! -f "${CONFIG}" -a "${lastPwd}" != "$(pwd)" ]; do
  lastPwd="$(pwd)"

  cd ..

  echo -en "\rconfig not found, trying $(pwd)\x1b[K"
done

echo -e "\rfound config: $(pwd)\x1b[K"

# verify CONFIG
if [ ! -f "${CONFIG}" ]; then
  echoError "config file not found in parent directories"

  exit 1
fi

baseDirectory="$(pwd -P)"

# get output archive name
directoryBasename="$(basename "${absoluteDirectory}")"
ofilePrefix="$(jq -r '.["'"${directoryBasename}"'"]' "${CONFIG}")"

# verify the prefix is real
if [ "${ofilePrefix}" == "null" ]; then
  echoError "directory not found in .mk_archive.json, consider adding it"

  exit 1
fi

# compute output file name
ofile="${ofilePrefix}_${parsedAuthor}.zip"

# verify we don't clobber an existing archive
if [ -f "${ofile}" ]; then
  # prompt user to remove file
  rm -i "${ofile}"

  # verify archive was actually deleted
  if [ -f "${ofile}" ]; then
    echoError "archive was not removed"

    exit 1
  fi
fi

# chdir to input folder
cd "${absoluteDirectory}"

absoluteArchive="${baseDirectory}/${ofile}"

# make archive
if ! zip -9 -r "${absoluteArchive}" .; then
  echoError "failed to create archive"

  exit 1
fi

# show amount of files and archive size
unzip -l "${absoluteArchive}" | tail -n 2
