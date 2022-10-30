import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.piat.fibRecursive.fibR;

public class testFibRecursive {
    @Test
    void fibRTest10(){
        assertEquals(55, fibR(10));
    }
    @Test
    void fibRTest21(){
        assertEquals(10946, fibR(21));
    }
}
