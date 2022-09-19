package factory;

/**
 * Grocery Store which saves all the different type of cereal
 * @author Jordyn Anderson
 */
public class GroceryStore {

    public Cereal createCereal(String type) {
        Cereal cereal;
        //If the type equals the name of one of the types of cereal, create a new cereal of that type
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
        //return the type of cereal
    }

}
