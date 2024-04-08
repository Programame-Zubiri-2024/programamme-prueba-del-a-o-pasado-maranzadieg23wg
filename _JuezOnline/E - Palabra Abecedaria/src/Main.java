import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/16/text



        String abezedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";





        String linea ="";
        while (!linea.equals("ABCD")){


            linea = in.nextLine();
            if (linea.equals("ABCD")){
                break;
            }

            //linea = linea.replace(" ", "");
            linea = linea.toUpperCase(Locale.ROOT);

            linea = errepikatu(linea);
            char[] lista = linea.toCharArray();

            int zenbat =0;
            ArrayList<Integer> posizioak = new ArrayList<>();
            for (char c : lista) {
                //System.out.println("c: "+c+" "+abezedario.indexOf(c));
                posizioak.add(abezedario.indexOf(c));
            }


            ArrayList<Integer> proba = new ArrayList<>();
            boolean jarraian = false;
            for (int i =0;i< posizioak.size();i++){
                int z1 = posizioak.get(i);
                //int z2 = posizioak.get(i+1);
                //System.out.println("z1: "+z1);
                //System.out.println("z2: "+z2);



                if (z1 == -1){
                    //proba.add(z1);

                    jarraian = jarraian(proba);
                    proba.clear();

                }else {
                    jarraian = false;
                    proba.add(z1);
                    //proba.add(z2);
                    if ( i == posizioak.size()-1){
                        jarraian = jarraian(proba);
                        proba.clear();
                    }
                }





                if(jarraian){
                    zenbat++;
                }
            }


            erantzuna.add(zenbat);
            //System.out.println(zenbakiak);

        }

        for (Integer s : erantzuna) {
            System.out.println(s);
        }
    }

    static boolean jarraian (ArrayList<Integer> lista){




        for (int i =0;i<lista.size()-1;i++){
            int z1 = lista.get(i);
            int z2 = lista.get(i+1);

            if (z1>z2){
                return false;
            }
        }
        return true;


    }

    static String errepikatu(String linea){

        String[] lista = linea.split(" ");

        HashSet<String> ezErrepikatu = new HashSet<>();

        ezErrepikatu.addAll(Arrays.asList(lista));


        String bukaera = "";

        for (String i : ezErrepikatu){
            bukaera = bukaera+i+" ";
        }


        return bukaera;


    }



}
