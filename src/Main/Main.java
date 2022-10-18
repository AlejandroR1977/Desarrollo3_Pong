package Main;

import clases.Ventana;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
