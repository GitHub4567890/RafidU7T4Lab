import java.util.ArrayList;
import java.util.Arrays;
public class TheBestRunnerClass {
    public static void main(String[] args) {
// YOU NEED TO import java.util.Arrays
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);

        System.out.println();

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);

        System.out.println();

        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        ArrayListAlgorithms.replaceWithCaps(stringList2);
        System.out.println(stringList2);

        ArrayList<String> stringList12 = new ArrayList<String>(Arrays.asList("yes", "pass", "buts", "Mets", "Yankees"));
        ArrayListAlgorithms.replaceWithCaps(stringList12);
        System.out.println(stringList12);

        ArrayList<String> stringList13 = new ArrayList<String>(Arrays.asList("yeah", "pat", "but", "Met", "Yankee"));
        ArrayListAlgorithms.replaceWithCaps(stringList13);
        System.out.println(stringList13);

        System.out.println();

        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int index = ArrayListAlgorithms.indexOfMinimum(intList4);
        System.out.println(index);
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(6, 8, 3, 5, 6, 3, 2, 3, 2));
        index = ArrayListAlgorithms.indexOfMinimum(intList5);
        System.out.println(index);
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(10, 12, 9, 9, 8));
        index = ArrayListAlgorithms.indexOfMinimum(intList6);
        System.out.println(index);

        System.out.println();

        ArrayList<Integer> intList7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> intList9 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6));
        ArrayList<Integer> intList10 = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 4, 6));
        boolean identical = ArrayListAlgorithms.areIdentical(intList7, intList8);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList8, intList9);
        System.out.println(identical);
        identical = ArrayListAlgorithms.areIdentical(intList9, intList10);
        System.out.println(identical);

        System.out.println();

        ArrayList<Integer> intList11 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayListAlgorithms.removeOdds(intList11);
        System.out.println(intList11);
        ArrayList<Integer> intList12 = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayListAlgorithms.removeOdds(intList12);
        System.out.println(intList12);
        ArrayList<Integer> intList13 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayListAlgorithms.removeOdds(intList13);
        System.out.println(intList13);

        System.out.println();

        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("these", "sly", "words", "pork", "ugly", "you", "contains", "umm", "by", "several", "sky", "words", "psh", "apple"));
        ArrayListAlgorithms.wackyVowels(stringList3);
        System.out.println(stringList3);

        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("sly", "ugly", "umm", "psh"));
        ArrayListAlgorithms.wackyVowels(stringList4);
        System.out.println(stringList4);

        ArrayList<String> stringList5 = new ArrayList<String>(Arrays.asList("these", "words", "pork", "contains"));
        ArrayListAlgorithms.wackyVowels(stringList5);
        System.out.println(stringList5);

        System.out.println();

        ArrayList<String> stringList6 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperAfter(stringList6);
        System.out.println(stringList6);

        System.out.println();

        ArrayList<String> stringList7 = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend"));
        ArrayListAlgorithms.duplicateUpperEnd(stringList7);
        System.out.println(stringList7);

        System.out.println();

        String mySentence = "This is my sentence!";
        ArrayList<String> reversedWords = ArrayListAlgorithms.parseWordsAndReverse(mySentence);
        System.out.println(reversedWords);

        String mySentence2 = "It is a lovely day outside today don't you think?";
        ArrayList<String> reversedWords2 = ArrayListAlgorithms.parseWordsAndReverse(mySentence2);
        System.out.println(reversedWords2);

        String mySentence3 = "Hello";
        ArrayList<String> reversedWords3 = ArrayListAlgorithms.parseWordsAndReverse(mySentence3);
        System.out.println(reversedWords3);

        System.out.println();

        ArrayList<Integer> intList14 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 4, 5, 2, 2, 1, 6, 4, 4, 7, 1, 8, 4, 2));
        ArrayListAlgorithms.removeDuplicates(intList14);
        System.out.println(intList14);
        ArrayList<Integer> intList15 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 1, 1, 1, 1, 3, 2, 1, 2, 2, 4, 3));
        ArrayListAlgorithms.removeDuplicates(intList15);
        System.out.println(intList15);
        ArrayList<Integer> intList16 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListAlgorithms.removeDuplicates(intList16);
        System.out.println(intList16);

        System.out.println();

        ArrayList<String> myWordList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList);
        System.out.println(myWordList);

        ArrayList<String> myWordList2 = new ArrayList<String>(Arrays.asList("apple", "cherry", "donut", "danish", "soda", "banana", "bagel",  "berry", "baguette"));
        ArrayListAlgorithms.moveBWords(myWordList2);
        System.out.println(myWordList2);

        ArrayList<String> myWordList3 = new ArrayList<String>(Arrays.asList("banana", "bagel",  "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"));
        ArrayListAlgorithms.moveBWords(myWordList3);
        System.out.println(myWordList3);

        System.out.println();

        int[] intList18 = {1, 2, 3, 2, 4, 5, 5, 6};
        ArrayList<Integer> modes = ArrayListAlgorithms.modes(intList18);
        System.out.println(modes);

        int[] intList19 = {1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7};
        ArrayList<Integer> modes2 = ArrayListAlgorithms.modes(intList19);
        System.out.println(modes2);

        int[] intList20 = {1, 2, 1, 2, 4, 1, 2, 4, 1, 1, 3};
        ArrayList<Integer> modes3 = ArrayListAlgorithms.modes(intList20);
        System.out.println(modes3);

        int[] intList21 = {1, 2, 3, 4, 3, 2, 1, 4, 1, 2, 3};
        ArrayList<Integer> modes4 = ArrayListAlgorithms.modes(intList21);
        System.out.println(modes4);

        // all numbers appear 1 time
        int[] intList22 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes5 = ArrayListAlgorithms.modes(intList22);
        System.out.println(modes5);

        // all numbers appear 3 times
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes6 = ArrayListAlgorithms.modes(intList23);
        System.out.println(modes6);

        // this one has an extra 7, so 1, 2, 3, 4, 5, and 6 are all modes!
        int[] intList24 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes7 = ArrayListAlgorithms.modes(intList24);
        System.out.println(modes7);

    }
}


//    ArrayList<String> names = new ArrayList<String>();
//        names.add("Jesse");
//                names.add("Bart");
//                names.add("David");
//                names.add("Abigail");
//                names.add("Frank");
//                names.add("Steph");
//                names.add("Thomas");
//                names.add("Jimmy");
//                names.add("Joe");
//                names.add("Klein");
//                names.add("Daisy");
//
//                System.out.println("BEFORE: " + names);
//
//                // write a loop below to traverse names and REMOVE each name that
//                // is exactly 5 letters
//                for (int i = 0; i <= names.size() - 1; i++) {
//                if (names.get(i).length() == 5) {
//                names.remove(names.get(i));
//                i--;
//                }
//                }
//
//
//                System.out.println("AFTER: " + names);



//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Jessica");
//        names.add("Abby");
//        names.add("Emily");
//        names.add("Destiny");
//        names.add("Mateo");
//        names.add("Sofia");
//        names.add("Tim");
//        names.add("James");
//        names.add("Jim");
//
//        System.out.println("BEFORE: " + names);
//
//        // write a loop below to traverse names and insert "hi!" after any
//        // name that contains the letter "i"
//        int nameSize = names.size() - 1;
//        for (int i = nameSize; i >= 0; i--) {
//            if (names.get(i).contains("i")) {
//                names.add(i + 1, "hi!");
//            }
//        }
//
//        System.out.println("AFTER: " + names);
//
//        // "Frank's" solution
//
//        System.out.println("BEFORE: " + names);
//
//        for (int i = 0; i < names.size(); i++) {
//            if (names.get(i).indexOf("i") != -1) {
//                names.add(i + 1, "hi!");
//            }
//        }
//
//        System.out.println("AFTER: " + names);