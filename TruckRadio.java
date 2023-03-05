public class TruckRadio implements ICarRadio{
    private RadioStations currentStation;
    private int currentVolume;
    private boolean isOn;

    //Constructor
    public TruckRadio() {
        this.currentStation = RadioStations.KISS;
        this.currentVolume = 0;
        this.isOn = false;
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
}
