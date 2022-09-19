package factory;

public class GroceryStore {

    public Cereal createCereal(String type) {
        Cereal cereal;
        if(type.equals("frosted flakes"))
            cereal = new FrostedFlakes();
        else if(type.equals("fruit loops"))
            cereal = new FruitLoops();
        else if(type.equals("lucky charms"))
            cereal = new LuckyCharms();
        else
            cereal = new FrostedFlakes();

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
        
        return cereal;
    }

}
