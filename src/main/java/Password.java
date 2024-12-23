/**
 * This class creates password.
 */
public class Password {
  private String username;
  private String password;
  private String confirmPassword;
  private boolean isPasswordMatch;
  private String platform;


  public Password(String username, String password, String confirmPassword, String platform) {
    this.username = username;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.platform = platform;
  }



  // Getters and Setters


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    if (username == null || username.isEmpty()) {
      throw new IllegalArgumentException("Username cannot be empty");
    }
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if (password == null || password.isEmpty()){
      throw new IllegalArgumentException("Password cannot be empty");
    }
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    if (confirmPassword == null || confirmPassword.isEmpty()) {
      throw new IllegalArgumentException("Confirmation password cannot be empty");
    }
    this.confirmPassword = confirmPassword;
  }

  public void setPasswordMatch(String password, String confirmPassword) {
    if (password.equals(confirmPassword) && !password.isEmpty()){
      throw new IllegalArgumentException("The password and confirmation password dont match");
    }
    this.isPasswordMatch = true;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    if (platform == null || platform.isEmpty()){
      throw new IllegalArgumentException("Platform cannot be empty");
    }
    this.platform = platform;
  }
}
