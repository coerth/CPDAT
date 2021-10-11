//Opretter min class, for terningen
class Die {
  int dieSize;
  int xPosDie;
  int yPosDie;
  color eyeColor;
  color dieColor;
  int eyes;

  //opretter min constructor som får 2 farver ind
  public Die(color eyeColor, color dieColor) {
    // jeg bruger this for at trække min constructer parametre ud så jeg kan bruge dem globalt til min class
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }

  public int roll() {//min funktion roll, som giver min terning et tilfældigt nummer fra 1 til
    eyes = (int)random(1, 7);
    return eyes;
  }
  //vi tegner vores terning med en størrelse, på (x,y)
  //vi bruger en void da vi ikke skal returnere en værdi
  void Draw(int xPosDie, int yPosDie, int dieSize) {
    this.dieSize = dieSize;
    this.xPosDie = xPosDie;
    this.yPosDie = yPosDie;
    fill(dieColor);
    rect(xPosDie, yPosDie, dieSize, dieSize, 15);

    switch(eyes) {
    case 1:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      println("case" +1);   // Der er sat println() for at vise os om den rammer den rigtige case ift øjnene på terningen.
      break;
    case 2:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      println("case" +2);
      break;
    case 3:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      println("case"+ 3);
      break;
    case 4:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      println("case" + 4);
      break;
    case 5:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      println("case" +5);
      break;
    case 6:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.25, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.75, dieSize*0.20);
      circle(xPosDie+dieSize*0.25, yPosDie+dieSize*0.50, dieSize*0.20);
      circle(xPosDie+dieSize*0.75, yPosDie+dieSize*0.50, dieSize*0.20);
      println("case" +6);
      break;
    default:
      fill(eyeColor);
      circle(xPosDie+dieSize*0.50, yPosDie+dieSize*0.50, dieSize*0.20);
      break;
    }
  }
}
