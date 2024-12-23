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
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public void setPasswordMatch(boolean passwordMatch) {
    isPasswordMatch = passwordMatch;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }
}
