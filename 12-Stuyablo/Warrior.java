public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int rageMax;

    public Warrior(){
	     this("Magnus");
    }

    public Warrior(String name){
	     this(name,"Valhalllaaaaa!!", 18);
    }

    public Warrior(String name, String warcry, int rage){
      super(name,30+(int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      this.rageMax = 21;
    }


    //warrior methods

    public String attack(Damageable other){
    	  int damage = (int)(Math.random()*10)+1;
  	    other.applyDamage(damage);
  	    setRage(getRage() + 1);
  	    String txt = this +
            " attacked " + other + " for " +
            damage + " damage!";
        return txt;
    }

    public String specialAttack(Damageable other){
      String txt = "";
	     if(getRage() >= 10){
  	        int damage = (int)(Math.random()*20)+1;
            other.applyDamage(damage);
            txt = this + " unleashes his fury upon "
             + other + " for " + damage + " damage! "+warcry;
            setRage(getRage() - 10);
	    }else{
        txt = attack(other);
			    txt = "Not enough rage! \n" + txt;
          return txt;
	    }
      return txt;
    }

    //get methods

    public int getRage(){
	     return rage;
    }

    //set methods
    public void setRage(int r){
	     this.rage = r;
    }

    public void setWarcry(String warcry){
	     this.warcry = warcry;
    }

    public String getSpecialName(){
      return "Rage";
    }
    
    public int getSpecialMax(){
      return rageMax;
    }

    public int getSpecial(){
      return rage;
    }


}
