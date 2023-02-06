import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);


        Player Lee = new Player("Lee", 100,30,"silver sword",
                "Swings the","I WON!","oh im Dying..");


        ArrayList<Creature> MonsterList = new ArrayList<Creature>();
        MonsterList.add(new Goblin(100,10));
        MonsterList.add(new Troll(100,10));
        MonsterList.add(new Orc(100,10));
        MonsterList.add(new Dragon(100,10));



    for (int i=0; i < MonsterList.size(); i++ )
    {
        System.out.println("                              >>>>>>>>>            "
                + MonsterList.get(i).getName() + "  VS " + Lee.getName() +
                "           <<<<<<<<                             " );
        System.out.println(" \n");

        do
        {
            if (Lee.health <= 50)
                {Lee.DrinkPotion();}
            Lee.Attack(MonsterList.get(i));
            if (!MonsterList.get(i).isDead())
            {
                MonsterList.get(i).Attack(Lee);
            }
            System.out.println(); //ADDS A GAP END OF ROUND
            //DO HEALTHBAR SHOWING ALL HEALTHS(lee & monster i)
            Lee.PrintBar();
            MonsterList.get(i).PrintBar();
            System.out.println("\n ");
            if (MonsterList.get(i).isDead())
            {
                System.out.println("!!!!!!CONGRATULATIONS!!!!!! " + Lee.getName() + " has defeated "+
                        MonsterList.get(i).getName() + "!!");
                break;
            }

                System.out.println(" \n");
                System.out.println("                               " +

                        "****   END OF ROUND - PRESS ENTER TO CONTINUE   ****");//ADDS A GAP END OF ROUND
                String Enter = input.nextLine();


        } while (!MonsterList.get(i).isDead() && !Lee.isDead());
//END OF ROUND
        if (Lee.isDead())
        {
            break;
        }


    }


        System.out.println("                     END OF GAME                        ");





    }
}
