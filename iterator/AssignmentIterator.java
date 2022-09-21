package iterator;
import java.util.Iterator;

/**
 * Assignment Iterator that implements the java Iterator
 * @author Jordyn Anderson
 */
public class AssignmentIterator implements Iterator<Assignment> {
    public Assignment[] assignments;
    public int position;
    //Creating the necessary array and integers for the class
   
/**
 * boolean has next method that returns true if the position is less than the length of the assignments, meaning it is not the last 
 * value in the array, and if the position is not null
 * @return true or false
 */
    public boolean hasNext() {
        return position < assignments.length && assignments[position] != null;
    }
/**
 * next method that returns the new value of the assignments array if there is a next value, and otherwise returns null
 * @return the new index of the assignments array or null
 */
    public Assignment next() {
        if(hasNext()) 
        {
            return assignments[position++];
        }
        return null;
    }
/**
 * Creating a new assignment Iterator using the assignments array. 
 * @param assignments
 */
    public AssignmentIterator(Assignment[] assignments)
    {
        this.assignments = assignments;
    }

}
