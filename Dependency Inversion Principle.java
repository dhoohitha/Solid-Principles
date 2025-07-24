interface SwitchableDevice {  
    void activate();  
}  

class Bulb implements SwitchableDevice {  
    public void activate() {  
        System.out.println("Bulb is now ON");  
    }  
}  

class PowerSwitch {  
    SwitchableDevice device;  

    PowerSwitch(SwitchableDevice device) {  
        this.device = device;  
    }  

    void toggle() {  
        device.activate();  
    }  
}  

public class DIPExample {  
    public static void main(String[] args) {  
        SwitchableDevice bulb = new Bulb();  
        PowerSwitch powerSwitch = new PowerSwitch(bulb);  
        powerSwitch.toggle();  
    }  
}  
