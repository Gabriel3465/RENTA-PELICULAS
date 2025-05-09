package paquete;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() { 
        setTitle("Renta de Películas");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana
        setLayout(null); // Diseño absoluto

        // ---------------------------
        // Panel superior (encabezado)
        // ---------------------------
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.CYAN);
        topPanel.setBounds(0, 0, 800, 80);
        topPanel.setLayout(null);

        JLabel logo = new JLabel("🎬 RENTA DE PELÍCULAS");
        logo.setFont(new Font("Arial", Font.BOLD, 18));
        logo.setBounds(280, 20, 300, 30);
        topPanel.add(logo);

        // --------------------------------
        // Panel de login (borde redondeado)
        // --------------------------------
        RoundedPanel loginPanel = new RoundedPanel(30);
        loginPanel.setBackground(new Color(0xD9, 0xD9, 0xD9)); // Gris claro
        loginPanel.setBounds(240, 150, 320, 250);
        loginPanel.setLayout(null);

        JLabel loginTitle = new JLabel("INICIO DE SESIÓN DE ADMINISTRADOR");
        loginTitle.setForeground(Color.BLACK);
        loginTitle.setFont(new Font("Arial", Font.BOLD, 14));
        loginTitle.setBounds(20, 10, 300, 30);
        loginPanel.add(loginTitle);

        JTextField emailField = new JTextField();
        emailField.setBounds(20, 60, 280, 25);
        emailField.setFont(new Font("Arial", Font.PLAIN, 12));
        emailField.setToolTipText("E-mail");
        loginPanel.add(emailField);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(20, 100, 280, 25);
        passField.setFont(new Font("Arial", Font.PLAIN, 12));
        passField.setToolTipText("Contraseña");
        loginPanel.add(passField);

        JLabel forgotPass = new JLabel("Olvidé mi contraseña");
        forgotPass.setForeground(new Color(0, 102, 204));
        forgotPass.setFont(new Font("Arial", Font.PLAIN, 11));
        forgotPass.setBounds(20, 130, 200, 20);
        loginPanel.add(forgotPass);

        JButton confirmButton = new JButton("CONFIRMAR");
        confirmButton.setBackground(new Color(76, 175, 80)); // Verde tipo Material
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setFont(new Font("Arial", Font.BOLD, 12));
        confirmButton.setBounds(100, 170, 120, 30);
        loginPanel.add(confirmButton);

        // -----------------------------
        // Fondo con imagen
        // -----------------------------
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("renta.png"));
        Image imagenEscalada = originalIcon.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
        ImageIcon fondoIcon = new ImageIcon(imagenEscalada);
        JLabel fondo = new JLabel(fondoIcon);
        fondo.setBounds(0, 0, 800, 600);
        fondo.setLayout(null); // importante para que los paneles puedan colocarse sobre él

        // Añadir los paneles encima del fondo
        fondo.add(topPanel);
        fondo.add(loginPanel);

        // Añadir todo al JFrame
        add(fondo);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ventana();
    }
}

// ----------------------------
// Clase auxiliar: Panel redondeado
// ----------------------------
class RoundedPanel extends JPanel {
    private int cornerRadius;

    public RoundedPanel(int radius) {
        super();
        this.cornerRadius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcs.width, arcs.height);
    }
}
