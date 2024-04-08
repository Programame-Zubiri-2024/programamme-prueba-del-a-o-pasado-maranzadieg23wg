import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        //https://ourense.programame.com/team/problems/19/text






        int z1 = 0;
        int z2 = 0;
        int z3 = 0;

        while (true){

            z1 = in.nextInt();
            z2 = in.nextInt();
            z3 = in.nextInt();

            if (z1 == -1 && z2 == -1 && z3 == -1){
                break;
            }
            int egunak = egun(z1, z2, z3);

            //System.out.println(egunak);
            if (egunak == -1){
                erantzuna.add("OLVIDA LOS CAMELLOS");
            }else {
                erantzuna.add(String.valueOf(egunak));
            }




        }

        for (String s : erantzuna) {
            System.out.println(s);
        }
    }

    static int egun(int z1, int z2, int z3){

        if (z2<z3){
            return -1;
        }

        int z = z2 -z3;
        return z1 /z;

    }



}
