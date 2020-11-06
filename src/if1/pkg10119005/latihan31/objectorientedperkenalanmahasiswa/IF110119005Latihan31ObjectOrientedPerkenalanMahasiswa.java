/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini memperkenalkan mahasiswa dengan pendekatan
 *                     berbasis objek 
 */
public class IF110119005Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Hayin Ananta";
        mhs1.nim = "10119005";

        Mahasiswa mhs2 = new Mahasiswa();  
        mhs2.nama = "Ilham Zaki";
        mhs2.nim =  "10119006";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "M Ikhlas N R";
        mhs3.nim = "10119022";       
                
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nama = "Dandi Ahmadin";
        mhs4.nim = "10119033";
      
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
    }
    
}
