void setup() {
  MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line.

  int max = 10;

  if (i > max)
  {
    String output = "i is greater than "+max+".";
    println(output);
  }
}

/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */
void MethodTwo()
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;
  if (keyPressed) {
    if (key == 'a') {
      if (weekDay >= 6) {
        weekDay = 0;
      } else {
        weekDay++;
      }
    }
  }
  if (weekDay < 5)
  {
    weekend = false;
  } else
  {
    weekend = true;
  }

  // Print the name of the weekday here:
  if (weekDay == 0)
    println("It's Monday... YAWN!");
  else if (weekDay == 1)
    println("Today its Tuesday..");
  else if (weekDay == 2)
    println("It's Wednsday mah dudes!");
  else if (weekDay == 3)
    println("Its almost weekend because its Thursday");
  else if (weekDay == 4)
    println("ITS FRIDAY!!!!!");
  else if (weekDay == 5)
    println("Saturday");
  else if (weekDay == 6)
    println("Sunday");
  else
    println("dage eksistere ikke.");
    // Print if it is weekend here:
    
  if(weekend == true)
    println("it's weekend!");
  else
    println("its not weekend:(");
  }
