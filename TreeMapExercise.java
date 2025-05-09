/*
 * author: Ashya
 * filename: TreeMapExercise.java
 * description: 
 */

 import java.util.TreeMap;
 import java.util.Scanner;

 public class TreeMapExercise {
     public static void main (String[] args) {
        System.out.println("\n --- Welcome to my word counter! ---");

        Scanner scanner = new Scanner(System.in);

        boolean runAgain = true;
        while (runAgain) {
            System.out.println("Please enter a sentence: ");
            String text = scanner.nextLine();
            // getting the user's input

            text = text.replace(".", "");
            text = text.replace(",", "");
            text = text.toLowerCase();
            // remove punctuation and change to lowercase
            String[] words = text.split(" ");
            // split into words
 
            TreeMap<String, Integer> wordMap = new TreeMap<>();
            // creating the map
 
            for (String word : words) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
            // word count frequency

            for (var entry : wordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println("Would you like to enter another sentence?");
            String choice = scanner.nextLine().trim().toLowerCase();
            runAgain = choice.startsWith("y");
            // wanting to change this part above

            if (!runAgain) {
                System.out.println("Thank you, see you later!");
            }
            // asking if the user wants to use the program again
        }

        scanner.close();
     }
 }