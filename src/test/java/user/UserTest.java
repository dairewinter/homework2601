package user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.skypro.user.User;

public class UserTest {
    @Test
    public void testUserConstructorWithParameters(){
        final String email = "email";
        final String password = "password";
        User user = new User(email, password);
        String userEmail = user.getEmail();
        String userPassword = user.getPassword();
        Assertions Assert = null;
        Assert.assertEquals(email, userEmail);
        Assert.assertEquals(password, userPassword);

    }

    @Test
    public void testUserConstructorWithoutParameters(){
        User user = new User();
        String userEmail = user.getEmail();
        String userPassword = user.getPassword();
        Assertions.assertNull(user.getEmail());
        Assertions.assertNull(user.getPassword());
    }

    @Test
    public void testUserEmail(){
        User user = new User("skypro@java.ru", "skyprojava");
        String userEmail = user.getEmail();
        Assertions.assertTrue(userEmail.contains("@") && userEmail.contains("."));
    }

    @Test
    public void testEmailPassword(){
        final String email = "email";
        final String password = "password";
        User user = new User(email, password);
        String userEmail = user.getEmail();
        String userPassword = user.getPassword();
        Assertions.assertNotEquals(userEmail, userPassword);
    }
}
