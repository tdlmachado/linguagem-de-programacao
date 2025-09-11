import java.util.Scanner;

public class Aninhados {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0)continue;
                if (i == 2) break;
                System.out.println(i+" "+j);
            }
        }
    }
}