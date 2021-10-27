public class BenzinBil extends Bil{
    private int octanTal;
    private int kmPrL;

    public BenzinBil(String regNr, String mærke, String model, int årgang, int antalDøre, int octanTal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.octanTal = octanTal;
        this.kmPrL = kmPrL;
    }

    public int getOctanTal() {
        return octanTal;
    }

    public void setOctanTal(int octanTal) {
        this.octanTal = octanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s+= "BenzinBil{" +
                "octanTal=" + octanTal +
                ", kmPrL=" + kmPrL +
                '}';
        return s;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double ejerAfgift = 0;
        if(kmPrL > 20 && kmPrL < 50){
            ejerAfgift = 330;
        }
        else if(kmPrL > 15 && kmPrL < 20){
            ejerAfgift = 1050;
        }
        else if(kmPrL > 10 && kmPrL < 15){
            ejerAfgift = 2340;
        }
        else if(kmPrL > 5 && kmPrL < 10){
            ejerAfgift = 5500;
        }
        else if(kmPrL < 5){
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }
}
