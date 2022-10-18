package clases;

import javax.swing.*;

import control.EngineGraphics;

public class Ventana extends JFrame {

    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();
    }

}
