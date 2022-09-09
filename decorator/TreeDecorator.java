package decorator;
import java.util.ArrayList;

public class TreeDecorator extends Tree {

    private ArrayList<String> lines;
    private ArrayList<String> decor;

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
        this.lines = lines;
     }
     /*
     * Used string builder
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
