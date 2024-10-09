package U2T7_P2_MoreStringMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        int words = 1;
        String preStr = scan.nextLine();
        String curStr;
        int points = 0;
        
        while(true) {
            System.out.print("Enter next word: ");
            curStr = scan.nextLine();
            words++;

           if (curStr.compareTo(preStr)>0) {
            points += 2;
            System.out.println("+2 points: current word alphabetically after; SCORE: " + points);
           }

           if (curStr.compareTo(preStr)<0) {
            points -=5;
            System.out.println("-5 points: current word is alphabetically before; SCORE: " + points);
           }

           if (curStr.equals(preStr)) {
            points -= 10;
            System.out.println("-10 points: current word is same; SCORE: " + points);
           }

           if (curStr.substring(0, 2).equals(preStr.substring(preStr.length()-2))) {
            points += 5;
            System.out.println("+5 points: last two letters of previous match first two letters of current; SCORE: " + points);
           }

           if (curStr.indexOf(preStr.substring(0, 1))>=0) {
            points += 3;
            System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + points);
           }

           if (curStr.length()==preStr.length()) {
            points += 2;
            System.out.println("+2 points: current word same length as previous word; SCORE: " + points);
           }

           if (points>=50) {
            System.out.println("You win! It took you " + words + " words! Try again for a lower word count :)");
            scan.close();
            return;
           }
           preStr = curStr;
        }
    }
}
