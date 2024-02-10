package cisc191.sdmesa.edu;

/**
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Responsibilities of class:
 */

public class Person {
  private String name;

  /**
   * @return {@link Person#name}
   */
  public String getName() {
    return name;
  }

  /**
   * Sets {@link Person#name}
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  Person(String arg0, String arg1, String arg2) {
    throw new UnsupportedOperationException("Not implemented");
  }
}

