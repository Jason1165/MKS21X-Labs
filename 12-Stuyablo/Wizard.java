public class Wizard extends Adventurer {
  private int mana;

  public Wizard(){
    this("Randolph");
  }

  public Wizard(String name){
    this(name, 8);
  }

  public Wizard(String name, int mana) {
    super(name, 20+(int)(Math.random()*10));
    setMana(mana);

  }

// get methods
  public int getMana(){
    return mana;
  }

// set methods
  public void setMana(int m) {
    this.mana = m;
  }
}
