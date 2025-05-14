package Views;


import javax.swing.*;
import java.awt.*;

public class Videojuegos extends JFrame {

    public Videojuegos() {
        setTitle("Panel de Juegos");
        setSize(1024, 576);
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
            
            dispose();
        });
        panelLateral.add(btnVideojuegos);

        // Botón Renta y Compra
        JButton btnRentaCompra = crearBoton("Renta y Compra");
        btnRentaCompra.addActionListener(e -> {

            dispose();
        });
        panelLateral.add(btnRentaCompra);

        // Botón Nueva Operación
        JButton btnNuevaOperacion = crearBoton("Nueva Operación");
        btnNuevaOperacion.addActionListener(e -> {
           
            dispose();
        });
        panelLateral.add(btnNuevaOperacion);

        panelPrincipal.add(panelLateral, BorderLayout.WEST);
        

        // Panel central con botones
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(0xF2F2F2));
        panelCentro.setLayout(new GridBagLayout()); // Centrado

        // Subpanel para contener botones centrales
        JPanel panelBotonesCentro = new JPanel(new GridLayout(2, 2, 20, 20));
        panelBotonesCentro.setBackground(new Color(0xF2F2F2));

        // Botón REGISTROS
        JButton btnRegistros = crearBoton("REGISTROS");
        btnRegistros.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Mostrar registros");
        });
        panelBotonesCentro.add(btnRegistros);

        // Botón AGREGAR CLIENTE
        JButton btnAgregarCliente = crearBoton("AGREGAR CLIENTE");
        btnAgregarCliente.addActionListener(e -> {
            new AgregarCliente();
            dispose();
        });
        panelBotonesCentro.add(btnAgregarCliente);

        // Botón ELIMINAR CLIENTE
        JButton btnEliminarCliente = crearBoton("ELIMINAR CLIENTE");
        btnEliminarCliente.addActionListener(e -> {
        	new EliminarCliente();
        	dispose();
            
        });
        panelBotonesCentro.add(btnEliminarCliente);

        // Agregar subpanel centrado
        panelCentro.add(panelBotonesCentro);
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
        boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        boton.setPreferredSize(new Dimension(150, 40));
        return boton;
    }

    public static void main(String[] args) {
        new Videojuegos();
    }
}
