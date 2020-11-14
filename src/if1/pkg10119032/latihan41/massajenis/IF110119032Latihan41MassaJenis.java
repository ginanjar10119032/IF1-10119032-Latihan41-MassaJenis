package if1.pkg10119032.latihan41.massajenis;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan massa jenis kubus 
 * dengan pendekatan berorientasi objek
 */

public class IF110119032Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus1 = new Kubus();
        kubus1.setSisi(5);
        kubus1.setMassa(250);
        
        System.out.println("=====Massa Jenis Kubus======");
        System.out.println("Sisi\t: " + kubus1.getSisi());
        System.out.println("Massa\t: " + kubus1.getMassa());
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume\t: " + kubus1.hitungVolume(kubus1.getSisi()));
        System.out.println("Massa Jenis : " + kubus1.hitungMassaJenis(kubus1.getMassa(), kubus1.getSisi()));
    }
    
}