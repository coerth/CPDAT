import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> bilArrayList = new ArrayList<>();
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public ArrayList<Bil> getBilArrayList() {
        return bilArrayList;
    }

    public void setBilArrayList(Bil bil) {
        this.bilArrayList.add(bil);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double beregnGrønAfgiftForBilpark(){
        double samletAfgift = 0;
        for(Bil b : bilArrayList){
            samletAfgift += b.beregnGrønEjerafgift();
        }
        return samletAfgift;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                '}';
    }
}
