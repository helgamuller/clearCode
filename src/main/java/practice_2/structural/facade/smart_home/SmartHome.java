package practice_2.structural.facade.smart_home;

public class SmartHome {
    AC ac;
    Light light;
    SecuritySystem security;

    public SmartHome(AC ac, Light light, SecuritySystem security) {
        this.ac = ac;
        this.light = light;
        this.security = security;
    }
    public void turnEverythingOn(){
        ac.turnOn();
        light.turnOn();
        security.activate();
    }
    public void turnEverythingOff(){
        ac.turnOff();
        light.turnOff();
        security.deActivate();
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "ac=" + ac +
                ", light=" + light +
                ", security=" + security +
                '}';
    }
}
