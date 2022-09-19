package factory;
import java.util.ArrayList;
import java.util.Random;


public abstract class Cereal {
    protected String name;
    protected double price;
    public ArrayList<String> toys = new ArrayList<String>();
    Random r = new Random();
    int index = r.nextInt(toys.size()+1);



    public String prepare(){
        return prepare();
    }


    public String boxCereal() {
        return "Boxing the "+name+ "\nDrawing the fun pictures of "+name+" on the box\nPouring the "+name+" into the box\nAdding the surprise "+toys.get(index)+"\n";
    }


    public String priceCereal() {
        return "Putting the price tag of $"+price+" on the "+name+" box";
    }
     


}
