public class Datamatik {
  public static void main(String[] args) { //Bossen fortæller mig hvvordan og hvilke ingredienser jeg skal bruge til at lave min laks.

    Student[] studentList = new Student[10]; //nyt StudentArray med plads til 10 studentern // Opskriften
    studentList[0] = new Student("Morten", 32, false, 'b');  // ingedienserne
    studentList[1] = new Student("Casper", 26, false, 'b');
    studentList[2] = new Student("Mia", 30, true, 'b');
    studentList[3] = new Student("Kristian", 30, false, 'b');
    studentList[4] = new Student("Denis", 38, false, 'b');
    studentList[5] = new Student("Jens", 69, false, 'b');
    studentList[6] = new Student("Long", 27, false, 'b');
    studentList[7] = new Student("Philipp", 27, false, 'b');
    studentList[8] = new Student("Michael", 19, false, 'b');
    studentList[9] = new Student("Sofia", 18, true, 'b');

    System.out.println(printStudent(studentList, 7));
    System.out.println(printStudentIndex(studentList, "Kristian"));


  } // Bossklemme

  public static String printStudent(Student[] studentListToPrint, int studentId){
    String studentPlacement = studentListToPrint[studentId-1].name; // -1 fordi index i listen er 0, men vi vil gerne have nr 1 på listen.

    return studentPlacement;
  } // printStudent

  public static int printStudentIndex (Student[] studentListToPrint, String studentName ){
    int indexToPrint = 0;
    for (int i=0; i<studentListToPrint.length; i++){
      if (studentListToPrint[i].name==studentName){
        indexToPrint += i+1;


      } //if klemme


    } //for klemme
    return indexToPrint;

  } // int printStudentIndex

} //Classklemme
