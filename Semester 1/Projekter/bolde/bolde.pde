int rad, radNew;
int xPos, yPos;
int xPosNew, yPosNew;
int speed, speedNew, speedY, speedYNew;
int acceleration, accelerationNew;
int direction, directionNew;
int directionY, directionYNew;
int colNew;
boolean hitIsTrue = hit();

void setup() {
  size(800, 800);
  rad=width/5;
  xPos=20;
  yPos=200;
  speed=1;
  speedY=1;
  directionY=0;
  direction=1;
  acceleration=1;



  accelerationNew=1;
  directionNew=1;
  directionYNew=1;
  speedNew=1;
  xPosNew=radNew;
  radNew=width/8;
  speedYNew=1;
  xPosNew=(int)random(0, width);
  yPosNew=(int)random(0, height);
}

void draw() {
  background(255);
  move();
  bounce();
  display();
  if(hitIsTrue==true){
  changeDir();
  }
  //first circle
}

void changeDir(){
direction=direction*-1;
directionNew=directionNew*-1;
}

void move() {
  xPos=xPos+(speed*direction);
  yPos=yPos+(speedY*directionY);
  xPosNew=xPosNew+(speedNew*directionNew);
  yPosNew=yPosNew+(speedYNew*directionYNew);
}
void bounce() {
  if (xPos > width || xPos < 0) {
    direction=direction*-1;
  }
  if (yPos > height || yPos < 0) {
    directionY=directionY*-1;
  }
  if (xPosNew > width || xPosNew < 0) {
    directionNew=directionNew*-1;
  }
  if (yPosNew > height || yPosNew < 0) {
    directionYNew=directionYNew*-1;
  }
}
void display() {
  fill(120, 120, 0, 40);
  circle(xPos, yPos, rad);


  //second circle
  fill(colNew, 120, 0, 40);
  circle(xPosNew, yPosNew, radNew);
  noFill();
}

void mousePressed() {
  speed=speed+acceleration;
}

boolean hit() {
  boolean hit = false;
  
  int ifhit = (int)dist(xPos, yPos, xPosNew, yPosNew);
  
  if(ifhit < (rad+radNew)/2)
  hit = true;
  else
  hit = false;
  
  return hit;
  
}

void keyPressed() {
  if (key=='z') {   
    direction=direction*-1;
  }
  if (key=='x') {   
    directionNew=directionNew*-1;
  }
  if (key=='a') {   
    directionY=directionY*-1;
  }
  if (key=='s') {   
    directionYNew=directionYNew*-1;
  }
}
