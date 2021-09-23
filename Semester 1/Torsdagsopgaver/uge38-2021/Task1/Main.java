public class Main{

  public static void main(String[] args) {
    System.out.println();
    SkrivNoget1("Dette er en string");
    String name = args[0];
    int age = Integer.parseInt(args[1]);
    SkrivNoget2(name, age);

  }

  public static void SkrivNoget1(String string){

    System.out.println(string);

  }

  public static void SkrivNoget2(String navn, int age){

    System.out.println("My name is " + navn + ", i am " + age + " years old");

  }

}
