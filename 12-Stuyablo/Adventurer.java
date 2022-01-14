import java.util.Random;
public abstract class Adventurer implements Damageable{
    private String name;
    private int HP;
    private int maxHP;

    //Abstract methods are meant to be implemented in child classes.
    public abstract String attack(Damageable other);
    public abstract String specialAttack(Damageable other);
    public abstract int getSpecial();
    public abstract int getSpecialMax();

    public Adventurer(){
  	   setName("Lester");
    }

    public Adventurer(String name){
  	   this(name, 10);
    }

    public Adventurer(String name, int hp){
       setName(name);
       setHP(hp);
    }

    public Adventurer(String name, int hp, int maxHP) {
      this(name, hp);
      setmaxHP(maxHP);
    }

    //toString method
    public String toString(){
    	return this.getName();
    }

    //Get Methods
    public String getName(){
    	return name;
    }

    public int getHP(){
	     return HP;
    }

    public int getmaxHP(){
      return maxHP;
    }

    public void setmaxHP(int newMax) {
      maxHP = newMax;
    }

    public void applyDamage(int amount){
      this.HP -= amount;
    }

    //Set Methods
    public void setHP(int health){
	     this.HP = health;
    }

    public void setName(String s){
	     this.name = s;
    }


}
