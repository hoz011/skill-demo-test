import static org.junit.Assert.*;
import org.junit.*;

public class testerFileTest {
    
    //Test should fail
    @Test
    public void testIsEven() {
        assertEquals(true, testerFile.isEvenSum(4, 2));
    }
}
