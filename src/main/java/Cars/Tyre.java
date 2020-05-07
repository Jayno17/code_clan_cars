package Cars;

public class Tyre {

    private String brand;
    private int number;

    public Tyre(String brand, int number){
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }
}
