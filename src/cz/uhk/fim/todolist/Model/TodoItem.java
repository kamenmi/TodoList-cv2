package cz.uhk.fim.todolist.Model;

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

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
