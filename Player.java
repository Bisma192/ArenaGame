public class Player extends Creature
{
    protected int potions;


    public Player(String name, int maxHealth , int maxDamage,
                 String weapon,String attackText , String victorySpeech,
                    String lastWords)
    {
        super( name, maxHealth , maxDamage,
        weapon,attackText ,victorySpeech, lastWords);
        potions = 3;

    }

    public void DrinkPotion()
    {
        if (potions >0)
        {
            this.health = maxHealth;
            System.out.println(this.name + " drinks potion and gets max heath! ");
        }
    }






}
