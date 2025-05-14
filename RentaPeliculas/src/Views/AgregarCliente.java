package Views;

import javax.swing.*;
import java.awt.*;

public class AgregarCliente extends JFrame {

    private JTextField txtNombre, txtApellidoPaterno, txtApellidoMaterno, txtTelefono, txtCorreo, txtFechaNacimiento;
    private JButton btnCancelar, btnConfirmar;

    public AgregarCliente() {
        setTitle("Agregar Cliente");
        setSize(1100, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Encabezado rojo arriba
        JPanel encabezado = new JPanel();
        encabezado.setBackground(new Color(0xAF4436));
        encabezado.setPreferredSize(new Dimension(1100, 60));
        panelPrincipal.add(encabezado, BorderLayout.NORTH);

        // Panel central con formulario
        JPanel panelFormulario = new JPanel(new GridBagLayout());
        panelFormulario.setBackground(new Color(0xF2F2F2));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        JLabel lblTitulo = new JLabel("AGREGAR CLIENTE", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelFormulario.add(lblTitulo, gbc);

        // Fila 1
        gbc.gridwidth = 1;
        agregarCampo(panelFormulario, gbc, "Nombre:", 0, 1);
        txtNombre = new JTextField(); agregarCampoTexto(panelFormulario, gbc, txtNombre, 1, 1);
        agregarCampo(panelFormulario, gbc, "Apellido paterno:", 2, 1);
        txtApellidoPaterno = new JTextField(); agregarCampoTexto(panelFormulario, gbc, txtApellidoPaterno, 3, 1);

        // Fila 2
        agregarCampo(panelFormulario, gbc, "Apellido materno:", 0, 2);
        txtApellidoMaterno = new JTextField(); agregarCampoTexto(panelFormulario, gbc, txtApellidoMaterno, 1, 2);
        agregarCampo(panelFormulario, gbc, "Fecha de nacimiento:", 2, 2);
        txtFechaNacimiento = new JTextField("DD/MM/AA"); agregarCampoTexto(panelFormulario, gbc, txtFechaNacimiento, 3, 2);

        // Fila 3
        agregarCampo(panelFormulario, gbc, "Teléfono:", 0, 3);
        txtTelefono = new JTextField(); agregarCampoTexto(panelFormulario, gbc, txtTelefono, 1, 3);
        agregarCampo(panelFormulario, gbc, "Correo:", 2, 3);
        txtCorreo = new JTextField(); agregarCampoTexto(panelFormulario, gbc, txtCorreo, 3, 3);

        // Fila botones
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        btnCancelar = crearBoton("CANCELAR", new Color(0xAF4436));
        panelFormulario.add(btnCancelar, gbc);

        gbc.gridx = 2;
        btnConfirmar = crearBoton("CONFIRMAR", new Color(0x22334C));
        panelFormulario.add(btnConfirmar, gbc);

        // Eventos
        btnCancelar.addActionListener(e -> {
            new Inicio(); // ← vuelve al panel principal
            dispose();    // ← cierra esta ventana
        });

        btnConfirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "Cliente agregado:\n" +
                            "Nombre: " + txtNombre.getText() + "\n" +
                            "Apellido paterno: " + txtApellidoPaterno.getText() + "\n" +
                            "Apellido materno: " + txtApellidoMaterno.getText() + "\n" +
                            "Nacimiento: " + txtFechaNacimiento.getText() + "\n" +
                            "Teléfono: " + txtTelefono.getText() + "\n" +
                            "Correo: " + txtCorreo.getText()
            );
        });

        panelPrincipal.add(panelFormulario, BorderLayout.CENTER);
        setContentPane(panelPrincipal);
        setVisible(true);
    }

    private void agregarCampo(JPanel panel, GridBagConstraints gbc, String texto, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(new JLabel(texto), gbc);
    }

    private void agregarCampoTexto(JPanel panel, GridBagConstraints gbc, JTextField campo, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        campo.setPreferredSize(new Dimension(200, 30));
        panel.add(campo, gbc);
    }

    private JButton crearBoton(String texto, Color colorFondo) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setBackground(colorFondo);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
        boton.setPreferredSize(new Dimension(140, 40));
        return boton;
    }

    public static void main(String[] args) {
        new AgregarCliente();
    }
}
