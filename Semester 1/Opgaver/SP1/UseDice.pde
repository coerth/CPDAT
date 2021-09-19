DiceCup DC= new DiceCup();

void setup() {
  size(1200, 800);
}

void draw() {
  for(int i = 0; i<DiceCupArray.length; i++){
  if (DiceCupArray[i] != null)
    DC.Draw();
  }  
}

void keyPressed() {
  color randomEyeColor;
  randomEyeColor = color(random(255), random(255), random(255));
  color randomDieColor;
  randomDieColor = color(random(255), random(255), random(255));
  if (key == ENTER){
    if(DiceCupArray[0] != null)
    DC.shake();
    else
    println("din kop er tom");
  }
  

  if (key == 'b'){
    DC.addDie(new Die(randomEyeColor, randomDieColor));
  }
  
  if (key == 'c'){
  }
}
