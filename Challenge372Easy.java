// Challenge #372: Given a string containing only the characters x and y, find whether there are the same number of x's and y's.
// Example: balanced("xxxyyy") => true, balanced("xxxyyyy") => false, balanced("") => true, balanced("x") => false

class Challenge372Easy {
  
    public boolean balanced (String input) {
        int numX = 0;
        int numY = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("x")) {
                numX++;
            } else {
                numY++;
            }
        }
        return numX == numY;
    }
}
