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

  public Bank() {
    passwords = new HashMap<String, Password>();
  }

  public void addPassword() {
    String userName = InputHandler.inputSting();
    String password = InputHandler.inputString();
    String confirmPassword = InputHandler.inputString();
    String platform = InputHandler.inputString();

    Password newPassword = new Password(userName, password, confirmPassword, platform);
    passwords.put(newPassword.getPlatform(), newPassword);

  }

  public void removePassword() {
    String platform = InputHandler.inputString();
    if (passwords.containsKey(platform)) {
      passwords.remove(platform);
    } else{
      PrintHandler.printString("There is no password for this platform");
  }
  }





}
