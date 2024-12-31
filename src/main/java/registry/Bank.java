package registry;

import java.util.HashMap;

import entity.Password;
import util.InputHandler;
import util.PrintHandler;


/**
 * This class acts as a register for storing passwords
 *
 * @version 0.0.1
 * @author Frikk Brændsrød
 */
public class Bank {
  private HashMap<String, Password> passwords;
  private InputHandler inputHandler;
  private PrintHandler printHandler;


  public Bank() {
    passwords = new HashMap<String, Password>();
    inputHandler = new InputHandler();
    printHandler = new PrintHandler();
  }

  public void addPassword() {
    String userName = inputHandler.inputString(); //TODO - refactor inputHandler to UI class
    String password = inputHandler.inputString();
    String confirmPassword = inputHandler.inputString();
    String platform = inputHandler.inputString();

    Password newPassword = new Password(userName, password, confirmPassword, platform);
    passwords.put(newPassword.getPlatform(), newPassword);

  }

  public void removePassword() {
    String platform = inputHandler.inputString(); //TODO - refactor inputHandler to UI class
    if (passwords.containsKey(platform)) {
      passwords.remove(platform);
    } else{
      printHandler.printString("There is no password for this platform");
  }
  }





}
