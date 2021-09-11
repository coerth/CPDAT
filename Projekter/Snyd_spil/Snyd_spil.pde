int players = 4;
int[] diceRolls = new int[6];
int num = 2;
int guess = 7;
int countGuess = 0;

void setup() {
  size(400, 400);
}
void draw() {
}

void keyPressed() {
  if (key == 'a') {
    roll();
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
