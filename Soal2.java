import java.lang.reflect.Array;
import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        int n = 4; // ukuran tangga
        String[] steps = new String[n]; // Array dummy untuk foreach

        // Mengisi array steps dengan nilai yang akan membantu kita membuat tangga
        Arrays.fill(steps, "#");

        // Indeks untuk menghitung spasi
        int i = 1;

        for (String step : steps) {
            // Mencetak spasi yang sesuai dan simbol #
            System.out.printf("%" + n + "s%n", step.repeat(i));
            i++;
        }
    }
}

