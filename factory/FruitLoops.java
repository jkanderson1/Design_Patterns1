package factory;

public class FruitLoops extends Cereal{
    public FruitLoops()
    {
        name = "Fruit Loops";
        price = 1.89;
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny Car");
    }
    public String prepare()
    {
        return "Preparing the Fruit Loops\nGather the grain\nShape into circles\nRandomly color circles\nLet circles dry\n";
    }
    
}
