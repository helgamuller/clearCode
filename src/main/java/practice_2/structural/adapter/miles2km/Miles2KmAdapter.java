package practice_2.structural.adapter.miles2km;

public class Miles2KmAdapter {
    private double miles;

    public Miles2KmAdapter(double miles){
        this.miles = miles;
    }
    public double convertMilesIntoKm(){
        return miles*1.60934;
    }

    @Override
    public String toString() {
        return "Miles2KmAdapter{" +
                "miles=" + miles +
                '}';
    }
}
