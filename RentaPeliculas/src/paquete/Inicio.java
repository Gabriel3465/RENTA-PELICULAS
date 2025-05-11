package paquete;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {

    public Inicio() {
        setTitle("Panel Principal");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(false); // Mostrar la barra del sistema

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Encabezado rojo arriba
        JPanel encabezado = new JPanel();
        encabezado.setBackground(new Color(0xaf4436)); // Rojo
        encabezado.setPreferredSize(new Dimension(800, 60));
        panelPrincipal.add(encabezado, BorderLayout.NORTH);

        // Panel lateral con botones
        JPanel panelLateral = new JPanel();
        panelLateral.setBackground(Color.WHITE);
        panelLateral.setPreferredSize(new Dimension(200, 440));
        panelLateral.setLayout(new GridLayout(4, 1, 20, 20));
        panelLateral.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));

        panelLateral.add(crearBoton("Cliente"));
        panelLateral.add(crearBoton("Videojuegos"));
        panelLateral.add(crearBoton("Renta y Compra"));
        panelLateral.add(crearBoton("Nueva Operación"));

        panelPrincipal.add(panelLateral, BorderLayout.WEST);

        // Panel central vacío
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(0xF2F2F2));
        panelPrincipal.add(panelCentro, BorderLayout.CENTER);

        setContentPane(panelPrincipal);
        setVisible(true);
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setBackground(new Color(0x22334C)); // Azul
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 13));
        boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true)); // Borde blanco redondeado
        boton.setPreferredSize(new Dimension(150, 40));
        return boton;
    }

    public static void main(String[] args) {
        new Inicio();
    }
}
