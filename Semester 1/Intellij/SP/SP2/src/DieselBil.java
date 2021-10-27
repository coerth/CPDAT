public class DieselBil extends Bil{
    private boolean partikelFilter;
    private int kmPrL;

    public DieselBil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean partikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.partikelFilter = partikelFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isPartikelFilter() {
        return partikelFilter;
    }

    public void setPartikelFilter(boolean partikelFilter) {
        this.partikelFilter = partikelFilter;
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
        s+= "DieselBil{" +
                "partikelFilter=" + partikelFilter +
                ", kmPrL=" + kmPrL +
                '}';
        return s;
    }

    public double beregnUdligningsAfgift() {
        double udligningsAfgift = 0;
        if(kmPrL > 20 && kmPrL < 50){
            udligningsAfgift = 130;
        }
        else if(kmPrL > 15 && kmPrL < 20){
            udligningsAfgift = 1390;
        }
        else if(kmPrL > 10 && kmPrL < 15){
            udligningsAfgift = 1850;
        }
        else if(kmPrL > 5 && kmPrL < 10){
            udligningsAfgift = 2770;
        }
        else if(kmPrL < 5){
            udligningsAfgift = 15260;
        }
        return udligningsAfgift;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double udligningsafgift;
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
        udligningsafgift = beregnUdligningsAfgift();
        if(partikelFilter){
            ejerAfgift += 1000;
        }
        return ejerAfgift+udligningsafgift;
    }
}
