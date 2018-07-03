package device_management;

import Behaviours.IInput;

public class Keyboard implements IInput {
    
    private String model;
    
    public Keyboard(String model){
        this.model = model;
    }

    @Override
    public String inputData(String data) {
        return "Write: " + data;
    }

    public String getModel() {
        return model;
    }
}
