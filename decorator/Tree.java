package decorator;

import java.util.ArrayList;


public class Tree {

    public ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

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
