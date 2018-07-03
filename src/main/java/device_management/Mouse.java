package device_management;

import Behaviours.IInput;
import Behaviours.IOutput;

public class Mouse implements IInput {

    private String model;

    public Mouse(String model){
        this.model = model;
    }

    @Override
    public String inputData(String data) {
        return "Click!";
    }

    public String getModel() {
        return model;
    }
}
