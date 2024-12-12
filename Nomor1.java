import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        tampilkanGanjil(N);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
        public static void tampilkanGanjil(int N) {
        for (int i = 0; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
    }
}
