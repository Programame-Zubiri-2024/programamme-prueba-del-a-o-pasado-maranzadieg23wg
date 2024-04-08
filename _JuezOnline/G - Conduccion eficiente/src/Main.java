

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/18/text







        String izena1 = "";

        while (true){
            izena1 = in.nextLine();

            if (izena1.equals("STOP TEST")){
                break;
            }

            izena1 = izena1.substring(0, izena1.length()-1);
            //System.out.println(izena1);
            String[] lista = izena1.split("#");

            int denbora =0;
            int azeledadorea =0;
            int zenbat =0;

            boolean ten = true;
            for (int i =0;i<lista.length;i++){
                if (!lista[i].equals("#")){
                    zenbat++;
                    if (ten){
                        azeledadorea+= Integer.parseInt(lista[i]);
                        ten = false;
                    }else {
                        denbora+= Integer.parseInt(lista[i]);
                        ten = true;
                    }
                }
            }

            int ehuneko = azeledadorea/zenbat*100/denbora;

            //System.out.println(ehuneko);
            if  (ehuneko>75 && ehuneko<100){
                erantzuna.add("VERY INEFFICIENT DRIVING");
            } else if (ehuneko>=50 && ehuneko<=75) {
                erantzuna.add("INEFFICIENT DRIVING");
            }else if (ehuneko>=25 && ehuneko<=50) {
                erantzuna.add("EFFICIENT DRIVING");
            }else if (ehuneko>=0  && ehuneko<=25) {
                erantzuna.add("VERY EFFICIENT DRIVING");
            }


        }





        for (String s : erantzuna) {
            System.out.println(s);
        }


    }





}
