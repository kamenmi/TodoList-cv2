package cz.uhk.fim.todolist.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {

    private String title;
    private boolean complete;
    private String dateTime;

    public TodoItem(String title) {
        this.title = title;
    }

    public TodoItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) { // Zdroje kódu: https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
        this.complete = complete;
        if (complete) {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            Date date = new Date();
            setDateTime(dateFormat.format(date));}
         else {
             setDateTime("");
        }
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
