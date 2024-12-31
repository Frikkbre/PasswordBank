package util;

import java.util.Scanner;

public class InputHandler {
  Scanner inputScanner = new Scanner(System.in);

  public static String inputSting() {
    return null;
  }

  public String inputString() {
    return inputScanner.nextLine();
}

  public int inputInt() {
    //inputScanner.nextLine(); TODO - Does this need nextLine to not skip next input?
    return inputScanner.nextInt();

  }
}
