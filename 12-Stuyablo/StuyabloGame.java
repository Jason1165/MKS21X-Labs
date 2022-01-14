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
      Text.go(startRow, 2+(WIDTH/4)*i);
      System.out.print(Text.colorize(party.get(i).toString(),Text.WHITE));

      Text.go(startRow+1, 2+(WIDTH/4)*i);
      System.out.print(Text.colorize(party.get(i).getSpecialName() +":"
          +party.get(i).getSpecial() + "/"
          +party.get(i).getSpecialMax(), Text.WHITE));

      Text.go(startRow+2, 2+(WIDTH/4)*i);
      int colour = Text.WHITE;
      System.out.print(Text.colorize("HP:", Text.WHITE));
      double percent = (double)party.get(i).getHP() / (double)party.get(i).getmaxHP();
      if (percent <= 0.25 ) colour = Text.RED;
      if (percent >= 0.75 ) colour = Text.GREEN;
      System.out.print(Text.colorize("" + party.get(i).getHP() + "/"
          + party.get(i).getmaxHP(), colour));
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    Text.hideCursor();
    Text.go(startRow, 2);
    System.out.print(Text.colorize(s, Text.WHITE));
  }

  public static void drawScreen(){
    Text.hideCursor();
    borderVertical("*", HEIGHT);
    borderHorizontal("*", WIDTH);
    Text.go(HEIGHT+1, 1);
  }

  public static void borderVertical(String text, int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(i, 1);
      System.out.print(Text.colorize(text, Text.BLACK, BORDER_BACKGROUND));
      Text.go(i, WIDTH);
      System.out.print(Text.colorize(text, Text.BLACK, BORDER_BACKGROUND));
    }
  }

  public static void borderHorizontal(String text, int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(1, i);
      System.out.print(Text.colorize(text, Text.BLACK, BORDER_BACKGROUND));
      Text.go(HEIGHT, i);
      System.out.print(Text.colorize(text, Text.BLACK, BORDER_BACKGROUND));
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
    Adventurer bad = new Warrior();
    enemies.add(bad);
    int tempHP = (int)(Math.random()*200) + 100;
    enemies.get(0).setHP(tempHP); enemies.get(0).setmaxHP(tempHP);

    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer Adam = new Wizard("Adam");
    Adventurer Bobby = new Warrior("Bobby");
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
      Text.clear();
      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack") || input.equals("")){
          Text.go(HEIGHT/2 - 5, 2);
          String x = party.get(whichPlayer).attack(enemies.get(0));
          System.out.print(Text.colorize(x, Text.WHITE));
        }
        else if(input.equals("special")){
          Text.go(HEIGHT/2 - 5, 2);
          String x = party.get(whichPlayer).specialAttack(enemies.get(0));
          System.out.print(Text.colorize(x, Text.WHITE));
        }
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
          Text.go(HEIGHT/2 - 5, 2);
          String x = enemies.get(0).specialAttack(party.get((int)(Math.random()*party.size())));
          System.out.print(Text.colorize(x, Text.WHITE));
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
