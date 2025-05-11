package paquete;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Panel Administrador");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Eliminar el borde redondeado y la decoración
        setUndecorated(false); // Esto desactiva la eliminación de bordes

        // Configuración de fondo
        JPanel fondo = new JPanel();
        fondo.setBackground(Color.WHITE);
        fondo.setLayout(new BorderLayout()); // Usamos BorderLayout para distribuir los componentes

        // Encabezado rojo
        JPanel encabezado = new JPanel();
        encabezado.setBackground(new Color(0xaf4436));
        encabezado.setPreferredSize(new Dimension(800, 60)); // Aseguramos que el encabezado tenga un tamaño fijo
        fondo.add(encabezado, BorderLayout.NORTH);

        // Panel central con GridBagLayout
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(0xf1f1f1));
        panelCentro.setLayout(new GridBagLayout()); // Usamos GridBagLayout para los componentes del panel central
        fondo.add(panelCentro, BorderLayout.CENTER);

        // Logo
        JLabel logo = new JLabel(new ImageIcon(getClass().getResource("LOGO.png"))); // Pon tu imagen aquí
        logo.setPreferredSize(new Dimension(80, 80)); // Aseguramos que el logo tenga un tamaño adecuado
        GridBagConstraints gbcLogo = new GridBagConstraints();
        gbcLogo.gridx = 0;
        gbcLogo.gridy = 0;
        gbcLogo.insets = new Insets(10, 10, 10, 10); // Espaciado entre los componentes
        panelCentro.add(logo, gbcLogo);

        // Título
        JLabel titulo = new JLabel("PANEL ADMINISTRADOR");
        titulo.setFont(new Font("Arial", Font.BOLD, 14));
        titulo.setForeground(new Color(0x22334c));
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 1;
        gbcTitulo.insets = new Insets(10, 10, 10, 10);
        panelCentro.add(titulo, gbcTitulo);

        // Correo
        JLabel lblCorreo = new JLabel("Ingresar correo:");
        GridBagConstraints gbcCorreo = new GridBagConstraints();
        gbcCorreo.gridx = 0;
        gbcCorreo.gridy = 2;
        gbcCorreo.insets = new Insets(10, 10, 10, 10);
        panelCentro.add(lblCorreo, gbcCorreo);

        JTextField txtCorreo = new JTextField();
        txtCorreo.setPreferredSize(new Dimension(240, 25)); // Fijamos un tamaño adecuado para el campo
        txtCorreo.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        GridBagConstraints gbcTxtCorreo = new GridBagConstraints();
        gbcTxtCorreo.gridx = 0;
        gbcTxtCorreo.gridy = 3;
        gbcTxtCorreo.insets = new Insets(10, 10, 10, 10);
        panelCentro.add(txtCorreo, gbcTxtCorreo);

        // Contraseña
        JLabel lblPass = new JLabel("Contraseña:");
        GridBagConstraints gbcPass = new GridBagConstraints();
        gbcPass.gridx = 0;
        gbcPass.gridy = 4;
        gbcPass.insets = new Insets(10, 10, 10, 10);
        panelCentro.add(lblPass, gbcPass);

        JPasswordField txtPass = new JPasswordField();
        txtPass.setPreferredSize(new Dimension(240, 25)); // Fijamos un tamaño adecuado para el campo
        txtPass.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        GridBagConstraints gbcTxtPass = new GridBagConstraints();
        gbcTxtPass.gridx = 0;
        gbcTxtPass.gridy = 5;
        gbcTxtPass.insets = new Insets(10, 10, 10, 10);
        panelCentro.add(txtPass, gbcTxtPass);

        // Botón
        JButton btnAcceder = new JButton("ACCEDER");
        btnAcceder.setBackground(new Color(0x22334c));
        btnAcceder.setForeground(Color.WHITE);
        GridBagConstraints gbcBtnAcceder = new GridBagConstraints();
        gbcBtnAcceder.gridx = 0;
        gbcBtnAcceder.gridy = 6;
        gbcBtnAcceder.insets = new Insets(20, 10, 10, 10);
        panelCentro.add(btnAcceder, gbcBtnAcceder);

        // Configurar el panel de contenido
        setContentPane(fondo);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }
}
