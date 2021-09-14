Player[] players = new Player[4];
int guess = 3;
int num = 5;
int countGuess = 0;


void setup() {
  for (int i = 0; i<players.length; i++) {
    players[i] = new Player((i+1));
    print(players[i].name + ": ");
    for(int j = 0; j<players[i].dices.length; j++){
    print(players[i].dices[j] + " ");
    if(players[i].dices[j] == num){
    countGuess++;
    }
    }
    println();
    println();
  }
  println(countGuess);
    if(countGuess < guess)
    println("du tabte..");
    else
    println("Tillykke!");
  /*print(player.name);
   println(player.dices);*/
}

void draw() {
}

void keyPressed() {
  if (key == 'a') {
  }
}

public class Player {
  int[] dices = new int[6];
  String name = "";

  Player(int player) {
    name = "Player " + player;
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int)random(1, 7);
    }
  }

  void roll() {
  }

  void loseDice() {
  }
}
