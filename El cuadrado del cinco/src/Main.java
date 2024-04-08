import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static java.util.Scanner in;

    public static void main(String[] args) {


        //https://aceptaelreto.com/problem/statement.php?id=677&cat=156

        in = new Scanner(System.in);

        ArrayList<Integer> eran = new ArrayList<>();

        int zenbat = in.nextInt();



        for (int i =0;i<zenbat;i++){


            int z = in.nextInt();
            eran.add((int) Math.pow(z, 2));




        }

        for (Integer i : eran){
            System.out.println(i);
        }


    }
}