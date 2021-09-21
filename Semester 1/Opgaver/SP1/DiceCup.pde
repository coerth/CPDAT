Die[] DiceCupArray = new Die[10];

class DiceCup {

  int nextIndex = 0;


  DiceCup() {
  }

  public void addDie(Die die) { // Vi henter et parameter af typen Object som vi kalder addDie
    if (nextIndex < DiceCupArray.length) {//hvis arrayet ikke er fyldt - fyld en terning i.
      DiceCupArray[nextIndex] = die;
      DiceCupArray[nextIndex].roll();
      println("du har tilføjet en terning på plads: " + nextIndex);
      nextIndex++;
    }
     else//ellers print this.
      println("Du kan ikke tilføje flere terninger");
  }

  public void Remove() {
    if (nextIndex > 0) {
      DiceCupArray[nextIndex-1] = null;
      nextIndex--;
    } else if (nextIndex <= 0) {
      println("Der er ingen terninger i koppen");
      nextIndex=0;
    }
  }

  public void shake() {
    for (int i = 0; i<DiceCupArray.length; i++) {
      if (DiceCupArray[i] != null) {
        DiceCupArray[i].roll();
      }
    }
  }

  public void Draw() {
    for (int i = 0; i<DiceCupArray.length; i++) {
      if (DiceCupArray[i] != null) {
        DiceCupArray[i].Draw(10 + (int)(DiceCupArray[i].dieSize*1.5)*i, 10, 50);
      }
    }
  }
}
