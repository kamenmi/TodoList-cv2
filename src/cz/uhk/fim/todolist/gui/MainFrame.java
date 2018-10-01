package cz.uhk.fim.todolist.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("TODO List App");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initControlPanel();
    }

    private void initControlPanel() {
        JPanel controlPanel = new JPanel(new BorderLayout());

        JLabel lbladdTodo = new JLabel("Zadej todos:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Přidat");

        controlPanel.add(lbladdTodo, BorderLayout.WEST);
        controlPanel.add(txtAddTodo, BorderLayout.CENTER);
        controlPanel.add(btnAdd, BorderLayout.EAST);

        add(controlPanel, BorderLayout.NORTH);

    }

}
