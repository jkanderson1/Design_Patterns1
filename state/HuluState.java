/**
 * HuluState class that implements state giving it all of the properties stored in the state class 
 * @author Jordyn Anderson
 */
public class HuluState implements State {
    //creating an instance of TV named tv
    private TV tv;
    //declaring the array of strings that represent the moveis and tv shows 
    private String[] movies = new String[] {
        "Cars",
        "Cinderella",
        "Wall-E",
        "ET"
    };
    private String[] tvShows = new String[] {
        "Sesame Street",
        "Care Bears",
        "Looney Toons"
    };

    public HuluState(TV tv){
        tv.setState(tv.getHuluState());
        this.tv = tv;
    }

    /**
     * Press home button method implemented from the state class that set the state to the 
     * home state and returns a string informing the user
     * @return String 
     */
    public String pressHomeButton(){
        tv.setState(tv.getHomeState());
        return "returning to the home page";
    }

    /**
     * Press Netflix button method implemented from the state class that set the state to the 
     * netflix state and returns a string informing the user
     * @return String 
     */
    public String pressNetflixButton(){
        tv.setState(tv.getNetflixState());
        return "You pressed the Netflix button";
    }

    /**
     * press hulu button method that informs the user that they are already in the hulu state
     * @return String
     */
    public String pressHuluButton(){
        return "You are already on Hulu";
    }

    /**
     * press movies button method that loops throguh the array list of movies 
     * and prints out each instance of the array 
     * @return String of movies 
     */
    public String pressMovieButton(){
        System.out.println("\nBelow are the Hulu movies");
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
        System.out.println("\nBelow are the Hulu tv shows");
        for(int i = 0; i < tvShows.length; i++ )
        {
            System.out.println(tvShows[i]);
        }
       return ""; 
    }



}
