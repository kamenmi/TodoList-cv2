package cz.uhk.fim.todolist.gui;

import cz.uhk.fim.todolist.Model.TodoItem;
import cz.uhk.fim.todolist.Model.TodoList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTable table;
    private TodoTableModel model;
    private TodoList todoList;

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("TODO List App");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new TodoTableModel();
        todoList = new TodoList();
        model.setList(todoList);

        initControlPanel();
        initContentPanel();
    }

    private void initContentPanel() {
        table = new JTable();
        table.setModel(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

    }

    private void initControlPanel() {
        JPanel controlPanel = new JPanel(new BorderLayout());

        JLabel lbladdTodo = new JLabel("Zadej todos:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtAddTodo.getText().trim().isEmpty()) {  //kontroluje pokud tam něco je nebo není - zdroj: (https://www.java-forums.org/new-java/45666-checking-see-if-jtextfield-empty.html) #9
                    JOptionPane.showMessageDialog(null, "Nezadali jste žádný text.", "Chybové hlášení", JOptionPane.INFORMATION_MESSAGE); //Zdroj (https://stackoverflow.com/questions/8796871/custom-title-on-joptionpane-message-dialogs)
                }
                else{
                    todoList.addItem(new TodoItem(txtAddTodo.getText()));
                    txtAddTodo.setText("");
                    model.setList(todoList);
                }
            }
        });

        controlPanel.add(lbladdTodo, BorderLayout.WEST);
        controlPanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPanel.add(btnAdd, BorderLayout.EAST);

        add(controlPanel, BorderLayout.NORTH);

    }
}
