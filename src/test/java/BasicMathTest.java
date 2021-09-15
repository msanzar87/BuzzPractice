import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathTest {
BasicMath bm = new BasicMath();
    @Test
    public void testAdd1() {
        int actual = bm.add(3,4);

        assertEquals(7,actual);
    }

    @Test
    public void multiply() {
        int actual = bm.multiply(10,2);

        assertEquals(20,actual);
    }

    @Test
    public void subtract1() {
        int actual = bm.subtract(4,1);

        assertEquals(3,actual);
    }

    @Test
    public void subtract2() {
        int actual = bm.subtract(10,9);

        assertEquals(1,actual);
    }

    @Test
    public void subtract3() {
    }

    @Test
    public void divide() {
    }

    @Test
    public void modulo() {
    }
}