package decorator;

import java.util.ArrayList;

/**
 * A tree which is public so that it can be seen in other classes
 * @author Jordyn Anderson
 */
public class Tree {

    /**
     * Initializing the array list of type string named lines
     */
    public ArrayList<String> lines;

    /**
     * Setting the value of the lines array list whose 
     * string is composed of the value of the lines in the tree text file
     */
    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    /**
     * To string method is used to print the tree
     * This is done by creating a for loop which loops for the size of the 
     * lines array list and returning each line. 
     * @return tree image in the output string
     */
    public String toString()
    {
        String Output = "";
        for(int i=0 ; i < lines.size(); i++)
        {
             Output += lines.get(i) + "\n";
        }
            return Output;
    }
    
    
}
