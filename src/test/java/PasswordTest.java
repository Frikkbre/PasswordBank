import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PasswordTest {
  @Test
  public void testPassword() {
    Password password = new Password("username", "password", "password", "platform");
    assertEquals("username", password.getUsername());
    assertEquals("password", password.getPassword());
    assertEquals("password", password.getConfirmPassword());
    assertEquals("platform", password.getPlatform());
  }

  @Test
  public void testSetUsername() {
    Password password = new Password("username", "password", "password", "platform");
    password.setUsername("newUsername");
    assertEquals("newUsername", password.getUsername());
  }

  @Test
  public void testSetPassword() {
    Password password = new Password("username", "password", "password", "platform");
    password.setPassword("newPassword");
    assertEquals("newPassword", password.getPassword());
  }

  @Test
  public void testSetConfirmPassword() {
    Password password = new Password("username", "password", "password", "platform");
    password.setConfirmPassword("newPassword");
    assertEquals("newPassword", password.getConfirmPassword());
  }

  /*@Test
  public void testSetPasswordMatch() {

    Password password = new Password("username", "password", "password", "platform");
    password.setPasswordMatch("password", "password");
    assertTrue(password.isPasswordMatch("password", "password"));
  }*/

}
