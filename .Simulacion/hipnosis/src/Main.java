

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://aceptaelreto.com/problem/statement.php?id=640&cat=152









        while (true){
            int z1 = in.nextInt();
            int z2 = in.nextInt();

            if (z1 ==0 && z2==0){
                break;
            }

            int z = z1/2;

            if (z<z2){
                erantzuna.add(z2+z);
            } else {
                erantzuna.add(z1+z2+z);
            }


        }





        for (Integer s : erantzuna) {
            System.out.println(s);
        }


    }


}
