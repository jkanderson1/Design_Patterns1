package factory;

public class FrostedFlakes extends Cereal {
    public FrostedFlakes()
    {
        name = "Frosted Flakes";
        price = 2.99;
        toys.add("Spiderman Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap Bracelet");
        toys.add("Happy Feet Figurine");

    }
    public String prepare()
    {
        return "Preparings the Frosted Flakes\nGather the grain\nShape into flakes\nSprinkle with frosting\n";
    }



    
}
