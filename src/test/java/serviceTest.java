import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class serviceTest {

    @Test
    public void testGenerateRandomOTP() {
        Random number = new Random();
        int OTP = number.nextInt(1, 10);
        Assertions.assertEquals(10, OTP);
    }
}
