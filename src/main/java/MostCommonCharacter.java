import java.util.HashMap;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key
     *  to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
     // Handle the case when the input string is empty
     if (str == null || str.isEmpty()) {
     throw new IllegalArgumentException("Input string cannot be null or empty");
     }

   // Create a HashMap to store character frequencies
   HashMap<Character, Integer> frequencyMap = new HashMap<>();

  // Populate the HashMap with character frequencies
 for (char c : str.toCharArray()) {
  frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);    }
    // Determine the most common character
  char mostCommonChar = str.charAt(0);
    int maxCount = 0;
 for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
   if (entry.getValue() > maxCount) {
      mostCommonChar = entry.getKey();
       maxCount = entry.getValue();
       }
        }
          return mostCommonChar;
      }
   public static void main(String[] args) {
   MostCommonCharacter mcc = new MostCommonCharacter();
    String testStr = "hello world";
    System.out.println("Most common character: " + mcc.recurringChar(testStr));
      }}