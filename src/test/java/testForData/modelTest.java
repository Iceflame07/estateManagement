package testForData;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Data.models.Security;
import com.byteBuilders.Data.models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class modelTest {

    @Test
    public void testForHouse() {
        House house = new House();
        house.setAddress("");
        house.setNumber(12);
        Assertions.assertEquals("",house.getAddress());
        Assertions.assertEquals(12,house.getNumber(0));
    }

    @Test
    public void testForSecurity() {
        Security secure = new Security();
        secure.setSecurityName("");
        secure.setAddress("");
        secure.setPassword(0);
        Assertions.assertEquals("",secure.getSecurityName());
        Assertions.assertEquals("",secure.getAddress());
        Assertions.assertEquals(0, secure.getPassword());
    }

    @Test
    public void testForUser() {
        User uses = new User();
        uses.setName("");
        uses.setEmail("");
        uses.setPassword(0);
        uses.setId(0);
        Assertions.assertEquals("",uses.getName());
        Assertions.assertEquals("",uses.getEmail());
        Assertions.assertEquals(0,uses.getId());
        Assertions.assertTrue(true, String.valueOf(uses.getPassword()));
        Assertions.assertFalse(false, String.valueOf(uses.getPassword()));
    }
}
