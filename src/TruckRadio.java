public class TruckRadio implements ICarRadio{
    private RadioStations currentStation;
    private int currentVolume;
    private boolean isOn;

    //Constructor
    public TruckRadio() {
        this.currentStation = RadioStations.ANTENA_1;
        this.currentVolume = 0;
        this.isOn = true;
    }

    //Getters
    public RadioStations getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean getIsOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public void changeStation(RadioStations station) {
        this.currentStation = station;
    }

    @Override
    public void changeVolume(int volume) {
        this.currentVolume = volume;
    }
}
