/*Lab9: Word Search generator
*/
// imports
import java.io.*;
import java.util.*;

public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded = new ArrayList<String>();

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols, String fileName){
      data = new char[rows][cols];
      this.clear();
      Random rng = new Random();
      seed = rng.nextInt();
      randgen = new Random(seed);
      addAllWords(fileName);
    }

    public WordSearch(int rows, int cols, String fileName, int seed) {
      data = new char[rows][cols];
      this.clear();
      this.seed = seed;
      randgen = new Random(seed);
      addAllWords(fileName);
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String ans = "";
      for (int i = 0; i < data.length; i++) {
        for (int j = 0; j < data[i].length; j++){
          ans += data[i][j];
          if (data[i].length-1 != j) {
            ans += " ";
          }
        }
        ans += "\n";
      }
      ans += "Words: ";
      for (int i = 0; i < wordsAdded.size(); i++) {
        ans += "" + wordsAdded.get(i);
        if (wordsAdded.size()-1 != i) {
          ans += ", ";
        }
      }
      ans += "\nseed: " + seed;
      return ans;
    }

    private void addAllWords(String filename) {
      int iCol, iRow, r, c, word;
      int max = 10000;
      ArrayList<String> wordsToBeAdded = new ArrayList<String>();
      try {
        File file = new File(filename);
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
          String x = in.nextLine();
          wordsToBeAdded.add(x.toUpperCase());
        }
        int iter = 0;
        if (data.length == 0 || data[0].length == 0) {
          iter = max;
        }
        while (wordsToBeAdded.size() > 0) {
          if (iter >= max) {
            break;
          }
          iCol = randgen.nextInt(3)-1;
          iRow = randgen.nextInt(3)-1;
          r = randgen.nextInt(data.length);
          c = randgen.nextInt(data[0].length);
          word = randgen.nextInt(wordsToBeAdded.size());
          // System.out.println("iCol:" + iCol + " iRow: " + iRow + " word:" + word + " r:" + r + " c:" + c);
          boolean success = addWord(wordsToBeAdded.get(word), r, c, iRow, iCol);
          if (iter >= max) {
            break;
          }
          if (success) {
            wordsAdded.add(wordsToBeAdded.get(word));
            wordsToBeAdded.remove(word);
          }
          else {
            iter++;
          }

          // System.out.println(wordsToBeAdded.get(word) + "\t" + word);
        }

      } catch (FileNotFoundException ex) {
        ex.printStackTrace();
      }
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
    *The word is added in the direction rowIncrement,colIncrement
    *Words must have a corresponding letter to match any letters that it overlaps.
    *
    *@param word is any text to be added to the word grid.
    *@param row is the vertical locaiton of where you want the word to start.
    *@param col is the horizontal location of where you want the word to start.
    *@param rowInc is -1,0, or 1 and represents the displacement of each letter in the row direction
    *@param colInc is -1,0, or 1 and represents the displacement of each letter in the col direction
    *@return true when: the word is added successfully.
    *        false (and do not change the board at all) when any of the following happen:
    *        a) rowInc and colInc are both 0,
    *        b) the word doesn't fit,
    *        c) there are overlapping letters that do not match
    */
     private boolean addWord(String word, int row, int col, int rowInc, int colInc) {
       int r = row;
       int c = col;
       if (rowInc == 0 && colInc == 0) {
         return false;
       }
       if (rowInc > 1 || rowInc < -1 || colInc > 1 || colInc < -1) {
         return false;
       }
       try {
         for (int i = 0; i < word.length(); i++) {
           if (data[r][c] != '_' && word.charAt(i) != data[r][c]) {
             return false;
           }
           r += rowInc;
           c += colInc;
         }
       } catch (ArrayIndexOutOfBoundsException ex) {
         return false;
       }
       // adding word
       r = row;
       c = col;
       for (int i = 0; i < word.length(); i++) {
         data[r][c] = word.charAt(i);
         r += rowInc;
         c += colInc;
       }
       return true;
     }

   //  /**Attempts to add a given word to the specified position of the WordGrid.
   //   *The word is added from left to right, must fit on the WordGrid, and must
   //   *have a corresponding letter to match any letters that it overlaps.
   //   *
   //   *@param word is any text to be added to the word grid.
   //   *@param row is the vertical locaiton of where you want the word to start.
   //   *@param col is the horizontal location of where you want the word to start.
   //   *@return true when the word is added successfully. When the word doesn't fit,
   //   * or there are overlapping letters that do not match, then false is returned
   //   * and the board is NOT modified.
   //   */
   //  public boolean addWordHorizontal(String word,int row, int col){
   //    int c = col;
   //    if (row >= data.length || data[row].length < col + word.length()) {
   //      // System.out.println("1st false");
   //      return false;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      if(data[row][c] != '_' && word.charAt(i) != data[row][c]) {
   //        return false;
   //        // System.out.println("2nd false");
   //      }
   //      c++;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      data[row][col+i] = word.charAt(i);
   //      // System.out.println(this.toString());
   //    }
   //    return true;
   //  }
   //
   // /**Attempts to add a given word to the specified position of the WordGrid.
   //   *The word is added from top to bottom, must fit on the WordGrid, and must
   //   *have a corresponding letter to match any letters that it overlaps.
   //   *
   //   *@param word is any text to be added to the word grid.
   //   *@param row is the vertical locaiton of where you want the word to start.
   //   *@param col is the horizontal location of where you want the word to start.
   //   *@return true when the word is added successfully. When the word doesn't fit,
   //   *or there are overlapping letters that do not match, then false is returned.
   //   *and the board is NOT modified.
   //   */
   //  public boolean addWordVertical(String word, int row, int col){
   //    int r = row;
   //    if (col >= data[r].length || data.length < row + word.length()) {
   //      // System.out.println("1st false");
   //      return false;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      if(data[r][col] != '_' && word.charAt(i) != data[r][col]) {
   //        // System.out.println("2nd false");
   //        return false;
   //      }
   //      r++;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      data[row+i][col] = word.charAt(i);
   //      // System.out.println(this.toString());
   //    }
   //    return true;
   //  }
   //
   //  /**Attempts to add a given word to the specified position of the WordGrid.
   //   *The word is added from top left towards the bottom right, it must fit on the board,
   //   *and must have a corresponding letter to match any letters that it overlaps.
   //   *
   //   *@param word is any text to be added to the word grid.
   //   *@param row is the vertical locaiton of where you want the word to start.
   //   *@param col is the horizontal location of where you want the word to start.
   //   *@return true when the word is added successfully. When the word doesn't fit,
   //   *or there are overlapping letters that do not match, then false is returned
   //   *and the board is not modified.
   //   */
   //  public boolean addWordDiagonal(String word,int row, int col){
   //    int r = row;
   //    int c = col;
   //    if (data[row].length < col + word.length() || data.length < row + word.length()) {
   //      // System.out.println("1st false");
   //      return false;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      if(data[r][c] != '_' && word.charAt(i) != data[r][c]) {
   //        // System.out.println("2nd false");
   //        return false;
   //      }
   //      r++;
   //      c++;
   //    }
   //    for (int i = 0; i < word.length(); i++) {
   //      data[row+i][col+i] = word.charAt(i);
   //      // System.out.println(this.toString());
   //    }
   //    return true;
   //  }

}
