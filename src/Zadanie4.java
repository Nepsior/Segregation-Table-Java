import java.util.Arrays;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int[] tab = new int[3];

        tab[0] = scan.nextInt();
        tab[1] = scan.nextInt();
        tab[2] = scan.nextInt();

        Arrays.sort(tab);


        for(byte i = 0; i<3; i++)
        {
            System.out.println(tab[i]);
        }


    }

}
