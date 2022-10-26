/*  Copyright.
 *  AKHMAD ADJIE MARZUKI
 *  312110564
 *  TI.21.C2
 *  PRAKTIKUM 2 ACCCESS MODIFIER + SETTER + GETTER + CLASS PESRON
 */

public class Person {
 // ATTRIBUTE WITH ACCESS MODIFIER
    private String nama, jenisKelamin;
    private int umur;

 // SETTER
    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin (String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setUmur (int umur) {
        this.umur = umur;
    }

 // GETTER
    public String getNama () {
        return this.nama;
    }
    public String getJenisKelamin () {
        return this.jenisKelamin;
    }
    public int getUmur () {
        return this.umur;
    }

    public static void main(String[] args) {
        // MEMBUAT OBJECT
       Person orang1 = new Person();
       Person orang2 = new Person();
   
        // MEMANGGIL ATTRIBUTE DAN MEMBERI NILAI
       orang1.setNama("Anton");
       orang1.setJenisKelamin("Laki-laki");
       orang1.setUmur(21);

       orang2.setNama("Riko");
       orang2.setJenisKelamin("Laki-laki");
       orang2.setUmur(25);

       System.out.println("\tLATIHAN PRAKTIKUM2 ACCCESS MODIFIER + SETTER + GETTER + CLASS PESRON\n");

       System.out.println("Nama orang pertama : " + orang1.getNama());
       System.out.println("Jenis Kelamin orang pertama : " + orang1.getJenisKelamin());
       System.out.println("Umur orang pertama : " + orang1.getUmur());
       System.out.println("\n=======================================================\n");
       System.out.println("Nama orang Kedua : " + orang2.getNama());
       System.out.println("Jenis Kelamin orang Kedua : " + orang2.getJenisKelamin());
       System.out.println("Umur orang Kedua : " + orang2.getUmur());



   }

}