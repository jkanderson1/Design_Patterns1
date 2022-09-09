package decorator;

/**
 * The Star which extends tree decorator
 * Uses the integrate decor method to merge the Star and tree text files to 
 * decorate the tree
 * @author Jordyn Anderson
 */

public class Star extends TreeDecorator{
    public Star(Tree tree){
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
    
}
