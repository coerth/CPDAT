public class Letteroccurence implements Comparable<Letteroccurence> {


    private char theCharacter;
    private int numberOfOccurences;

    public Letteroccurence(char theCharacter, int numberOfOccurences) {
        this.theCharacter = theCharacter;
        this.numberOfOccurences = numberOfOccurences;
    }

    public char getTheCharacter() {
        return theCharacter;
    }

    public int getNumberOfOccurences() {
        return numberOfOccurences;
    }


    // @Override
    public int compareTo(Letteroccurence otherLetter) {
        return this.numberOfOccurences - otherLetter.numberOfOccurences;
    }
}