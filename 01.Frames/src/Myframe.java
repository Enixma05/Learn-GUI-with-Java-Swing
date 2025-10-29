import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame{
    // buat JFrame dengan pewarisan
    public Myframe(){
        this.setTitle("Frame-ku"); //buat title framenya
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // buat keluar dari frame
        this.setResizable(false); // untuk cegah ganti ukuran frame
        this.setSize(690, 690); // ukuran frame (x, y)
        this.setVisible(true); // buat frame supaya terlihat

        ImageIcon logo = new ImageIcon(Myframe.class.getResource("/Logo.png")); //buat icon frame
        this.setIconImage(logo.getImage()); //ganti icon pada frame
        this.getContentPane().setBackground(new Color(0x324243)); //ganti warna background
    }
}