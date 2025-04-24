/*
 * filename: TreeMapExercise.java
 * author: Ashya
 * prompt: given a sentence input by the user, convert to lowercase, strip
 * punctuation, split into words. use a TreeMap<String, Integers> to
 * count word frequency. display each word and its frequency 
 * sorted alphabetically 
 */

 import java.util.TreeMap;
 import java.util.Scanner;

 public class TreeMapExercise {
     public static void main (String[] args) {
        System.out.println("The Word Counter!");

        Scanner scanner = new Scanner(System.in);
        // getting user's input
        System.out.println("Please enter a sentence: ");
        String text = scanner.nextLine();
        scanner.close();
        
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
     }
 }