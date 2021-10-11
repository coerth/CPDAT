
public class Board {
    Field[] fields = new Field[40];

    public Board() {
        setFields();
    }

    private void setFields(){
        //todo: læse field data ind og instantiere felter af forskelige type
        fields[0] = new Start(1, "Start", 0, 4000);
    }

    public Field getField(int position){
        return fields[position-1];
    }
}
