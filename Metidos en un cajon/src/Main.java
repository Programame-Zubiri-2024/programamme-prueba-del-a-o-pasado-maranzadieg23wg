import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://aceptaelreto.com/problem/statement.php?id=682&cat=156

        int zenbat = in.nextInt();
        for (int i =0;i<zenbat;i++){

            int ateK = in.nextInt();
            int pik = ateK;
            int anka = ateK*2;
            erantzuna.add(pik);
            erantzuna.add(anka);



        }

        for (int i =0;i<erantzuna.size();i+=2){
            System.out.print(erantzuna.get(i)+" ");
            System.out.println(erantzuna.get(i+1));

        }
    }



}
