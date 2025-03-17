package testForData;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Data.models.Security;
import com.byteBuilders.Data.models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class modelTest {

    @Test
    public void testForHouse() {
        House house = new House("",12,);
        house.setAddress("");
        house.setHouseNumber(12);
        house.setGenerateOTP();
        Assertions.assertEquals("",house.getAddress());
        Assertions.assertEquals(12,house.getHouseNumber());
    }

    @Test
    public void testForSecurity() {
        Security secure = new Security("",0,"");
        secure.setSecurityName("");
        secure.setAddress("");
        secure.setPassword(0);
        Assertions.assertEquals("",secure.getSecurityName());
        Assertions.assertEquals("",secure.getAddress());
        Assertions.assertEquals(0, secure.getPassword());
    }

    @Test
    public void testForUser() {
        User uses = new User("","",0000);
        uses.setName("George");
        uses.setEmail("George@gmail.com");
        uses.setPassword(0000);
        Assertions.assertEquals("George",uses.getName());
        Assertions.assertEquals("George@gmail.com",uses.getEmail());
        Assertions.assertEquals(0000,uses.getPassword());
        Assertions.assertTrue(true, String.valueOf(uses.getPassword()));
        Assertions.assertFalse(false, String.valueOf(uses.getPassword()));
    }
}
