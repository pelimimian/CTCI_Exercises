/*
1.1
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannont use
    additional data structures?

    So for this exercise, I need to create an algorithm using Arrays and Strings.
    According to the book, there is ASCII and Unicode.
        ASCII:
        - Bascially using numbers to represent letters, using binary codes, remember those in college?
        - Actually a subset of Unicode.
        - Has 128 characters (127 bits)
        Unicode:
        - Can represents letters, symbols and emojis
        -Has over 2 billion characters
*/

public boolean checkIfUnique (String input) {

    if (input.length() > 128){
        return false;
    }

    boolean [] char_set = new boolean[128]; //Array of boolean values
    for (int i = 0; i < input.length(); i++){
        int val = input.charAt(i); //val is the ASCII code for each letter found(these are numbers)
        if(char_set[val]){ //If there is a boolean value present in the "val" location boolean array, return false.
            return false;
        }
        char_set[val] = true; //Set boolean value true in that postion in the boolean array.
    }

    return true;
}