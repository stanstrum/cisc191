package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Stan Strum {@literal <sstrum@student.sdccd.edu>}
 *
 * Other contributors:
 * N/A
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 * Version/date: 19 Feb 2024
 *
 * Responsibilities of class:
 * A movable object has a speed that may be externally modified
 */
public interface Movable
{
  /**
   * @return the object's current speed
   */
  int getSpeed();

  /**
   * Increment's the object's current speed
   */
  void speedUp();
}
