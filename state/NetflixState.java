/**
 * NetflixState class that implements state giving it all of the properties stored in the state class 
 * @author Jordyn Anderson
 */
public class NetflixState implements State {
    //Creating an instance of TV named tv
    private TV tv;
    //defining the string arrays that represent the movies and the tv shows
    private String[] movies = new String[] {
        "The land before time",
        "Frozen",
        "The Little Mermaid",
        "Ice Age"
    };
    private String[] tvShows = new String[] {
        "Peppa Pig",
        "My Little Pony",
        "Garfield",
        "Teenage Mutant Ninja Turtles"
    };
    //creating an instance of netflix state
    public NetflixState(TV tv){
        tv.setState(tv.getNetflixState());
        this.tv = tv;
    }

    /**
     * press home button method that changes the state to the home state and
     * returns a string to inform the user that the state has been changed
     * @return string 
     */
    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "returning to the home page";
    }
    /**
     * press netflix button method that returns a string that tells the user that 
     * they are already on netflix
     * @return String
     */
    public String pressNetflixButton(){
        return "You are already on Netflix";
    }

     /**
     * press netflix button method that changes the state to the home state and
     * returns a string to inform the user that the state has been changed
     * @return string 
     */
    public String pressHuluButton(){
        tv.setState(tv.getHuluState());
        return "You pressed the Hulu button";
    }

    /**
     * press movies button method that loops throguh the array list of movies 
     * and prints out each instance of the array 
     * @return String of movies 
     */
    public String pressMovieButton(){
        System.out.println("\nBelow are the Netflix movies");
        for(int i = 0; i < movies.length; i++ )
        {
            System.out.println(movies[i]);
        }
        return "";
    }

    /**
     * press tv shows button method that loops throguh the array list of tv shows 
     * and prints out each instance of the array 
     * @return String of tv shows 
     */
    public String pressTVButton(){
        System.out.println("\nBelow are the Netflix tv shows");
        for(int i = 0; i < tvShows.length; i++ )
        {
            System.out.println(tvShows[i]);
        }
       return ""; 
    }
}
