package Guis;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Clases.Producto;
import java.awt.Color;

public class Dlg_ListadoProductos extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JButton btnNewButton;
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            Dlg_ListadoProductos dialog = new Dlg_ListadoProductos();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public Dlg_ListadoProductos() {
        setBounds(100, 100, 464, 358);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(128, 0, 255));
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        
        btnNewButton = new JButton("Productos bajo stock mínimo");
        btnNewButton.setBackground(new Color(0, 0, 128));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(10, 12, 210, 23);
        contentPanel.add(btnNewButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 46, 428, 262);
        contentPanel.add(scrollPane);
        
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        
        JButton btnNewButton_1 = new JButton("Listado por unidades vendidas");
        btnNewButton_1.setBackground(new Color(0, 0, 128));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implementar la lógica para listar por unidades vendidas
            }
        });
        btnNewButton_1.setBounds(230, 12, 208, 23);
        contentPanel.add(btnNewButton_1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNewButton) {
            mostrarProductosBajoStockMinimo();
        }
    }

    // Método para mostrar productos bajo stock mínimo
    private void mostrarProductosBajoStockMinimo() {
        textArea.setText("");
        // Aquí deberías implementar la lógica para obtener productos bajo stock mínimo
        // y mostrarlos en el textArea
        ArrayList<Producto> productosStockBajo = obtenerProductosStockBajo();
        mostrarProductosEnTextArea(productosStockBajo);
    }

    // Ejemplo de método para obtener productos bajo stock mínimo (debe ser implementado)
    private ArrayList<Producto> obtenerProductosStockBajo() {
        // Implementar la lógica para obtener productos con stock bajo mínimo
        return new ArrayList<Producto>();  // Placeholder, reemplazar con lógica real
    }

    // Método para mostrar productos en el textArea
    private void mostrarProductosEnTextArea(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            String infoProducto = 
                    "  Código        : " + producto.getCodigoProducto() + "\n" +
                    "  Nombre        : " + producto.getNombre() + "\n" +
                    "  Stock Actual  : " + producto.getStockActual() + "\n" +
                    "  Stock Mínimo  : " + producto.getStockMinimo() + "\n\n";
            textArea.append(infoProducto);
        }
    }
}
