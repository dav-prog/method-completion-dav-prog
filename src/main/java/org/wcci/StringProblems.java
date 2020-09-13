package org.wcci;

public class StringProblems {

    /*
     * smallestStringSorter()
     *
     * Given two strings, stringA and stringB, return the smallest string, however, if one of the strings has a length
     * of 0, return the other string.  If both strings are the same length, return a new string mashing stringA and
     * stringB together.
     *
     * Examples:
     * - smallestStringSorter("two", "fifteen") -> "two"
     * - smallestStringSorter("", "tomorrow") -> "tomorrow"
     * - smallestStringSorter("zizzer", "zazzer") -> "zizzerzazzer"
     */

    public String smallestStringSorter(String stringA, String stringB) {
        // if stringA.length > stringB.length
        // if stringA.length == stringB.length
        //
        int str1 = stringA.length();
        int str2 = stringB.length();

        if(stringA.equals("")){
            return stringB;
        }
        else if(stringB.equals("")) {
            return stringA;
        }
        else if(str1 < str2){
            return stringA;
        }
        else if(str2 < str1){
            return stringB;
        }
        else
            return stringA + stringB;

        }

        /* int compare1 = stringA.compareTo(stringB);
        int compare2 = stringB.compareTo(stringA);

         if(compare1 == 1 || compare2 == -1){
           return stringB;
        }
        else if(compare2 == 1 || compare1 == -1){
            return stringA;
        }else if(stringA.length() == stringB.length()){
            return stringA + stringB;
        }

        if (stringA.length() > stringB.length()) {
           return stringB;
        } else if (stringB.length() > stringA.length()) {
          return stringA;
        }
        else if (stringA.length() == 0) {
          return stringB;
        }else if(stringB.length() == 0){
           return stringA;
        } else if (stringA.length() == stringB.length()) {
           return stringA + stringB;
        }else
            return stringA;
        */


    /*
     * evenUpperCaseOrOddLowerCase()
     *
     * Given a string, str, transform the string's characters to upper case characters if the length is even or lower
     * case if the length is odd.
     *
     * Examples:
     * - evenUpperCaseOrOddLowerCase("Hello") -> "hello"
     * - evenUpperCaseOrOddLowerCase("Zizzer Zazzer Zuzz") -> "ZIZZER ZAZZER ZUZZ"
     */
    public String evenUpperCaseOrOddLowerCase(String str) {
        // find if odd or even. if str % 2 = 0
        //upper and lower case

        if(str.length() % 2 == 0){
            return str.toUpperCase();
        }
        return str.toLowerCase();
    }



    /*
     * stringCombiner()
     *
     * Given two strings, stringA and stringB, return a new string that combines the two strings, but the strings should
     * be combined in ascending alphabetically order.
     *
     * Examples:
     * - stringCombiner("Hello", "There") -> "HelloThere"
     * - stringCombiner("Zizzer" "zazzer") -> "zazzerZizzer"
     */
    public String stringCombiner(String stringA, String stringB) {

        int compare1 = stringA.compareToIgnoreCase(stringB);
        int compare2 = stringB.compareToIgnoreCase(stringA);

        if (compare1 < compare2)
            return stringA + stringB;

        else if (compare1 > compare2)
            return stringB + stringA;

        return null;


    }

    /*
     * left2()
     * Given a string, str, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length
     * will be at least 2.
     *
     * Examples:
     * - left2("Hello") → "lloHe"
     * - left2("java") → "vaja"
     * - left2("Hi") → "Hi"
     */

    public String left2(String str) {
        //establish the left2
        if (str.length() > 2) {
            String left = str.substring(0, 2);
            String right = str.substring(2,str.length());
            return right + left;
        } else
            return str;
    }


}
