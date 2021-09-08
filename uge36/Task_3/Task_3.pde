color red = #ff0000;
color yellow = #ffff00;
color green = #00ff00;
color off = #808080;
int counter = 0;
boolean redLight = true;
boolean yellowLight = false;
boolean greenLight = false;

void setup() {
  frameRate(10);
  size(500, 500);
  rectMode(CENTER);
  rect(250, 250, 250, 400);
}

void draw() {
  if (redLight == true) {
    fill(red);
  } else {
    fill(off);
  }
  circle(250, 130, 100);
  if (yellowLight == true) {
    fill(yellow);
  } else {
    fill(off);
  }
  circle(250, 250, 100);
  if (greenLight == true) {
    fill(green);
  } else {
    fill(off);
  }
  circle(250, 370, 100);

  while (counter <= 100) {
    if (counter <= 40) {
      redLight = true;
      yellowLight = false;
      greenLight = false;
    } else if (counter > 40 && counter <= 50) {
      redLight = false;
      yellowLight = true;
      greenLight = false;
    } else if (counter > 50 && counter <= 100) {
      redLight = false;
      yellowLight = false;
      greenLight = true;
    } else {
      redLight = false;
      yellowLight = false;
      greenLight = false;
    }
    println(counter);
    counter++;
  }
}
