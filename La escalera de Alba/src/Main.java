import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://aceptaelreto.com/problem/statement.php?id=681&cat=156


        for (int i =0;i<3;i++){

            int zenbat = in.nextInt();

            ArrayList<Integer> lista = new ArrayList<>();
            for (int e =0;e<zenbat;e++){
                int z = in.nextInt();
                lista.add(z);
            }

            lista = ordenatu(lista);

            int eskalera =0;

            for (int e =0;e<lista.size()-1;e++){
                int z1 = lista.get(e);
                int z2 = lista.get(e+1);
                if (z1 == z2){
                    z2--;
                    lista.set(e+1, z2);
                }
            }
            for (Integer z : lista){
                eskalera+=z;
            }
            erantzuna.add(eskalera);

        }

        for (Integer r : erantzuna) {
            System.out.println(r);

        }
    }

    static ArrayList<Integer> ordenatu(ArrayList<Integer> li){
        for (int i =0;i<li.size();i++){
            for (int e =0;e<i;e++){
                int z1 = li.get(e);
                int z2 = li.get(e+1);
                int z3 =0;
                if (z1<z2){
                    z3 = z1;
                    z1 = z2;
                    z2 = z3;
                    li.set(e, z1);
                    li.set(e+1, z2);
                }
            }
        }
        return li;
    }

}
