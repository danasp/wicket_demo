package official.guest_book;

import java.util.Date;

/**
 * Created by Danila on 07.08.2016.
 */
public class Comment {

    private String text;

    private Date date;

    public Comment() {
    }

    public Comment(Comment comment) {
        this.text = comment.getText();
        this.date = comment.getDate();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comment{");
        sb.append("text='").append(text).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
