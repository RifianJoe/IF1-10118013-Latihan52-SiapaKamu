/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan52.siapakamu;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
          
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(27);
        dosen.setNama("Rizki Adam Kurniawan");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
          
        System.out.println();
          
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        mahasiswa.setKelas("PBO2");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
