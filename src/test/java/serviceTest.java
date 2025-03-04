import com.walkingCompiler.Services.OTPGenerator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class serviceTest {

    @Test
    public void testOTPGenerator() {
        OTPGenerator generate = new OTPGenerator();
        generate.generateRandomOTP();
        Assertions.assertEquals(0, generate.generateRandomOTP());
    }
}
