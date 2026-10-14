import java.util.Scanner;
public class StudiKasus105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar:Rp ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("total harga :Rp " + totalHarga);
        System.out.println("diskon:Rp " + diskon);
        System.out.println("total bayar:Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kemablian:Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang Rp " + kurang);
        }
        
        sc.close();
    }
}