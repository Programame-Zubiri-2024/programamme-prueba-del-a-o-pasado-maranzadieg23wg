import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        //https://aceptaelreto.com/problem/statement.php?id=680&cat=156


        int zenbat = in.nextInt();
        for (int i =0;i<zenbat;i++){

            int z1 = in.nextInt();
            int z2 = in.nextInt();
            int z3 = in.nextInt();

            boolean eginDaiteke = false;

            if (z2>= z1){
                eginDaiteke = true;
            } else if (z3>= z2) {
                eginDaiteke = false;
            } else if (z2 > z3) {
                eginDaiteke = true;
            }

            if (!eginDaiteke){
                erantzuna.add("IMPOSIBLE");
            }else {

                int zenb = 0;

                while ( z1>= 0){
                    zenb++;
                    z1-=z2;
                    z1+=z3;
                }
                erantzuna.add(String.valueOf(zenb-1));
            }


        }

        for (String r : erantzuna) {
            System.out.println(r);

        }
    }


}
