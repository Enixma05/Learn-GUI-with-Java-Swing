import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) throws Exception {
       
        ImageIcon image = new ImageIcon(Main.class.getResource("Logo.png")); // buat icon
        Border batas = BorderFactory.createLineBorder(Color.CYAN,3); // buat border
        
        // JLabel =  area buat nampilin string, gambar, atau keduanya
        JLabel label = new JLabel(); // buat label
        label.setText("Halo ini label"); // buat teks di label
        label.setIcon(image); // taruh icon di label
        label.setHorizontalTextPosition(JLabel.CENTER); // set teks dari arah ImageIcon secara horizontal
        label.setVerticalTextPosition(JLabel.TOP); // set teks dari arah ImageIcon secara vertikal
        label.setForeground(new Color(0x00FFFF)); // atur warna font
        label.setFont(new Font("MV Boli", Font.PLAIN,50)); // atur jenis font
        label.setIconTextGap(-10); // atur gap antara text dan image
        label.setBackground(Color.BLACK); // atur warna backgorund
        label.setOpaque(true); // tampilin warna background
        label.setBorder(batas); // terapkan border
        label.setVerticalAlignment(JLabel.CENTER); // set teks+icon secara vertikal dari label
        label.setHorizontalAlignment(JLabel.CENTER); // set teks+icon secara horizontal dari label
        // label.setBounds(100, 100, 350, 350); // untuk ngatur posisi label & dimensinya pada frame (harus ada jika tidak ada layoutManager)

        JFrame frame = new JFrame();
        frame.setTitle("Frame-ku"); 
        //frame.setSize(690, 690); // tidak butuh jika ada pack()
        // frame.setLayout(null); // default = BorderLayout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // method yang menyesuaikan ukuran Window (JFrame) secara otomatis
    }
}
