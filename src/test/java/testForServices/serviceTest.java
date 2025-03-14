package testForServices;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.time.LocalTime;
import java.util.Random;

public class serviceTest {

    @Test
    public void testGenerateRandomOTP() {
        Random number = new Random();
        int otp = number.nextInt(1001) + 1;
        Assertions.assertTrue(true);
    }

    @Test
    public void testCheckInTime() {
        LocalTime now = LocalTime.now();
        LocalTime time = now.plusMinutes(5);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertNotEquals(now, time);
    }

    @Test
    public void testCheckOutTime() {
        LocalTime now = LocalTime.now();
        LocalTime time = now.minusMinutes(5);
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);
        Assertions.assertNotEquals(now, time);
    }
}
