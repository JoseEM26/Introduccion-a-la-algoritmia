package clases;

import javax.swing.table.DefaultTableModel;
import java.io.*;

public class ArchivoMedicamentos {

    private final String rutaArchivo = "medicamentos.txt";

    public void guardarMedicamentosEnArchivo(DefaultTableModel tableModel) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String nombre = (String) tableModel.getValueAt(i, 0);
                String codigo = (String) tableModel.getValueAt(i, 1);
                String tipo = (String) tableModel.getValueAt(i, 2);
                String fechaVencimiento = (String) tableModel.getValueAt(i, 3);
                int stock = (Integer) tableModel.getValueAt(i, 4);
                writer.write(nombre + "," + codigo + "," + tipo + "," + fechaVencimiento + "," + stock);
                writer.newLine();
            }
        }
    }

    public void cargarMedicamentosDesdeArchivo(DefaultTableModel tableModel) throws IOException {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    String nombre = datos[0];
                    String codigo = datos[1];
                    String tipo = datos[2];
                    String fechaVencimiento = datos[3];
                    int stock = Integer.parseInt(datos[4]);
                    tableModel.addRow(new Object[]{nombre, codigo, tipo, fechaVencimiento, stock});
                }
            }
        }
    }
}
