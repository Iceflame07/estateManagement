package testForData;
import com.WalkingCompiler.Data.models.House;
import com.WalkingCompiler.Data.models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class modelTest {

    @Test
    public void testForHouse() {
        House house = new House("","",true);
        house.setAddress("");
        house.setNumber("");
        house.setGenerateOTP(true);
        Assertions.assertEquals("", house.getAddress());
        Assertions.assertEquals("", house.getNumber());
        Assertions.assertTrue(house.isGenerateOTP());
    }

    @Test
    public void testForUser() {
        User uses = new User("","");
        uses.setName("George");
        uses.setPassword("");
        Assertions.assertEquals("George",uses.getName());
        Assertions.assertEquals("",uses.getPassword());
        Assertions.assertTrue(true, String.valueOf(uses.getPassword()));
        Assertions.assertFalse(false, String.valueOf(uses.getPassword()));
    }
}