public class Soal1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2}; // contoh array
        int sum =0;

        // Menggunakan foreach loop untuk menjumlahkan elemen-elemen array
        for (int num : ar) {
            sum += num;
        }

        System.out.println("Jumlah elemen array adalah: " + sum);
    }
}
