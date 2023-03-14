package Movie;

public class Movie {
    private String name;
    private String Director;

    public Movie(String name, String director) {
        this.name = name;
        Director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", Director='" + Director + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }
}
