Player[] players = new Player[4];


void setup() {
  for (int i = 0; i<players.length; i++) {
    players[i] = new Player((i+1));
    print(players[i].name);
    println();
    println();
  }
  /*print(player.name);
   println(player.dices);*/
}

void draw() {
}

void keyPressed() {
  if (key == 'a') {
    players[0].roll();
    println();
    println();
    players[1].roll();
    println();
    println();
    players[2].roll();
    println();
    println();
    players[3].roll();
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
    for (int i = 0; i < dices.length; i++) {
      print(dices[i] + " ");
    }
  }

  void loseDice() {
  }
}
