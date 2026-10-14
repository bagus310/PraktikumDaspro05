import java.util.Scanner;

public class Studikasus1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 5000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } 

    }
}