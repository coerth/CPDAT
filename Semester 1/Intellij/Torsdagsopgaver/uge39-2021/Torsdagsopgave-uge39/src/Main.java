import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        //System.out.println(printLongestWord());
        //printFirstHalfOfEachWord();
        //printMostFrequentLetter();
        printMostFrequentLetter();
        printLessFrequentLetter();
    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    private static String printLongestWord(){
        int howLong = 0;
        String longestWord = "";
        int indexOf = 0;
        for(String s : text){
            if(s.length() > howLong){
                longestWord = s;
                howLong = longestWord.length();

                if(longestWord.contains(".")){
                    indexOf = longestWord.indexOf(".");
                    longestWord = longestWord.substring(0, indexOf);
                    howLong = longestWord.length();
                } else if(longestWord.contains(",")){
                    indexOf = longestWord.indexOf(",");
                    longestWord = longestWord.substring(0, indexOf);
                    howLong = longestWord.length();
                }
            }
        }
        return longestWord;
    }//Task1

    private static void printFirstHalfOfEachWord() {
        for(String s : text){
            System.out.println(s.substring(0, s.length()/2));
        }
    }//Task2

    public static void printMostFrequentLetter(){
        ArrayList<Letteroccurence> letterArray = new ArrayList<>();
        int charCounter = 0; // counter brugt for hvert bogstav
        String checkText = ""; //nem løsning for at tjekke hele string arrayet
        int sortCounter = 0;

        //for hvert ord i String arrayet, læg det ord til vores checkText string
        for (String s : text) {
            checkText += s.toLowerCase(Locale.ROOT); // Gør alle bogstaver til lowercase
        }
        //for loop som kører igennem hvert bogstav i alfabetet og kører endnu en for loop som tjekker vores checkText
        // for det bogstav vi er nået til og adder til counteren når vi når dertil. Den tager ikke æ ø og å,
        // men har lavet en føler på at det ikke er en af de bogstaver der forekommer hyppigst.
        for(char letter = 'a'; letter <= 'z'; letter++ ){

            for(int i = 0; i < checkText.length(); i++){
                if(checkText.charAt(i) == letter){
                    charCounter++;
                    //System.out.println(s);
                }
            }
            //når tjekket efter et specifikt bogstav er færdigt og der er fundet værdi på counteren over 0,
            // print bogstavet + counter ud

            if(charCounter > 0){
                letterArray.add(new Letteroccurence(letter,charCounter) );
                //System.out.println(letter + "=" + charCounter);
                charCounter = 0;
            }
            sortCounter++;
            if(sortCounter == 25){
                Collections.sort(letterArray);
                System.out.println("Top 10 for størst hyppighed. Æ,Ø,Å er ikke inkluderet");


                for(int i = letterArray.size()-1; i > letterArray.size()-11 ; i--){
                    System.out.println(letterArray.get(i).getTheCharacter() + " = " + letterArray.get(i).getNumberOfOccurences());
                }
            }
        }
    }//Task3

    public static void printLessFrequentLetter(){
        ArrayList<Letteroccurence> letterArrayLess = new ArrayList<>();
        int charCounter = 0; // counter brugt for hvert bogstav
        String checkText = ""; //nem løsning for at tjekke hele string arrayet
        int sortCounter = 0;
        for (String s : text) {//for hvert ord i String arrayet, læg det ord til vores checkText string
            checkText += s.toLowerCase(Locale.ROOT); // Gør alle bogstaver til lowercase
        }
        //for loop som kører igennem hvert bogstav i alfabetet og kører endnu en for loop som tjekker vores checkText
        // for det bogstav vi er nået til og adder til counteren når vi når dertil. Den tager ikke æ ø og å,
        // men har lavet en føler på at det ikke er en af de bogstaver der forekommer hyppigst.
        for(char letter = 'a'; letter <= 'z'; letter++ ){

            for(int i = 0; i < checkText.length(); i++){
                if(checkText.charAt(i) == letter){
                    charCounter++;
                    //System.out.println(s);
                }
            }
            //når tjekket efter et specifikt bogstav er færdigt og der er fundet værdi på counteren over 0,
            // print bogstavet + counter ud

            if(charCounter > 0){
                letterArrayLess.add(new Letteroccurence(letter,charCounter) );
                //System.out.println(letter + "=" + charCounter);
                charCounter = 0;
            }
            sortCounter++;
            if(sortCounter == 26){
                Collections.sort(letterArrayLess);
                System.out.println("Top 10 for mindst hyppighed. Æ,Ø,Å er ikke inkluderet");

                for(int i = 0; i< 10; i++){
                    System.out.println(letterArrayLess.get(i).getTheCharacter() + " = " + letterArrayLess.get(i).getNumberOfOccurences());
                }
            }
        }
    }//Task4
}