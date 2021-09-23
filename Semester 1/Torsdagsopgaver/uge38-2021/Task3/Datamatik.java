public class Datamatik{

  public static void main(String[] args) {
    Teacher teacher = new Teacher("William", 30, false);
    Student student1 = new Student("Casper", 26, false, 'b');
    Student student2 = new Student("Mia", 30, true, 'b');
    System.out.println(teacher.name);
    System.out.println(teacher.age);
    if(teacher.isFemale){
    System.out.println("Kvinde");
    }
    else{
      System.out.println("Mand");
    }
    System.out.println(student1.name);
    System.out.println(student1.age);
    if(student1.isFemale){
    System.out.println("Kvinde");
    }
    else{
      System.out.println("Mand");
    }
    System.out.println(student1.datamatikerTeam);
    System.out.println(student2.name);
    System.out.println(student2.age);
    if(student2.isFemale){
    System.out.println("Kvinde");
    }
    else{
      System.out.println("Mand");
    }
    System.out.println(student2.datamatikerTeam);


  }

}
