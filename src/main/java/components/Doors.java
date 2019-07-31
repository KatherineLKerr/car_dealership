package components;

public class Doors {

    private int noOfDoors;
    private boolean electricWindows;

    public Doors(int noOfDoors, boolean electricWindows) {
        this.noOfDoors = noOfDoors;
        this.electricWindows = electricWindows;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public boolean isElectricWindows() {
        return electricWindows;
    }
}
