/*for(int i = 0; i<=20; i++){
  println(i);
}*/

/*for(int i = 0; i<=20; i++){
  if ((i & 1) == 0)
    println(i);
  else
    println("This is not an even number");
}*/

int counter = 0;

while(counter <= 20){
  if ((counter & 1) == 0)
    println(counter);
  else
    println("This is not an even number");
    
  counter++;
}
