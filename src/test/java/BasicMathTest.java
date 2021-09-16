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
    public void testAdd2() {
        int actual = bm.add(6, 4);

        assertEquals(10, actual);
    }

    @Test
    public void testAdd3() {
        int actual = bm.add(4, 4);

        assertEquals(8, actual);
    }

    @Test
    public void multiply() {
        int actual = bm.multiply(10,2);

        assertEquals(20,actual);
    }

    @Test
    public void multiply2() {
        int actual = bm.multiply(10,10);

        assertEquals(100,actual);
    }

    @Test
    public void multiply3() {
        int actual = bm.multiply(10,4);

        assertEquals(40,actual);
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
        int actual = bm.subtract(20,11);
        
        assertEquals(9,actual);
    }

    @Test
    public void divide() {
        int actual = bm.divide(10,2);

        assertEquals(5,actual);
    }

    @Test
    public void divide2() {
        int actual = bm.divide(20,2);

        assertEquals(10,actual);
    }

    @Test
    public void divide3() {
        int actual = bm.divide(10,5);

        assertEquals(2,actual);
    }

    @Test
    public void modulo1() {
        int actual = bm.modulo(8,5);

        assertEquals(3,actual);
    }


    @Test
    public void modulo2() {
        int actual = bm.modulo(10,5);

        assertEquals(0,actual);
    }


@Test
public void modulo3() {
        int actual = bm.modulo(11,5);
        assertEquals(1,actual);
        }

}
