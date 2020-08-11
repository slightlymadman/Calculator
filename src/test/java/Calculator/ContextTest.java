package Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void run() throws Exception {
        Context context = new Context();
        assertEquals(0, context.run("C"));
        assertEquals(5, context.run("C2+3="));
        assertEquals(17, context.run("C17"));
        assertEquals(21849, context.run("C21849"));
        assertEquals(21849, context.run("C21849="));
        assertEquals(777, context.run("C234+543="));
        assertEquals(8, context.run("C2+2*2="));
        assertEquals(10, context.run("C5+="));
        assertEquals(100, context.run("C150-50="));
        assertEquals(20, context.run("C200/10="));
        assertEquals(69, context.run("C23*3="));
        assertEquals(1225, context.run("C35*35="));
        assertEquals(9025, context.run("C95*95="));
        assertEquals(57, context.run("C45-7*3/2="));
        assertEquals(1, context.run("C9/5="));
        assertEquals(0, context.run("C345*00="));
        assertEquals(35, context.run("C30-+*/*+5="));

    }
}