import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/17/text








        HashMap<String, Integer[]> taldea1 = new HashMap<>();
        String izena1 = in.nextLine();



        while (true){

            String taldekoak = in.nextLine();
            //System.out.println(taldekoak);

            if (taldekoak.equals(izena1)){
                break;
            }else {
                String[] kirolaria= taldekoak.split(",");
                Integer[] puntuak = new Integer[kirolaria.length-1];
                for (int e =1;e< kirolaria.length;e++){
                    puntuak[e-1] = Integer.valueOf(kirolaria[e]);
                }
                taldea1.put(kirolaria[0], puntuak);
            }
        }

        HashMap<String, Integer[]> taldea2 = new HashMap<>();
        String izena2 = in.nextLine();

        while (true){

            String taldekoak = in.nextLine();

            if (taldekoak.equals(izena2)){
                break;
            }else {
                String[] kirolaria= taldekoak.split(",");
                Integer[] puntuak = new Integer[kirolaria.length-1];
                for (int e =1;e< kirolaria.length;e++){


                    puntuak[e-1] = Integer.valueOf(kirolaria[e]);
                }
                taldea2.put(kirolaria[0], puntuak);
            }
        }


        for (Map.Entry<String, Integer[]> entry : taldea1.entrySet()) {
            String izena = entry.getKey();
            Integer[] puntuak = entry.getValue();

            int guztira = puntuak[1]+puntuak[2]+puntuak[3]-puntuak[4]-puntuak[5]-puntuak[6];

            String gehitzeko = izena+" ("+guztira+")";

            if (puntuak[0] !=0){
                erantzuna.add(gehitzeko);
            }

        }

        for (Map.Entry<String, Integer[]> entry : taldea2.entrySet()) {
            String izena = entry.getKey();
            Integer[] puntuak = entry.getValue();

            int guztira = puntuak[1]+puntuak[2]+puntuak[3]-puntuak[4]-puntuak[5]-puntuak[6];

            String gehitzeko = izena+" ("+guztira+")";

            if (puntuak[0] !=0){
                erantzuna.add(gehitzeko);
            }

        }


        for (String s : erantzuna) {
            System.out.println(s);
        }


    }





}
