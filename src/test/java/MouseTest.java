import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("PX-45");
    }

    @Test
    public void canGetModel(){
        assertEquals("PX-45", mouse.getModel());
    }

    @Test
    public void canDoSomething(){
        assertEquals("Click!", mouse.inputData("Click!"));
    }
}
