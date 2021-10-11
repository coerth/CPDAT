public class Property extends Field{
    protected int seriesID;

    public Property(int cost, String label, int income, int id, int seriesID) {
        super(id, label, cost, income);
        this.seriesID = seriesID;
    }



    public void onAccept(){

    }

    public void onReject(){

    }

    @Override
    public String toString() {
        String s = super.toString();
        s += " En del af serie:" + seriesID;
        return s;
    }
}


