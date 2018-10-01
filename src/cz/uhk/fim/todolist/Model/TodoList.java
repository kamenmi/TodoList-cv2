package cz.uhk.fim.todolist.Model;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoList {

    private List<TodoItem> itemList = new ArrayList<>();

    public void addItem(TodoItem item) {
        itemList.add(item);
       // item.setComplete(true); // Zaškrtne se hodnota hned po zaponutí
    }

    public TodoItem getItemByIndex(int index) {
        return itemList.get(index);
    }

    public int getItemCount(){
        return itemList.size();
    }

  /*  public void changeItemState(int index) {  //unused
        TodoItem item = itemList.get(index);
        item.setComplete(!item.isComplete());
        } */
}
