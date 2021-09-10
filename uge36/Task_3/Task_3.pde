color red = #ff0000;
color yellow = #ffff00;
color green = #00ff00;
color off = #808080;
int counter = 0;


void setup() {
  frameRate(5);
  size(500, 500);
  rectMode(CENTER);
  fill(0);
  rect(250, 250, 250, 400);
}

void draw() {
  fill(off);
  circle(250, 130, 100);
  circle(250, 250, 100);
  circle(250, 370, 100);
  
  if(counter == 4){
    counter = 1;
  } else{
    counter++;
  }
  
  switch(counter){
    case 1:
      fill(red);
      circle(250, 130, 100);
      break;
    case 2:
      fill(red);
      circle(250, 130, 100);
      fill(yellow);
      circle(250, 250, 100);
      break;
    case 3:
      fill(green);
      circle(250, 370, 100);
      break;
    case 4:
      fill(yellow);
      circle(250, 250, 100);
      break;
  }
  println(counter);
  delay(500);
}
