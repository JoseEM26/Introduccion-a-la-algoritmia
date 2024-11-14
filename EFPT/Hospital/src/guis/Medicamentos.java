package guis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clases.ArchivoMedicamentos;
import java.io.IOException;

public class Medicamentos extends JFrame {
    private JTextField textFieldNombre;
    private JComboBox<String> comboBox;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtCodigo;
    private JTextField txtStock;
    private int codigoActual = 1000;
    private ArchivoMedicamentos archivoMedicamentos = new ArchivoMedicamentos();

    public Medicamentos() {
        setTitle("Gestión de Medicamentos");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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

        String[] columnNames = {"Nombre", "Código", "Tipo", "Fecha de Vencimiento", "Stock"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
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

        cargarDatosDesdeArchivo();

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarMedicamento();
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarMedicamento();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarMedicamentoPorCodigo();
            }
        });
    }

    private void registrarMedicamento() {
        String nombre = textFieldNombre.getText();
        if (!nombre.isEmpty()) {
            String codigo = String.valueOf(codigoActual++);

            String[] tiposMedicamentos = {"Analgésico", "Antiinflamatorio", "Antibiótico", "Antidepresivo", "Antihistamínico"};
            String tipo = tiposMedicamentos[(int) (Math.random() * tiposMedicamentos.length)];

            int año = 2025 + (int) (Math.random() * (5)); 
            int mes = 1 + (int) (Math.random() * 12); 
            int dia = 1 + (int) (Math.random() * 28); 
            String fechaVencimiento = String.format("%02d-%02d-%02d", dia, mes, año % 100);
         
            int stock = 1 + (int) (Math.random() * 100); 
            comboBox.addItem(nombre);
            tableModel.addRow(new Object[]{nombre, codigo, tipo, fechaVencimiento, stock});

            JOptionPane.showMessageDialog(this, "Nuevo medicamento registrado.");
            textFieldNombre.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "El campo de nombre está vacío.");
        }
    }


    private void actualizarMedicamento() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            try {
                archivoMedicamentos.guardarMedicamentosEnArchivo(tableModel);
                JOptionPane.showMessageDialog(this, "Los cambios han sido guardados.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un medicamento para actualizar.");
        }
    }

    private void eliminarMedicamentoPorCodigo() {
        String codigo = txtCodigo.getText();
        if (!codigo.isEmpty()) {
            boolean encontrado = false;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                if (tableModel.getValueAt(i, 1).equals(codigo)) {
                    comboBox.removeItem(tableModel.getValueAt(i, 0));
                    tableModel.removeRow(i);
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

    private void cargarDatosDesdeArchivo() {
        try {
            archivoMedicamentos.cargarMedicamentosDesdeArchivo(tableModel);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Medicamentos gui = new Medicamentos();
        gui.setVisible(true);
    }
}
