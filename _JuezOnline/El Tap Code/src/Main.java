import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/13/text



        char[] abezedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] l1 = new char[5][5];
        int pos =0;

        for (int a =0;a< l1.length;a++){
            for (int e =0;e<l1.length;e++){
                l1[a][e] = abezedario[pos];
                pos++;

            }
        }
        //inprimatu(l1);




        int zenbat = in.nextInt();
        for (int i =0;i<=zenbat;i++){
            StringBuilder gehitu = new StringBuilder();

            String izkia = in.nextLine();

            izkia = izkia.toUpperCase();
            char [] izkiLista = izkia.toCharArray();

            for (char value : izkiLista) {
                char iz = value;
                if (iz == 'K') {
                    iz = 'C';
                }
                for (int a = 0; a < l1.length; a++) {
                    for (int e = 0; e < l1.length; e++) {
                        if (l1[a][e] == iz) {
                            if (gehitu.isEmpty()){
                                gehitu.append(asterizko(a, e));
                            }else {
                                gehitu.append(" ").append(asterizko(a, e));
                            }
                        }
                    }
                }
            }

            erantzuna.add(gehitu.toString());





        }

        for (String s : erantzuna) {
            System.out.println(s);
        }
    }

    static String asterizko(int z, int x){

        StringBuilder i1 = new StringBuilder();
        StringBuilder i2 = new StringBuilder();


        for (int i =0;i<=z;i++){
            i1.append("*");
        }
        for (int i =0;i<=x;i++){
            i2.append("*");
        }


        return i1+" "+i2;


    }

    public static void inprimatu (char [] []matrizea){

        //inprimatzen du matrizea
        //System.out.println("Hau da bukaerako matrizea: ");

        for (int i = 0;i<matrizea.length;i++){
            for (int e = 0;e<matrizea.length;e++){
                System.out.print(matrizea[i][e]+"  ");
            }
            System.out.println(" ");
        }


    }

}
