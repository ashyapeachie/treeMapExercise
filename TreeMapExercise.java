/*
 * filename: TreeMapExercise.java
 * author: Ashya
 * prompt: given a sentence input by the user, convert to lowercase, strip
 * punctuation, split into words. use a TreeMap<String, Integers> to
 * count word frequency. display each word and its frequency 
 * sorted alphabetically 
 */

 import java.util.TreeMap;

 public class TreeMapExercise {
     public static void main (String[] args) {
         System.out.println("The Word Counter!");
         String text = "And you might be the one to take away the pain, and let my mind go quiet";
         // user input
 
         text = text.replace(".", "");
         text = text.replace(",", "");
         text.toLowerCase();
         // remove punctuation and change to lowercase
         String[] words = text.split(" ");
 
         var wordMap = new TreeMap<String,Integer>();
         int count;
 
         for (String word : words) {
             if (wordMap.containsKey(word)) {
                 count = wordMap.get(word);
                 count++;
                 wordMap.put(word, count);
             } else {
                 wordMap.put(word, 1);
                 // new word
             }
 
             for (var entry : wordMap.entrySet()) {
                 System.out.println(entry.getKey() + ": " + entry.getValue());
             }
         }
     }
 }