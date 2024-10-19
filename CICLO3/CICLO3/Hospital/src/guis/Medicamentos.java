package guis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medicamentos extends JFrame {
    private JTextField textFieldNombre;
    private JComboBox<String> comboBox;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtCodigo;
    private JTextField txtStock;
    private int codigoActual = 1000; // Código inicial

    public Medicamentos() {
        // Configuración de la ventana
        setTitle("Gestión de Medicamentos");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Lista de medicamentos:");
        lblNewLabel.setBounds(10, 48, 151, 14);
        getContentPane().add(lblNewLabel);

        JButton btnNewButton = new JButton("Registrar");
        btnNewButton.setBounds(554, 10, 116, 23);
        getContentPane().add(btnNewButton);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(554, 44, 116, 23);
        getContentPane().add(btnActualizar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(554, 78, 116, 23);
        getContentPane().add(btnEliminar);

        comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Aminofilina", "Diazepan", "Dobutamina", "Adrenalina", "Dopamina", "Fenitoína", "Lidocaína", "Metilprednisolona", "Nitroglicerina", "Nitroprusiato", "Salbutamol", "Timetafán"}));
        comboBox.setBounds(181, 44, 150, 22);
        getContentPane().add(comboBox);

        JLabel lblNuevoMedicamento = new JLabel("Nuevo Medicamento:");
        lblNuevoMedicamento.setBounds(10, 14, 151, 14);
        getContentPane().add(lblNuevoMedicamento);

        textFieldNombre = new JTextField();
        textFieldNombre.setBounds(181, 11, 150, 20);
        getContentPane().add(textFieldNombre);
        textFieldNombre.setColumns(10);

        // Modelo de la tabla
        String[] columnNames = {"Nombre", "Código", "Tipo", "Fecha de Vencimiento", "Stock"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Hacer que todas las celdas sean editables
                return true;
            }
        };
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 120, 660, 300);
        getContentPane().add(scrollPane);

        JLabel lblNewLabel_1 = new JLabel("Codigo:");
        lblNewLabel_1.setBounds(10, 82, 46, 14);
        getContentPane().add(lblNewLabel_1);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(181, 79, 150, 20);
        getContentPane().add(txtCodigo);
        txtCodigo.setColumns(10);

        txtStock = new JTextField();
        txtStock.setBounds(181, 140, 150, 20);
        getContentPane().add(txtStock);

        // Acción de registrar un nuevo medicamento
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarMedicamento();
            }
        });

        // Acción de actualizar medicamento desde la tabla (ahora todos los campos son modificables)
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarMedicamento();
            }
        });

        // Acción de eliminar medicamento por código
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarMedicamentoPorCodigo();
            }
        });
    }

    // Método para registrar un nuevo medicamento
    private void registrarMedicamento() {
        String nombre = textFieldNombre.getText();
        if (!nombre.isEmpty()) {
            // Generar código automáticamente
            String codigo = String.valueOf(codigoActual++);

            String fechaVencimiento = "2025-12-31"; // Ejemplo de fecha de vencimiento
            String tipo = "Analgésico"; // Tipo de medicamento
            int stock = 50; // Ejemplo de stock

            comboBox.addItem(nombre); // Añadir al ComboBox

            // Añadir el nuevo medicamento a la tabla
            tableModel.addRow(new Object[]{nombre, codigo, tipo, fechaVencimiento, stock});

            JOptionPane.showMessageDialog(this, "Nuevo medicamento registrado.");
            textFieldNombre.setText(""); // Limpiar campo de texto
        } else {
            JOptionPane.showMessageDialog(this, "El campo de nombre está vacío.");
        }
    }

    // Método para actualizar un medicamento desde la tabla
 // Método para actualizar un medicamento desde la tabla
    private void actualizarMedicamento() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            // Se ha seleccionado una fila, por lo que los datos de la tabla ya han sido modificados por el usuario.
            JOptionPane.showMessageDialog(this, "Los cambios han sido guardados.");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un medicamento para actualizar.");
        }

    }

    // Método para eliminar un medicamento por código ingresado en txtCodigo
    private void eliminarMedicamentoPorCodigo() {
        String codigo = txtCodigo.getText();

        if (!codigo.isEmpty()) {
            boolean encontrado = false;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                if (tableModel.getValueAt(i, 1).equals(codigo)) {
                    comboBox.removeItem(tableModel.getValueAt(i, 0)); // Eliminar del ComboBox
                    tableModel.removeRow(i); // Eliminar de la tabla
                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "Medicamento eliminado correctamente.");
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "El código del medicamento no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un código válido.");
        }
    }

    public static void main(String[] args) {
        Medicamentos gui = new Medicamentos();
        gui.setVisible(true);
    }
}
