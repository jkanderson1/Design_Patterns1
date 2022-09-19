package factory;

public class LuckyCharms extends Cereal{
    public LuckyCharms()
    {   
        name = "Lucky Charms";
        price = 1.55;
        toys.add("My Little Pony Stickers");
        toys.add("Elsa Ring");
        toys.add("Play doe");
        toys.add("Tiny Truck");
    }
    public String prepare()
    {
        return "Preparing the Lucky Charms\nShape into Xs and Os\nCreate Marshmallow shapes\nMix grain and marshmallows\n";
    }
    
}
