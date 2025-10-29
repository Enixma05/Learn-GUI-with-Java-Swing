
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        
        String nama = JOptionPane.showInputDialog("Masukkan Nama Anda");
        JOptionPane.showMessageDialog(null, "Halo " + nama);

        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Usia Anda:"));
        JOptionPane.showMessageDialog(null, "Umur anda: " + umur);

        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi Anda:"));
        JOptionPane.showMessageDialog(null, "Umur anda: " + tinggi);
    }
}
