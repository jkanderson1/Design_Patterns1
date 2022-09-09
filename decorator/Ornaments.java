package decorator;

/**
 * The ornaments which extend tree decorator
 * Uses the integrate decor method to merge the ornaments and tree text files to 
 * decorate the tree
 * @author Jordyn Anderson
 */

public class Ornaments extends TreeDecorator{
   
    public Ornaments(Tree tree){
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
