import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        int zenbat = in.nextInt();
        for (int i =0;i<=zenbat;i++){
            //System.out.println("i: "+i);

            in.nextLine();
            String sekuentzia = in.nextLine();
            //System.out.println(sekuentzia.length());
            sekuentzia = sekuentzia.replace(".", "");
            //System.out.println(sekuentzia.length());
            String[] lista = sekuentzia.split(" ");


            ArrayList<String> era = new ArrayList<>();

            /*for (int e =0; e<lista.length;e++){
                //era.add(lista[e]);
                //System.out.println("e: "+e);
                if (e ==0 && (lista[e].equals("<") || lista[e].equals(">"))){

                }else if (e == lista.length-1 && (lista[e].equals(">"))){
                    era.add(lista[e]);
                }else if (lista[e].equals("<")){
                    era.add(lista[e-1]);
                }else if (lista[e].equals(">")){
                    era.add(lista[e-1]);
                }
            }*/

            era.addAll(Arrays.asList(lista));
            //System.out.println(era.size());
            while (era.contains("<") || era.contains(">")){
                for (int e =0; e<era.size();e++){

                    System.out.println("e2: "+e);

                    if (e ==0 && (era.get(e).equals("<") || era.get(e).equals(">"))){
                        era.remove(0);
                        //era.add(0, "");
                    }else if (e == era.size()-1 && (era.get(e).equals(">"))){

                        //era.remove(era.size()-1);
                        era.remove(e);
                        era.add(era.get(e-1));

                    }else if (era.get(e).equals("<")){

                        era.remove(e);
                        era.remove(e-1);



                    }else if (era.get(e).equals(">")){
                        era.remove(e);

                        for (int t = e-1;t>0;t--){
                            if (lista[e-t].equals("<") || lista[e-t].equals(">")){

                            }else {
                                era.add(e,lista[e - t]);
                                t = -2;
                            }
                        }

                    }
                    erakutsi(era);

                }

            }

            String batuta = "";
            for (String a : era){
                batuta = batuta+ " "+a;
            }
            erantzuna.add(batuta);


        }

        for (String r : erantzuna) {
            System.out.println(r);

        }
    }

    public static void erakutsi(ArrayList<String> e){
        String batuta = "";
        for (String a : e){
            batuta = batuta+ " "+a;
        }
        System.out.println(batuta);
    }
}
