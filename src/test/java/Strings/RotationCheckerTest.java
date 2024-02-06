package Strings;


import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class RotationCheckerTest {

    @Test
    public void testIsRotation() {
        // Arrange
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        // Act & Assert
        assertTrue(RotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsNotRotation() {
        // Arrange
        String str1 = "Hello";
        String str2 = "World";

        // Act & Assert
        assertFalse(RotationChecker.isRotation(str1, str2));
    }
}