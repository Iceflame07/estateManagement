package testForData;
import com.byteBuilders.Data.models.House;
import com.sun.jna.platform.win32.WinNT;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;
import static org.junit.Assert.*;

public class repositoryTest {

    @Test
    public void testFindByAddress() {
        House house = new House();
        house.save(house);
        List<House> houseList.findByAddress();
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(house, result.get(0));
    }

    @Test
    public void testFindByNumber() {
        House house = new House();
        houseRepository.save(house);
        House result = houseRepository.findByNumber();
        assertNotNull(result);
        assertEquals(house, result);
    }

    @Test
    public void testSave() {
        houseRepository.save(house);
        House result = houseRepository.findByNumber(1);
        assertNotNull(result);
        assertEquals(house, result);
    }

    @Test
    public void testDelete() {
        House house = new House();
        house.save(house);
        house.delete(house);
        Assertions.assertEquals(1, house.getNumber());
        assertNotNull(result);
    }
}
