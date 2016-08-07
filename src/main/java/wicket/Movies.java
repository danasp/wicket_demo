package wicket;

/**
 * Created by Danila on 07.08.2016.
 */
public class Movies {

    private String title;
    private String year;

    public Movies() {
    }

    public Movies(String title) {
        this.title = title;
    }

    public Movies(String title, String year) {
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
}
