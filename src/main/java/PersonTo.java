public class PersonTo {


    private double højde;
    private int alder;


    public PersonTo(int alder, double højde) {
        this.alder = alder;
        this.højde = højde;

    }

    public double getHøjde() {
        return højde;
    }

    public void setHøjde(double højde){
        this.højde = højde;
    }

    public int getAlder() {
        return alder;
    }

    public void harFødselsdag() {
    alder++;
    }
}
