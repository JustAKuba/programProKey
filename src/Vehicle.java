import java.util.ArrayList;

public class Vehicle {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;
    private ArrayList<CarRadio> carRadios = new ArrayList<CarRadio>();

    public Vehicle(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    //Methods
    public void addCarRadio(CarRadio carRadio) {
        this.carRadios.add(carRadio);
    }

}
