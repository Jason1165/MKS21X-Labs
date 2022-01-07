public class Wizard extends Adventurer {
  private int mana;
  private int age;

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
  }

  // Wizard Methods

  public void attack(Damageable other) {
    int damage = (int)(Math.random()*8)+1;
    other.applyDamage(damage);
    setMana(getMana()+2);
    System.out.println(this + " attacked " + other + " for " + damage + " damage!");
  }

  public void specialAttack(Damageable other) {
    if (getAge() <= 100) {
      System.out.println("You are inexperienced!");
      attack(other);
    }
    else if (getMana() >= 5) {
      int damage = (int)(Math.random()*5) + getAge()/51;
      other.applyDamage(damage);
    }
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
}
