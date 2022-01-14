public class Wizard extends Adventurer {
  private int mana;
  private int age;
  private int manaMax;

  public Wizard(){
    this("Randolph");
  }

  public Wizard(String name){
    this(name, 8, (int)(Math.random()*300)+50);
  }

  public Wizard(String name, int mana, int age) {
    super(name, 20+(int)(Math.random()*10));
    setMana(mana);
    setAge(age);
    this.manaMax = 16;
  }

  // Wizard Methods

  public String attack(Damageable other) {
    int damage = (int)(Math.random()*8)+1;
    other.applyDamage(damage);
    setMana(getMana()+2);
    return this + " attacked " + other + " for " + damage + " damage!";
  }

  public String specialAttack(Damageable other) {
    String txt = "";
    if (getAge() <= 100) {
      txt += "You are inexperienced!";
      attack(other);
    }
    else if (getMana() >= 5) {
      int damage = (int)(Math.random()*10) + getAge()/51;
      other.applyDamage(damage);
      txt += this + " summoned " + getAge()/51 + " fireballs upon " + other + " for " + damage + " damage!" ;
      setMana(getMana() - 5);
    }
    else {
      txt += "Not enough mana!";
      txt += attack(other);
    }
    return txt;
  }

  // get methods

  public int getMana(){
    return mana;
  }

  public int getAge() {
    return age;
  }

  // set methods

  public void setMana(int m) {
    this.mana = m;
  }

  public void setAge(int a) {
    this.age = a;
  }

  public String getSpecialName(){
    return "Mana";
  }
  public int getSpecialMax(){
    return manaMax;
  }
  public int getSpecial(){
    return mana;
  }

}
