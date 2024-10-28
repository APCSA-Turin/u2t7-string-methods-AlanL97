public class Main {
   public static void main(String[] args) {
    CustomStringMethods methods = new CustomStringMethods();
    boolean bool = methods.longerThan("burger", 4);
    System.out.println(bool);
    String str = methods.funnyString("pizza", 3);
    System.out.println(str);
    str = methods.halvesReversed("banana");
    System.out.println(str);
    str = methods.pigLatin("sandwich");
    System.out.println(str);
    str = methods.removeCharacter("chicken", 4);
    System.out.println(str);
    str = methods.insertAt("carrot", "hi", "r");
    System.out.println(str);
    str = methods.endUp("cake", 2);
    System.out.println(str);
    str = methods.yellOrWhisper("Fried fish");
    System.out.println(str);
    }
}
