import main.java.App;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        //prueba
    }
}
