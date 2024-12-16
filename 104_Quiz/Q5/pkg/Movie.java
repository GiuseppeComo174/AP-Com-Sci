package pkg;

public class Movie{
    String moviename;
    double rating;
    int numberofratings;
    int revenue;
    public Movie(){
        moviename = "The Incredibles";
        rating = 9.1;
        numberofratings = 32;
        revenue = 1450300000;
    }
    public Movie(String moviename, double rating, int numberofratings, int revenue){
        this.moviename = moviename;
        this.rating = rating;
        this.numberofratings = numberofratings;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + moviename);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numberofratings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
        return;
    }
    public String getMovieName(){
        return moviename;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double a){
        double averagerating;
        double b = rating * numberofratings;
        double c = b + a;
        numberofratings = numberofratings + 1;
        double d = c/numberofratings;
        rating = d;
        System.out.println(" ");
        return;
    }
    public boolean compareRatings(Movie x){
        return rating > x.rating;
    }
}
