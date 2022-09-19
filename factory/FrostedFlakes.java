package factory;

/**
 * Frosted flakes which extends cereal making it a type of cereal
 * @author Jordyn Anderson
 */
public class FrostedFlakes extends Cereal {
    public FrostedFlakes()
    {
        name = "Frosted Flakes";
        price = 2.99;
        toys.add("Spiderman Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");
        //Giving all correct values for each property and adding the appropriate toys to the toys array list

    }
    /**
     * Prepare method which returns a specific string for the Frosted flakes
     * @return String
     */
    public String prepare()
    {
        return "Preparings the Frosted Flakes\nGather the grain\nShape into flakes\nSprinkle with frosting\n";
    }



    
}
