import java.util.Scanner;

public class Studikasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        boolean lolosKriteria = false;
        String alasanKriteria = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                lolosKriteria = true;
            } else {
                alasanKriteria = "peringkat juara tidak memenuhi syarat (harus juara 1, 2, atau 3)";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan (1=lolos, 0=tidak) : ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                lolosKriteria = true;
            } else {
                alasanKriteria = "PKM tidak lolos pendanaan";
            }

        } else {
            alasanKriteria = "jenis kegiatan Lainnya tidak memperoleh dana";
        }

        System.out.println("\n--- HASIL VALIDASI ---");
        System.out.println("Nama Mahasiswa : " + nama);

        if (lolosKriteria) {
            if (jumlahDokumen == 4) {
                System.out.println("Status         : Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status         : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status         : Dana penghargaan tidak diberikan karena " + alasanKriteria + ".");
        }

        sc.close();
    }
}