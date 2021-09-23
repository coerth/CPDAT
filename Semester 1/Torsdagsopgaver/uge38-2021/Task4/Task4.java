public class Task4{

  public static String[] array1 = {"hej", "med", "dig", "du", "er", "sej"};
  public static int[] array2 = {10,25,34,49,95,63,71};
  public static boolean[] array3 = {true, false, true, true, false, true, false, false};
  public static void main(String[] args) {
    arrayCheck(array1);
    System.out.println(arraySum(array2));
    System.out.println(arrayAvg(array2));
  }

  public static void arrayCheck(String[] arraycheck){
    for(int i = 0; i<arraycheck.length; i++){
      System.out.println(arraycheck[i]);
    }
  }

  public static int arraySum(int[] sum){
    int sumAll = 0;
    for(int i = 0; i<sum.length; i++){
      sumAll += sum[i];
    }
    return sumAll;
  }

  public static int arrayAvg(int[] sum){
    int sumForAvg = 0;
    int avg = 0;
    for(int i = 0; i<sum.length; i++){
      sumForAvg += sum[i];
    }
    avg = sumForAvg / sum.length;
    return avg;
  }

}
