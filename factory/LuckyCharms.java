package factory;
/**
 * Lucky Charms which extends cereal making it a type of cereal
 * @author Jordyn Anderson
 */
public class LuckyCharms extends Cereal{
    public LuckyCharms()
    {   
        name = "Lucky Charms";
        price = 1.55;
        toys.add("My Little Pony Stickers");
        toys.add("Elsa Ring");
        toys.add("Play doe");
        toys.add("Tiny Truck");
        //Giving all correct values for each property and adding the appropriate toys to the toys array list
    }
    /**
     * Prepare method that returns the appropriate string to narrate the preparation of the Lucky Charms
     * @return String
     */
    public String prepare()
    {
        return "Preparing the Lucky Charms\nShape into Xs and Os\nCreate Marshmallow shapes\nMix grain and marshmallows\n";
    }
    
}
