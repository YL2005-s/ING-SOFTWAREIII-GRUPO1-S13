import org.junit.jupiter.api.Test;
import org.nsq.PasswordValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    void testPasswordTooShort() {
        assertFalse(PasswordValidator.isValidPassword("Ab1"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(PasswordValidator.isValidPassword("abcdefg1"));
    }

    @Test
    void testPasswordWithoutNumber() {
        assertFalse(PasswordValidator.isValidPassword("Abcdefgh"));
    }

    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("Abcdefg1"));
    }

    @Test
    void testPasswordExactly8Characters() {
        assertTrue(PasswordValidator.isValidPassword("Aaaaaa1a"));
    }
}
