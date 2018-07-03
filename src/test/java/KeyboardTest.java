import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("BX-45");
    }

    @Test
    public void canGetModel(){
        assertEquals("BX-45", keyboard.getModel());
    }

    @Test
    public void canDoSOmething(){
        assertEquals("Write: Something", keyboard.inputData("Something"));
    }
}
