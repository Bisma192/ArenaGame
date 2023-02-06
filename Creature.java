import java.util.Random;

public class Creature
{
    protected String name;
    protected int maxHealth;
    protected int health;
    protected int maxDamage;
    protected String weapon;
    protected String victorySpeech;
    protected String lastWords;
    protected String attackText;


    //CREATURE DEFAULT
    public Creature()
    {
        name= "none";
        maxHealth = 100;
        health= 100;
        maxDamage= 100;
        weapon= "none";
        victorySpeech= "none";
        lastWords= "none";
        attackText= "none";
    }

    //CREATURE OBJECT
    public Creature(String name, int maxHealth , int maxDamage,
                    String weapon,String attackText , String victorySpeech, String lastWords)
    {
        this.name= name;
        this.maxHealth = maxHealth;
        this.maxDamage= maxDamage;
        this.weapon= weapon;
        this.victorySpeech= victorySpeech;
        this.lastWords= lastWords;
        this.attackText= attackText;

        this.health= maxHealth;

    }

    //METHODS
    public void DisplayInfo(){
        System.out.println("name is : " + name
                + "\nmax health is : " + maxHealth
                + "\nhealth is : " + health
                +"\nmax damage is : " + maxDamage);
        /*
                +"\nthe chosen weapon is : " + weapon
                +"\nattack text is : " + attackText
                +"\nvictory speech is : " + victorySpeech
                +"\nlast words are : " + lastWords);

         */
        System.out.println("==================\n");
    }


    public void Attack(Creature target){
        //System.out.println(name + attackText + weapon);
        Random rnd =  new Random();
        int damage = rnd.nextInt(maxDamage)+1;
        System.out.printf("%s attacks %s for %d damage,\n",name, target.getName(), damage);
        target.ReceiveDamage(damage);



    }

    public void ReceiveDamage(int dam){
        this.health -= dam ;
        if (health < 0)
        {
            health = 0;
            System.out.println(this.name + " has run out of health and says: ");
            SayLastWords();
        }


    }

    public boolean isDead()
    {
        return health <= 0;
    }


    public String getName()
    {
        return name;
    }
    public void SayLastWords(){
        System.out.println(lastWords);
    }

    public void SayVictorySpeech()
    {
        System.out.println(victorySpeech);
    }

    //prints bar
    public void PrintBar()
    {
        int a = this.health;

        int emptyBar = 100 - a;
        System.out.println(this.name + " HEALTH IS : " + a + "%");

        System.out.print("|");

        for (int i = 1; i <= a; i++)
        {
            System.out.print("+");
        }
        for (int i = 1; i <= emptyBar; i++)
        {
            System.out.print("-");
        }

        System.out.println("|");
        if (a == 0)
        {
            System.out.println( this.name + " is dead!");
        }

    }
    

    
    
    
    
    
    
}

