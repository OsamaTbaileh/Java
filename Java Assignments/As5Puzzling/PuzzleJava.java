import java.util.Random;
import java.util.ArrayList;
import java.util.*;


public class PuzzleJava{
    Random randMachine = new Random();

    public ArrayList<Object> getTenRolls() {
        ArrayList<Object> myArray = new ArrayList<Object>();
        for(int i=0; i<10; i++) {
            int randomNumber = randMachine.nextInt(20);
            myArray.add(randomNumber);
        }
        return myArray;
    }

    // public int [] getTenRolls() {
    //     int [] myArray = new int[10];
    //     Random myRandom = new Ramdom()
    //     for(int i=0; i<10; i++) {
    //         myArray[i] = myArray.nextInt(0,20):
    //         System.out.println(myArray[i])
    //     }
    //     return myArray
    // }


    public Character randomCharacter( ){
        ArrayList<Character> alpahbet = new ArrayList<Character>();
        for (char c='A' ; c <='Z'; c++){
            alpahbet.add(c);
        }
        int randomNumber = randMachine.nextInt(25);
        char randomCharacter = alpahbet.get(randomNumber);
        return randomCharacter;
    }

    // public String [] getRandomLetter() {
    //     String [] myLetters = {"A", "B", "C"}
    //     Random myAlph = new Rndom();
    // }


    public String createPassword() {
        String pass = "";
        for(int i=0; i<8; i++){
            pass += randomCharacter();
        }
        return pass;
    }


    public ArrayList<String> createWords(int ArrayLength) {
        ArrayList<String> newWords = new ArrayList<String>();
        for (int i=0; i<ArrayLength; i++){
            newWords.add(createPassword());
        }
        return newWords;
    }
}
    