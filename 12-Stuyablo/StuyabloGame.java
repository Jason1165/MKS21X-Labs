import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    for (int i = 0; i < party.size(); i++) {
      Text.go(startRow, 1+(WIDTH/4)*i);
      Text.colorize(party.get(i).toString(),Text.WHITE);
      Text.go(startRow+1, 1+(WIDTH/4)*i);
      Text.colorize(party.get(i).getHP()+"", Text.WHITE);
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    Text.hideCursor();
    Text.go(startRow, 2);
    Text.colorize(s, Text.WHITE);
  }

  public static void drawScreen(){
    borderVertical(HEIGHT);
    borderHorizontal(WIDTH);
    Text.go(HEIGHT+1, 1);
  }

  public static void borderVertical(int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(i, 1);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
      Text.go(i, WIDTH);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
    }
  }

  public static void borderHorizontal(int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(1, i);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
      Text.go(HEIGHT, i);
      System.out.print(Text.colorize(" ", BORDER_BACKGROUND));
    }
  }




  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    Adventurer Enemy = new Warrior();
    enemies.add(Enemy);

    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer Adam = new Wizard("Adam");
    Adventurer Bobby = new Wizard("Bobby");
    Adventurer Classy = new Wizard("Classy");
    party.add(Adam);
    party.add(Bobby);
    party.add(Classy);

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        else if(input.equals("special")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        System.out.print("Player " + whichPlayer);
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,HEIGHT-5);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}