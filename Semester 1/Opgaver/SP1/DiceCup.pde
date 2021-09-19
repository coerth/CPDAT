Die[] DiceCupArray = new Die[10];

class DiceCup {

  int nextIndex = 0;


  DiceCup() {
  }

  public void addDie(Die die) { // Vi henter et parameter af typen Object som vi kalder addDie
    if (nextIndex < DiceCupArray.length) {//hvis arrayet ikke er fyldt - fyld en terning i.
      DiceCupArray[nextIndex] = die;
      println("du har tilføjet en terning på plads: " + nextIndex);
      nextIndex++;
    }
     else//ellers print this.
      println("Du kan ikke tilføje flere terninger");
  }

  public void shake() {
    for (int i = 0; i<DiceCupArray.length; i++) {
      if (DiceCupArray[i] != null){
      DiceCupArray[i].roll();
      }
    }
  }

  public void Draw() {
    for (int i = 0; i<DiceCupArray.length; i++) {
      if (DiceCupArray[i] != null){
        if(i == 0)
        DiceCupArray[i].Draw(10, 10, 50);
        else
        DiceCupArray[i].Draw(DiceCupArray[i-1].xPosDie+(int)(DiceCupArray[i].dieSize*1.5), 10, 50);
    }
    }
  }
}
