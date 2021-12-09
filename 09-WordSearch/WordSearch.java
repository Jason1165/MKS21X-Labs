/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      this.clear();
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
      return ans;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      int c = col;
      if (row >= data.length || data[row].length < col + word.length()) {
        // System.out.println("1st false");
        return false;
      }
      for (int i = 0; i < word.length(); i++) {
        if(data[row][c] != '_' && word.charAt(i) != data[row][c]) {
          return false;
          // System.out.println("2nd false");
        }
        c++;
      }
      for (int i = 0; i < word.length(); i++) {
        data[row][col+i] = word.charAt(i);
        // System.out.println(this.toString());
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word, int row, int col){
      int r = row;
      if (col >= data[r].length || data.length < row + word.length()) {
        // System.out.println("1st false");
        return false;
      }
      for (int i = 0; i < word.length(); i++) {
        if(data[r][col] != '_' && word.charAt(i) != data[r][col]) {
          // System.out.println("2nd false");
          return false;
        }
        r++;
      }
      for (int i = 0; i < word.length(); i++) {
        data[row+i][col] = word.charAt(i);
        // System.out.println(this.toString());
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      int r = row;
      int c = col;
      if (data[row].length < col + word.length() || data.length < row + word.length()) {
        // System.out.println("1st false");
        return false;
      }
      for (int i = 0; i < word.length(); i++) {
        if(data[r][c] != '_' && word.charAt(i) != data[r][c]) {
          // System.out.println("2nd false");
          return false;
        }
        r++;
        c++;
      }
      for (int i = 0; i < word.length(); i++) {
        data[row+i][col+i] = word.charAt(i);
        // System.out.println(this.toString());
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
    *@param word is any text to be added to the word grid.
    *@param row is the vertical locaiton of where you want the word to start.
    *@param col is the horizontal location of where you want the word to start.
    *@param rowInc is the direction at which the word is added horizontally,
    *1 would add to the right, and -1 is to the left.
    *@param colInc is the direction at which the word is added vertically,
    *1 would add downwards, and -1 upwards.
    *@return true when the word is added successfully. When the word doesn't fit,
    *or there are overlapping letters that do not match, then false is returned
    *and the board is not modified.
    */
    
}
