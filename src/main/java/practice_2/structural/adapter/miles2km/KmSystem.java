package practice_2.structural.adapter.miles2km;

public class KmSystem {
    //private double path;
    public double calculateSpeed(double path, int hours){
        double speed = path/hours;
        return speed;
    }
}
