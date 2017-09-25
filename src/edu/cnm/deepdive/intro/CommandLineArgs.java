package edu.cnm.deepdive.intro;

/**
 * This class demonstrates iteration over command line arguments.
 *
 * @author FeliciaUrioste
 */
public class CommandLineArgs {

  /**
   * Iterates through the arguments <code>args</code>, printing each one.
   * <p>
   * @param args  command line arguments
   */
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      String argument = args[i];
      System.out.printf("%d: %s%n", i, argument);
    }
  }
}
