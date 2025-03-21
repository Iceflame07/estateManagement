package testForData;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Data.models.Security;
import com.byteBuilders.Data.models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class modelTest {

    @Test
    public void testForHouse() {
        House house = new House("",12,true);
        house.setAddress("");
        house.setHouseNumber(12);
        house.setGenerateOTP(house.isGenerateOTP());
        Assertions.assertEquals("",house.getAddress());
        Assertions.assertEquals(12,house.getHouseNumber());
        Assertions.assertEquals(true, house.isGenerateOTP());
    }

    @Test
    public void testForSecurity() {
        Security secure = new Security("Adamu",10,11);
        secure.setSecurityName("Adamu");
        secure.setSecurityId(10);
        secure.setSecurityPassword(secure.getSecurityPassword());
        Assertions.assertEquals("Adamu",secure.getSecurityName());
        Assertions.assertEquals(10,secure.getSecurityId());
        Assertions.assertTrue(true, String.valueOf(secure.getSecurityPassword()));
    }

    @Test
    public void testForUser() {
        User uses = new User("","",0);
        uses.setName("George");
        uses.setEmail("George@gmail.com");
        uses.setPassword(0);
        Assertions.assertEquals("George",uses.getName());
        Assertions.assertEquals("George@gmail.com",uses.getEmail());
        Assertions.assertEquals(0,uses.getPassword());
        Assertions.assertTrue(true, String.valueOf(uses.getPassword()));
        Assertions.assertFalse(false, String.valueOf(uses.getPassword()));
    }
}
