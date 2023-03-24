package decagonDev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoCorrect {


//      You've been tasked with writing an autocorrect service for messages sent by your legal team.
//      The messages which are sent to other lawyers need to be updated so that each message sent
//      references the lawyer's client for clarity. To do this you need to replace all instances of "you" and
//      its misspellings with "your client".
//
//      Complete the function so that it takes a string and replaces all instances of "you", "youuu", or "u"
//      (not case sensitive) with "your client" (always lower case).
//
//      Return the resulting string.
//
//      The Catch
//      Here's the slightly tricky part: These are informal messages, so there are different forms of "you" and "u".
//
//      For the purposes of this task, here's what you need to support:
//
//      "youuuuu" with any number of "u" characters tacked onto the end
//      "u" at the beginning, middle, or end of a string, but NOT part of a word
//      "you" but NOT as part of another word like "young" or "Bayou"



    public static String autocorrectM(String message) {
        // create a regular expression pattern to match "you" and "u" at the beginning, middle, or end of a string, but not part of a word
        String pattern = "(\\b|^)u(\\b|$)|(\\b|^)you+\\b";
        // create a pattern object
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        // create a matcher object
        Matcher m = p.matcher(message);
        // replace all matches with "your client"
        return m.replaceAll("your client");
    }

    public static String autocorrect(String input) {
        // Not case sensitive
        // you, youuuu, u

        // split into array of strings
        // loop
        // if length of a string is singular, check if it is u
        // else
        // find the index of you
        // young => you .... ng (are they all uuus)

        String[] words = input.split(" ");
        boolean endWithFullStop = words[words.length - 1].endsWith(".");

        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if(len == 1) {
                if(words[i].equalsIgnoreCase("u")) {
                    words[i] = "your client";
                }
            } else {
                if (words[i].toLowerCase().startsWith("you")){
                    String otherWords = words[i].substring(2, len);
                    String otherWordsWithoutU = otherWords.replace("u",  "");
                    if(otherWordsWithoutU.equals("") || otherWordsWithoutU.equals(".")) {
                        words[i] = "your client";
                    }
                }
            }
        }

        String result = String.join(" ", words);

        return endWithFullStop ? result.concat(".") : result;
    }

    public static void main(String[] args) {
        var result = autocorrect("u are you no matter what they tell you");
        System.out.println("Result is :" + result);
    }
   public  static void binarySearch(int arr[], int toFind)
    {
        int low = 0, high = arr.length - 1;

        while (high - low > 1) {
            int mid = (high + low) / 2;
            if (arr[mid] < toFind) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        if (arr[low] == toFind) {
            System.out.println("Found At Index " + low );
        }
        else if (arr[high] == toFind) {
            System.out.println("Found At Index " + high );
        }
        else {
            System.out.println("Not Found" );
        }
    }

}
