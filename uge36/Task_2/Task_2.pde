String name = "Casper";
int age = 26;
boolean happy = true;
void setup() {
  size(200, 200);
}

void draw() {
  if (keyPressed) {
    if (key == 'a') {
      happy = !happy;
    }
  }

  if (happy == true) {
    println("Hi, my name is " + name);
    println("I am " + age + " years old");
    println("I clap my hands");
  } else if (happy == false) {
    println("Hi, my name is " + name);
    println("I am " + age + " years old");
    println("I dont clap my hands");
  }
}
