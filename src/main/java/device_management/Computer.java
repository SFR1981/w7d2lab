package device_management;

import Behaviours.IInput;
import Behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;

    private String dataString;
    
    private IOutput outputDevice;
    private IInput inputDevice;
    

    public Computer(int ram, int hddSize, IOutput outputDevice, IInput inputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevice = inputDevice;
        this.dataString = null;

    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public IInput getInputDevice() {
        return this.inputDevice;
    }

    public String outputData(String data) {
        return this.getOutputDevice().outputData(data);
    }

    public void inputData(String data) {
        this.dataString = this.getInputDevice().inputData(data);
    }


    public void setOutputDevice(IOutput outDevice) {
        this.outputDevice = outDevice;
    }

    public void setInputDevice(IInput inputDevice) {
        this.inputDevice = inputDevice;
    }

    public String getDataString() {
        return dataString;
    }

    public String outputDataString(){
        return outputData(this.dataString);

    }


}
