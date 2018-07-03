import device_management.Computer;
import device_management.Monitor;
import device_management.Printer;
import device_management.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        assertNotNull(computer.getOutputDevice());
    }


    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("EPSON", "Stylus", 120, 4);
        computer = new Computer(8,512, printer);
        assertEquals("printing: Holiday pictures", computer.outputData("Holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        computer = new Computer(8,512, speaker);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canOutputDataViaMonitor(){
        Monitor monitor = new Monitor(55, 1080);
        computer = new Computer(8,512, monitor);
        assertEquals("CSI is now on screen", computer.outputData("CSI"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer = new Printer("EPSON", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

}
