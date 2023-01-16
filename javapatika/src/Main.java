import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     int mat,fiz,kim,turk,tar,muz;

     Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fiz = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kim = inp.nextInt();

        System.out.print("Turkce notunuz :");
        turk = inp.nextInt();

        System.out.print("Tarih notunuz :");
        tar = inp.nextInt();

        System.out.print("Muzik notunuz :");
        muz = inp.nextInt();

        int ortalama = (mat+fiz+kim+turk+tar+muz)/6;
        System.out.print(ortalama);
    }
}


