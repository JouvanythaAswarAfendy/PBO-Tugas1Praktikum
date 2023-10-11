/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum01;

/**
 *
 * @author HP
 */
public class DemoNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai nilaiAkhir = new Nilai();
        
        nilaiAkhir.nim = "2210631170024";
        nilaiAkhir.nama = "Jouvanytha Aswar Afendy";
        nilaiAkhir.absen = 100;
        nilaiAkhir.tugas = 90;
        nilaiAkhir.uts = 85;
        nilaiAkhir.uas = 95;
        
        nilaiAkhir.CetakNilai();
    }
    
}
