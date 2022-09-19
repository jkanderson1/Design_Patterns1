package factory;
import java.util.ArrayList;
import java.util.Random;

/**
 * Cereal class that implemenets all the necessary methods a properties for each type of cereal
 * @author Jordyn Anderson
 */


public abstract class Cereal {
    protected String name;
    protected double price;
    public ArrayList<String> toys = new ArrayList<String>();
    Random r = new Random();
    int index = r.nextInt(toys.size()+1);


    /**
     * Prepare method that returns the apppropriate string for each type of cerreal
     * @return prepare method
     */

    public String prepare(){
        return prepare();
    }

    /**
     * box Cereal method that returns a string which narrates the provess of boxing each cereal
     * @return String
     */

    public String boxCereal() {
        return "Boxing the "+name+ "\nDrawing the fun pictures of "+name+" on the box\nPouring the "+name+" into the box\nAdding the surprise "+toys.get(index)+"\n";
    }

    /**
     * Price cereal method which returns the price of each cereal
     * @return String
     */

    public String priceCereal() {
        return "Putting the price tag of $"+price+" on the "+name+" box";
    }
     


}
