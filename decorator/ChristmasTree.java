package decorator;

/**
 * A Christmas tree which extends the class Tree and uses 
 * the file reader with tree text file to print out a tree
 * @author Jordyn Anderson
 */
public class ChristmasTree extends Tree{
    public ChristmasTree(){
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
}
