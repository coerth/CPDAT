public class ElBil extends Bil{
    private int batteriKapacitetKw;
    private int maxKm;
    private int wPKm;

    public ElBil(String regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetKw, int maxKm, int wpKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKw = batteriKapacitetKw;
        this.maxKm = maxKm;
        this.wPKm = wpKm;
    }

    public int getBatteriKapacitetKw() {
        return batteriKapacitetKw;
    }

    public void setBatteriKapacitetKw(int batteriKapacitetKw) {
        this.batteriKapacitetKw = batteriKapacitetKw;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWpKm() {
        return wPKm;
    }

    public void setWpKm(int wpKm) {
        this.wPKm = wpKm;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s+= "ElBil{" +
                "batteriKapacitetKw=" + batteriKapacitetKw +
                ", maxKm=" + maxKm +
                ", WpKm=" + wPKm +
                '}';
        return s;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double ejerAfgift = 0;
        double kmPrLiter = 100/(wPKm/91.25);
        if(kmPrLiter > 20 && kmPrLiter < 50){
            ejerAfgift = 330;
        }
        else if(kmPrLiter > 15 && kmPrLiter < 20){
            ejerAfgift = 1050;
        }
        else if(kmPrLiter > 10 && kmPrLiter < 15){
            ejerAfgift = 2340;
        }
        else if(kmPrLiter > 5 && kmPrLiter < 10){
            ejerAfgift = 5500;
        }
        else if(kmPrLiter < 5){
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }
}
