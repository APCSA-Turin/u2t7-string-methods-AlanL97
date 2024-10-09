import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        if (str1.length()>str2.length()) {
            System.out.println(str1 + " is longer");
        } else if (str2.length()>str1.length()) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }
        String strFirstHalf1 = str1.substring(0, (str1.length()/2));
        String strSecondHalf1 = str1.substring(str1.length()/2);
        System.out.println("First Half: " + strFirstHalf1);
        System.out.println("Second Half: " + strSecondHalf1);
        String strFirstHalf2 = str2.substring(0, (str2.length()/2));
        String strSecondHalf2 = str2.substring(str2.length()/2);
        System.out.println("First Half: " + strFirstHalf2);
        System.out.println("Second Half: " + strSecondHalf2);
        if (str1.indexOf(str2)==-1) {
            System.out.println(str2 + " is not found in " + str1);
        } else {
            System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf(str2));
        }
        scan.close();
    }
}
