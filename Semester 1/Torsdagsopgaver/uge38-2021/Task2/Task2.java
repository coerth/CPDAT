public class Task2{

  public static boolean happy;
  public static void main(String [] args) {
    if(args.length != 0){
      happy = Boolean.parseBoolean(args[0]);

      if (iAmHappy())
      {
        System.out.println("I clap my hands");
      }
      else
      {
        System.out.println("I don't clap my hands");
      }


      System.out.println(sum(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
      System.out.println(upperCase(args[3]));
      if (firstUpperCase(args[4]))
      {
        System.out.println(args[4] + "'s first letter is uppercase");
      }
      else
      {
        System.out.println(args[4] + "'s first letter is not uppercase");
      }
    }
    else{
      System.out.println("No megusta no argumentos!");
    }
  }


  public static boolean iAmHappy()
  {
    if(happy == true){
      return true;
    }

    else{
      return false;
    }

  }

  public static int sum(int tal1, int tal2){
    int sumTal = tal1 + tal2;
    return sumTal;
  }

  public static String upperCase(String format){

    return format.toUpperCase();
  }

  public static boolean firstUpperCase(String isFirst){
    if(Character.isUpperCase(isFirst.charAt(0))){
      return true;
    }
    else{
      return false;
    }
  }

}
