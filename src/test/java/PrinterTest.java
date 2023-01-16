import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 10);
    }

    @Test
    public void printerHasPaper() {
        assertEquals(100, printer.getPaperLeft());
    }

    @Test
    public void printerHasToner() {
        assertEquals(10, printer.getToner());
    }

    @Test
    public void printReducesPaperLeft() {
        printer.print(10,2);
        assertEquals(80, printer.getPaperLeft());
    }

    @Test
    public void printReducesTonerByOne() {
        printer.print(10,2);
        printer.print(30,2);
        assertEquals(8, printer.getToner());
    }

    @Test
    public void printerFailsIfNotEnoughPaper() {
        printer.print(100,2);
        assertEquals(100, printer.getPaperLeft());
    }




};