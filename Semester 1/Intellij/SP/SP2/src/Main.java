public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Bilpark");
        Bil bil = new BenzinBil("CB14670", "Citroen", "C3", 2014, 5, 95, 17);
        Bil elBil = new ElBil("FY52370", "Tesla", "X", 2018, 5, 100, 600, 200);
        Bil diselBil = new DieselBil("FR67894", "Peugot", "3008", 1996, 5, false, 12);
        garage.setBilArrayList(bil);
        garage.setBilArrayList(elBil);
        garage.setBilArrayList(diselBil);
        System.out.println(garage);
        for(Bil b : garage.getBilArrayList()){
            System.out.println(b);
        }
        System.out.println(garage.beregnGrønAfgiftForBilpark());


    }
}
