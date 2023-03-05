public class Main {
    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        CarRadio carRadio = new CarRadio();
        car.addCarRadio(carRadio);
        carRadio.turnOn();
        carRadio.changeStation(RadioStations.EVROPA_2);
        carRadio.changeVolume(10);
        System.out.println(carRadio.getCurrentStation());
        System.out.println(carRadio.getCurrentVolume());
        System.out.println(carRadio.getIsOn());


    }
}

