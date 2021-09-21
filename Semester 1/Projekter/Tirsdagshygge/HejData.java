public class HejData{

String navn = "Casper";

public static void main(String[] args) {

//String[] argumenter = {"Hej", "per", "john","nej"};

if(args.length != 0){
  String forsteargument = args[0];
  //System.out.println("forsteargument er: "+forsteargument);
  //int heltal = Integer.parseInt(forsteargument);

  for (int i = 0; i<args.length; i++) {
    System.out.println(args[i]);
  }

//  System.out.println("Tallet er"+heltal);
}else{
  System.out.println("no arguments");
}


}

private static void SkrivNoget(String navn, int antal){
for (int i = 0; i<=antal; i++) {
  System.out.println("Velkommen til, " + navn);
}

}

}
