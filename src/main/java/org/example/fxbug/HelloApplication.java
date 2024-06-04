package org.example.fxbug;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(new JTextField("Field 1", 20));
        panel.add(new JTextField("Field 2", 20));
        panel.add(new JButton("Button"));

        JPanel panel2 = new JPanel(new GridLayout(3, 1));
        panel2.add(new JTextField("Field 3", 20));
        panel2.add(new JTextField("Field 4", 20));
        panel2.add(new JButton("Button2"));

        Tab tab1 = new Tab("works?");
        SwingNode swingNode = new SwingNode();
        swingNode.setContent(panel);
        tab1.setContent(swingNode);

        Tab tab2 = new Tab("not works");
        SwingNode swingNode2 = new SwingNode();
        swingNode2.setContent(panel2);
        tab2.setContent(swingNode2);

        TabPane pane = new TabPane(tab1, tab2);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("FX Bug?");
        stage.setScene(scene);
        stage.show();
    }
}