package Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EliminarCliente extends JFrame {

    public EliminarCliente() {
        setTitle("Eliminar Cliente");
        setSize(1100, 700);
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

        // Botón Cliente
        JButton btnCliente = crearBoton("Cliente");
        btnCliente.addActionListener(e -> {
            new AgregarCliente();
            dispose();
        });
        panelLateral.add(btnCliente);

        // Botón Videojuegos
        JButton btnVideojuegos = crearBoton("Videojuegos");
        btnVideojuegos.addActionListener(e -> {
            // Aquí puedes llamar a la ventana correspondiente
            dispose();
        });
        panelLateral.add(btnVideojuegos);

        // Botón Renta y Compra
        JButton btnRentaCompra = crearBoton("Renta y Compra");
        btnRentaCompra.addActionListener(e -> {
            // Aquí puedes llamar a la ventana correspondiente
            dispose();
        });
        panelLateral.add(btnRentaCompra);

        // Botón Nueva Operación
        JButton btnNuevaOperacion = crearBoton("Nueva Operación");
        btnNuevaOperacion.addActionListener(e -> {
            // Aquí puedes llamar a la ventana correspondiente
            dispose();
        });
        panelLateral.add(btnNuevaOperacion);

        panelPrincipal.add(panelLateral, BorderLayout.WEST);

        add(panelPrincipal);
        setVisible(true);
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setBackground(new Color(0x22334C)); // Azul
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 13));
        boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        boton.setPreferredSize(new Dimension(150, 40));
        return boton;
    }
}
