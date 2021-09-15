//int[] players = new int[4];
int players = 4;
int[] diceRolls = new int[6];
int num = 2;
int guess = 3;
int countGuess = 0;

void setup() {
  size(400, 400);
  /*for(int i = 0; i<players.length; i++){
   }*/
}
void draw() {
}

void keyPressed() {
  if (key == 'a') {
    //player.roll();
    roll();
  }
  if (key == 'b') {
    countGuess = 0;
  }
}

void roll() {
  for (int i = 0; i<players; i++) {
    print("player" + (i+1) + ": ");
    for (int j = 0; j< diceRolls.length; j++ ) {
      diceRolls[j] = (int)random(1, 7);
      print(diceRolls[j] + " ");
      if (diceRolls[j] == num) {
        countGuess++;
      }
    }
    println();
    println();
  }
  println(countGuess);

  if (countGuess < guess)
    println("Du tabte :c");
  else
    println("Du vandt!");
}

/*class Player {
 int[] dices = new int[6];
 String name = "";
 
 Player() {
 for (int i = 0; i < players.length; i++) {
 name = "Player" + (i+1);
 for (int j = 0; j < dices.length; j++) {
 dices[j] = (int)random(1, 7);
 }
 }
 }
 
 void roll() {
 println(name);
 println(dices);
 }
 
 void loseDice() {
 }
 }*/
