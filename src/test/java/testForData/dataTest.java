package testForData;
import com.walkingCompiler.Data.models.gatePost;
import com.walkingCompiler.Data.models.House;
import com.walkingCompiler.Data.models.Visitor;
import org.junit.jupiter.api.Assertions;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static com.sun.tools.javac.util.Constants.format;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class dataTest {

    @Test
    public void testVisitorGetterAndSetter() {
        Visitor visit = new Visitor("Visitor","09095270145",0, format(DateTimeFormatter.ofPattern("HH:mm")));
        visit.setVisitorName("Visitor");
        visit.setVisitorContact("09095270145");
        visit.setOTPNumber(1);
        visit.setFormat(DateTimeFormatter.ofPattern("HH:mm"));
        Assertions.assertEquals("Visitor", visit.getVisitorName());
        Assertions.assertEquals("09095270145", visit.getVisitorContact());
        Assertions.assertEquals(1,visit.getOTPNumber());
        Assertions.assertEquals("HH:mm", format(DateTimeFormatter.ofPattern("HH:mm")));
    }

    @Test
    public void testOTPGenerator() {
        House generate = new House();
        int otp = generate.generateRandomOTP();
        assertTrue(otp >= 1 && otp < 10);
    }

    @Test
    public void testOTPDoesNotReturnZero() {
        House generate = new House();
        int otp = generate.generateRandomOTP();
        assertNotEquals(0, otp);
    }

    @Test
    public void testOTPReturnsDifferentOTP() {
        House generate = new House();
        int otp1 = generate.generateRandomOTP();
        int otp2 = generate.generateRandomOTP();
        assertNotEquals(otp1, otp2);
    }

    @Test
    public void testHouseGetterAndSetter() {
        House reside = new House("21, Mike-Street",1);
        reside.setOTPGenerator(1);
        reside.setAddress("21, Mike-Street");
        Assertions.assertEquals("21, Mike-Street", reside.getAddress());
        Assertions.assertEquals(1, reside.getOTPGenerator());
    }

    @Test
    public void testGatePostGetterAndSetter() {
        gatePost validate = new gatePost("Jeff", "Visitor", 1, "HH:mm");
        validate.setSecurityName("Jeff");
        validate.setVisitorDetails("Visitor");
        validate.verifyOTP(String.valueOf(1));
        validate.setMyTime(LocalTime.parse("HH:mm"));
        Assertions.assertEquals("", validate.getSecurityName());
        Assertions.assertEquals("Visitor", validate.getVisitorDetails());
        Assertions.assertEquals(, validate.getMyTime());
        Assertions.assertEquals("HH:mm", validate.getMyTime());
    }
}
