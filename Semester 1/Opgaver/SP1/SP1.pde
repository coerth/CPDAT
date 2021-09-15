Die terning1 = new Die(255, 0);

void setup() {
  size(640, 640);
  rectMode(CENTER);
  
}

void draw() {
  terning1.Draw(50, 50, 50);
}

void keyPressed() {
  if (key == 'a')
  terning1.roll();
  }

class Die {
  int eyes;
  Die(color die, color eyes) {
    fill(die);
    fill(eyes);
  }

  public int roll() {
    int eyes = (int)random(1, 7);
    this.eyes = eyes;
    return eyes;
  }

  void Draw(int x, int y, int size) {
    rect(x, y, size, size, 5);
    for (int i = 1; i<=eyes; i++) {
      println(i);
    }
  }
}
