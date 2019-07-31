package components;

public class Tyres {

    public int noOfTyres;
    public String type;

    public Tyres(int noOfTyres, String type) {
        this.noOfTyres = noOfTyres;
        this.type = type;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public String getType() {
        return type;
    }
}
