package wicket;

/**
 * Created by Danila on 07.08.2016.
 */
public class Movie {

    private String title;
    private String year;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;

        Movie movie = (Movie) o;

        if (!title.equals(movie.title)) return false;
        if (year != null ? !year.equals(movie.year) : movie.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
