

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.lineSeparator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://aceptaelreto.com/problem/statement.php?id=634&cat=152

        int zenbat = in.nextInt();
        in.nextLine();

        //in.nextInt();
        for (int i =0;i<zenbat;i++){
            String notak = in.nextLine();

            //System.out.println(notak);

            char[] lista = notak.toCharArray();

            boolean ongi = false;
            int kombo =1;
            int puntuak =0;

            for (char a : lista){

                if (a != '.'){

                    if (ongi){
                        puntuak+= kombo*10;

                    }else {
                        puntuak+= 10;
                        ongi = true;
                    }

                    kombo++;

                }else {
                    ongi = false;
                    kombo=1;
                }
            }

            erantzuna.add(puntuak);


        }


        for (Integer s : erantzuna) {
            System.out.println(s);
        }


    }


}
