import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class testerFileTest {
    
    @Test
    public void testIsEven() {
        assertEquals(true, testerFile.isEvenSum(4, 2));
    }
}
