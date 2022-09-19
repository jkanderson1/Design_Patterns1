package factory;
/**
 * Fruit loops which extends cereal making it a type of cereal
 * @author Jordyn Anderson
 */
public class FruitLoops extends Cereal{
    public FruitLoops()
    {
        name = "Fruit Loops";
        price = 1.89;
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
         //Giving all correct values for each property and adding the appropriate toys to the toys array list
    }
    /**
     * Prepare method that returns the appropriate string to narrate the preparation of the Fruit Loops
     * @return String
     */
    public String prepare()
    {
        return "Preparing the Fruit Loops\nGather the grain\nShape into circles\nRandomly color circles\nLet circles dry\n";
    }
    
}
