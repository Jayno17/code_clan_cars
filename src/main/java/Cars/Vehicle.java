package Cars;

public abstract class Vehicle {
    private double price;
    private String colour;
    private EngineType engine;
    private Tyre tyres;

    public Vehicle(double price, String colour, EngineType engine, Tyre tyres){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public EngineType getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }
}
