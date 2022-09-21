package iterator;

/**
 * Assignment class that stores the necessary methods for each assignment
 * @author Jordyn Anderson
 */
public class Assignment {
    public String title;
    public String description;
    public Topic topic;
/**
 * boolean has topic method that checks the name of the topic which will be important to ensure that the right message
 * is displayed to the user when running the program
 * @param topic
 * @return
 */
    public boolean hasTopic(Topic topic) {
        return this.topic == topic;
    }

/**
 * toString method that returns the appropriate strings for the assignments
 * @return Strings title, description, and topic
 */
    public String toString()
    {
        return title+description+" "+topic;
    }

    public Assignment(String title, String description, Topic topic)
    {
        this.title = title;
        this.description = description;
        this.topic = topic;  
    }


}
