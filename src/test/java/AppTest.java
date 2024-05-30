import main.java.App;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(10, App.add(7, 3));
        assertEquals(99, App.add(11, 88));
        assertEquals(50, App.add(16, 34));
        assertEquals(1, App.add(-1, 2));
        assertEquals(-7, App.add(-4, -3));
    }
}
