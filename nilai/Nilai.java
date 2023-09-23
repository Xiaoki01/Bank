package nilai:

import java.util.Scanner;

    public class Nilai {
        public static void main(String[] args) {

        
        int nilai;
        String nama, nim, hasil;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Terima kasih telah mengikuti ujian");
        System.out.println("---Silahkan isi seperti yang diperintahkan---");
        
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("NIM : ");
        nim = keyboard.nextLine();
        System.out.print("Nilai : ");
        nilai = keyboard.nextInt();
        
        if ( nilai >= 85 ) {
            hasil = "A";
        } else if ( nilai >= 75 ) {
            hasil = "B";
        } else if ( nilai >= 60 ) {
            hasil = "C";
        } else if ( nilai >= 50 ) {
            hasil = "D";
        } else {
            hasil = "E";
        }
        
        System.out.println("Terima kasih telah mengisi data");
        System.out.println("Halo " + nama + "\n" + "NIM : " + nim);
        System.out.println("Nilai anda : " + hasil);
    }
}    