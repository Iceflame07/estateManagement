package testForData;
import com.byteBuilders.Data.models.House;
import com.byteBuilders.Data.repositories.HouseRepository;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class repositoryTest {

    @Test
    public void testFindById() {
        HouseRepository repository = new HouseRepository();
    }

    @Test
    public void testSaveAndFindByAddress() {
        House address = new House();
        address.save("");
        List<House> foundHouses = repository.findByAddress("123 Main St");
        assertEquals(2, foundHouses.size());
    }

    @Test
    public void testDelete() {
        House delete = new House();
        house.save("");
        delete.remove("");
        assertNull(repository.findByNumber(101));
    }
}
