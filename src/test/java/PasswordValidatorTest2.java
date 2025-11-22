import org.junit.jupiter.api.Test;
import org.nsq.PasswordValidator;
import org.nsq.PasswordValidator2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest2 {

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator2.isValidPassword("Password123"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator2.isValidPassword("password123"));
    }

    @Test
    void testPasswordWithoutNumbers() {
        assertFalse(PasswordValidator2.isValidPassword("Password"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator2.isValidPassword("Pass1"));
    }
}
