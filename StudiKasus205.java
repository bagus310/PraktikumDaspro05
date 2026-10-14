import java.util.Scanner;

public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA: ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        boolean lolosKriteria = false;
        String alasanKriteria = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("peringkat juara: ");
            int juara = sc.nextInt();
            if (juara >= 1 && juara <= 3) {
                lolosKriteria = true;
            } else {
                alasanKriteria = "Peringkat juara tidak memenuhi kriteria (harus juara 1-3)";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan (1=lolos, 0=tidak lolos): ");
            int statusPKM = sc.nextInt();
            if (statusPKM == 1) {
                lolosKriteria = true;
            } else {
                alasanKriteria = "Status pendanaanPKM tidak lolos";
            }
        } else {
            alasanKriteria = "jenis kegiatan lainnya tidak memperoleh dana";
        }
        System.out.println("nama mahasiswa: " + nama);

        if (lolosKriteria) {
            if (jumlahDokumen >= 4) {
                System.out.println("Status dokumen lengkap. dana penghargaan diberikan");
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Dokumen tidak lengkap, kurang " + kurang + " dokumen. dana penghargaan tidak diberikan");
            } 
        } else {
            System.out.println("Alasan: " + alasanKriteria + ". dana penghargaan tida diberikan");
        }

        sc.close();
    } 
}