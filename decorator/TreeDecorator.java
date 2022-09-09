package decorator;
import java.util.ArrayList;

/**
 * Tree decorator class which extends the class tree
 * @author Jordyn Anderson
 */
public class TreeDecorator extends Tree {

    /**
     * Initializing the two array lists named lines and decor
     */
    private ArrayList<String> lines;
    private ArrayList<String> decor;

    /**
     * Setting the value of the lines array list 
     * @param lines
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
        this.lines = lines;
     }
     /**
      * Integrate decor method which uses the decor array list of type string 
      * and implements a nested for loop which loops for the amount of lines in the lines 
      * array list and for the amount of characters in the decor array list. 
      * Then checks each character in the decor array list using an if statement
      * to make sure that every character that is not a space in the decor array list is then added 
      * into the appropriate place in the lines array list.   
      * @param decor
      */
     public void integrateDecor(ArrayList<String> decor){
        for(int i=0 ; i < decor.size(); i++)
        {
            for(int j=0 ; j < decor.get(i).length(); j++)
            {
                if(decor.get(i).charAt(j) != ' ')
                {
                    String str = lines.get(i);
                    //represents the tree
                    char ch = decor.get(i).charAt(j);
                    //ch represents each decoration

                    StringBuilder sb = new StringBuilder(str);

                    sb.setCharAt(j, ch);
                    str = sb.toString();

                    lines.set(i, str);
                    //sets the specific character of the tree equal to the character in the decor array list
                }
            }
        }
     
     }
 
}
