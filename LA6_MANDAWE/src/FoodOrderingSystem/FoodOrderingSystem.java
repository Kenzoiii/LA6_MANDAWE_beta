package FoodOrderingSystem;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;

public class FoodOrderingSystem extends  JFrame{
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JPanel pMAIN;

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.pMAIN);
        app.setTitle("Simple Calculator");
        app.setSize(600,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
