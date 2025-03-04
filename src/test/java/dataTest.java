import com.walkingCompiler.Data.models.Gate;
import com.walkingCompiler.Data.models.Resident;
import com.walkingCompiler.Data.models.Visitor;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class dataTest {

    @Test
    public void testVisitorGetterAndSetter() {
        Visitor visit = new Visitor("Visitor","09095270145","21 Mike-Street");
        visit.setVisitorName("Visitor");
        visit.setVisitorNumber("09095270145");
        visit.setVisitorAddress("21 Mike-Street");
        Assertions.assertEquals("Visitor", visit.getVisitorName());
        Assertions.assertEquals("09095270145", visit.getVisitorNumber());
        Assertions.assertEquals("21 Mike-Street", visit.getVisitorAddress());
    }

    @Test
    public void testResidentGetterAndSetter() {
        Resident reside = new Resident("","09095270145","21, Mike-Street",0.1);
        reside.setName("");
        reside.setContact("09095270145");
        reside.setAddress("21, Mike-Street");
        reside.setOTP(0.1);
        Assertions.assertEquals("", reside.getName());
        Assertions.assertEquals("09095270145", reside.getContact());
        Assertions.assertEquals("21, Mike-Street", reside.getAddress());
        Assertions.assertEquals(0.1, reside.getOTP());
    }

    @Test
    public void testGateGetterAndSetter() {
        Gate entrance = new Gate("Jeff","Visitor",00.1);
        entrance.setSecurityName("Jeff");
        entrance.setVisitorDetails("Visitor");
        entrance.setVisitorOTP(00.1);
        Assertions.assertEquals("Jeff", entrance.getSecurityName());
        Assertions.assertEquals("Visitor", entrance.getVisitorDetails());
        Assertions.assertEquals(00.1, entrance.getVisitorOTP());
    }
}
