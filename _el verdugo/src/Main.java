import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> erantzuna = new ArrayList<>();

        String hitza;
        while (!(hitza = in.nextLine()).equals(".")) {
            String saiakera = in.nextLine();
            char[] listaHitzak = hitza.toCharArray();
            char[] saiakeraLista = saiakera.toCharArray();
            int gaizki = 0;
            boolean[] asmatuta = new boolean[hitza.length()];

            for (int e =0;e<saiakeraLista.length;e++) {
                boolean letraGaizki = false;
                for (int i = 0; i < listaHitzak.length; i++) {
                    if (listaHitzak[i] == saiakeraLista[e]) {
                        asmatuta[i] = true;
                        letraGaizki = true;
                    }
                }
                if (!letraGaizki) {
                    boolean dago = false;
                    for (int a = e-1;a>0;a--){
                        if (saiakeraLista[e] == saiakeraLista[a]) {
                            dago = true;
                            break;
                        }
                    }
                    if (!dago){
                        gaizki++;
                    }
                }
            }

            boolean ahorcado = gaizki >= 7;
            boolean guztiakAsmatuta = true;
            for (boolean asmatu : asmatuta) {
                if (!asmatu) {
                    guztiakAsmatuta = false;
                    break;
                }
            }

            if (guztiakAsmatuta) {
                erantzuna.add("SALVADO");
            } else if (ahorcado) {
                erantzuna.add("AHORCADO");
            } else {
                erantzuna.add("COLGANDO");
            }
            //System.err.println("gaizki: "+gaizki);

        }

        for (String r : erantzuna) {
            System.out.println(r);

        }
    }
}
