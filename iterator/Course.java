package iterator;

/**
 * Course class that creates a course
 * @author Jordyn Anderson
 */
public class Course {

    public String title;
    public int count;
    public String name;
    private Assignment[] assignments;
    
/**
 * Create a course and saves the values for the parameters
 * @param name
 * @param title
 */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        assignments = new Assignment[5];
    }
    /**
     * add Assignment method that adds an assignment and increases the size of the array of assignments
     * @param title
     * @param description
     * @param topic
     */

    public void addAssignment(String title, String description, Topic topic) {
        if(count == assignments.length)
        {
            assignments = growArray(assignments);
        }
        assignments[count]= new Assignment(title, description, topic);
        count ++;
    
    }
/**
 * grow array method that doubles the size of the array 
 * @param first
 * @return temp
 */
    private Assignment[] growArray(Assignment[]first) {
        Assignment[] temp = new Assignment[first.length *2];

        for(int i=0; i<first.length;i++)
        {
            temp[i]= first[i];
        }
        return temp;
    }
/**
 * Assignment iterator method that creates a new assignment iterator for the assignments
 * @return the new assignment iterator
 */
    public AssignmentIterator createIterator() {
        return new AssignmentIterator(assignments);
    }
/**
 * to string that returns the strings needed to display the name and title of the course
 * @return String name and String title
 */
   
    public String toString()
    {
        return name+ " " +title;
    }
    

}
