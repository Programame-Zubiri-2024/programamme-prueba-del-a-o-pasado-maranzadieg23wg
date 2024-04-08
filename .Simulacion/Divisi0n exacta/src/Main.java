

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.lineSeparator;

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

            float era1 = (float) z1 /z2;

            String a = era1+"";



            //System.out.println(era1);
            float era = era1;
            ArrayList<Integer> lista = new ArrayList<>();

            int z =0;
            for (int i =0;i<a.length();i++){
                era-=z;
                era = era*10;
                z = (int) era;
                lista.add(z);
            }

            if (a.length() ==3){

                System.out.println(a);
            }else {
                int p1 =-1;
                int p2 =-1;

                for (int i =0;i<lista.size();i++){
                    int zt = lista.get(i);

                    for (int e=i+1;e<lista.size()-1;e++){
                        int zb = lista.get(e);


                        if (zt == zb){

                            p1 = i;
                            p2 = e;
                            //System.out.println("p1: "+p1);
                            //System.out.println("p2: "+p2);
                            i = lista.size()+2;
                            e = i;
                            break;

                        }

                        if (p1 != -1 && p2 != -1) {
                            break;
                        }
                    }
                }

                String eraf = "";
                //System.out.println("p1: "+p1);
                //System.out.println("p2: "+p2);

                boolean bai = false;
                for (int i =0;i<p2;i++){

                    if (i == p1){
                        eraf += "|";
                        bai = true;

                    }
                    eraf+=lista.get(i);
                }
                if (bai){
                    eraf+="|";
                }


                System.out.println(z1/z2+"."+eraf);
            }















        }





        for (Integer s : erantzuna) {
            System.out.println(s);
        }


    }


}
