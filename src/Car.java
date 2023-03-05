import java.util.ArrayList;

public class Car extends Vehicle{

    // Fields
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;
    private ArrayList<CarRadio> carRadios = new ArrayList<CarRadio>();

    public Car( String name, int cylinders) {
        super(name, cylinders);
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }




}
