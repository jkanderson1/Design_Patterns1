package decorator;

/**
 * The lights which extend tree decorator
 * Uses the integrate decor method to merge the lights and tree text files to 
 * decorate the tree
 * @author Jordyn Anderson
 */

public class Lights extends TreeDecorator{
    public Lights(Tree tree){
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
}
}

