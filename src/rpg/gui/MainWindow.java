package rpg.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JPanel statusBar;   // Barra de Estado
    private JPanel gamePanel;   // Panel de Juego
    private JPanel actionBar;   // Barra de Acción

    public MainWindow() {
        setTitle("RPG Game");
        setSize(800, 860);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Configurar el panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Crear la Barra de Estado (150px de altura)
        statusBar = new JPanel();
        statusBar.setPreferredSize(new Dimension(800, 150));
        statusBar.setBackground(Color.RED); // Puedes cambiar el color según prefieras
        statusBar.add(new JLabel("Estado del jugador: Salud 100% - Nivel 1"));

        // Crear el Panel de Juego (370px de altura)
        gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(800, 370));
        gamePanel.setBackground(Color.GREEN); // Panel central donde se desarrolla el juego

        // Crear la Barra de Acción (340px de altura)
        actionBar = new JPanel();
        actionBar.setPreferredSize(new Dimension(800, 340));
        actionBar.setBackground(Color.BLUE); // Barra inferior con botones
        actionBar.setLayout(new FlowLayout());
        actionBar.add(new JButton("Atacar"));
        actionBar.add(new JButton("Defender"));
        actionBar.add(new JButton("Usar ítem"));

        // Agregar los paneles al panel principal
        mainPanel.add(statusBar, BorderLayout.NORTH);
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        mainPanel.add(actionBar, BorderLayout.SOUTH);

        // Agregar el panel principal al JFrame
        setContentPane(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
