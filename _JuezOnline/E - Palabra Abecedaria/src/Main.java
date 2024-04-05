import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/16/text



        String abezedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";





        String linea ="";
        while (!linea.equals("ABCD")){

            linea = in.nextLine();
            char[] lista = linea.toCharArray();

            int zenbat =0;
            ArrayList<Integer> posizioak = new ArrayList<>();
            for (char c : lista) {
                posizioak.add(abezedario.indexOf(c));
            }

            boolean jarraian = false;
            for (int i =0;i< posizioak.size();i++){
                int z1 = posizioak.get(i);
                int z2 = posizioak.get(i+1);

                if (z1>z2){
                    jarraian = false;
                    i = posizioak.size()+2;
                }else {
                    jarraian = true;
                }
            }
            if(jarraian){
                zenbat++;
            }

            erantzuna.add(zenbat);






        }

        for (Integer s : erantzuna) {
            System.out.println(s);
        }
    }



}
