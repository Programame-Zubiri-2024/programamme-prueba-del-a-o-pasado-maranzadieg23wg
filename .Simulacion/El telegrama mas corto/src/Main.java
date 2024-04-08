

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

            String mezua = in.nextLine();

            erantzuna.add(zenbat(mezua));





        }


        for (Integer s : erantzuna) {
            System.out.println(s);
        }


    }

    static int zenbat(String mezua) {

        int puntuak = 0;
        char[] lista = mezua.toCharArray();

        puntuak += 3;


        for (char a : lista) {
            if (a == 'A') {
                puntuak += 5;
            } else if (a == 'B') {
                puntuak += 10;
            } else if (a == 'C') {
                puntuak += 11;
            } else if (a == 'D') {
                puntuak += 8;
            } else if (a == 'E') {
                puntuak += 1;
            } else if (a == 'F') {
                puntuak += 9;
            } else if (a == 'G') {
                puntuak += 10;
            } else if (a == 'H') {
                puntuak += 7;
            } else if (a == 'I') {
                puntuak += 3;
            } else if (a == 'J') {
                puntuak += 13;
            } else if (a == 'K') {
                puntuak += 9;
            } else if (a == 'L') {
                puntuak += 9;
            } else if (a == 'M') {
                puntuak += 7;
            } else if (a == 'N') {
                puntuak += 5;
            } else if (a == 'O') {
                puntuak += 11;
            }else if (a == 'P') {
                puntuak += 11;
            } else if (a == 'Q') {
                puntuak += 13;
            } else if (a == 'R') {
                puntuak += 7;
            } else if (a == 'S') {
                puntuak += 5;
            } else if (a == 'T') {
                puntuak += 3;
            } else if (a == 'U') {
                puntuak += 7;
            } else if (a == 'V') {
                puntuak += 9;
            } else if (a == 'W') {
                puntuak += 9;
            } else if (a == 'X') {
                puntuak += 11;
            } else if (a == 'Y') {
                puntuak += 13;
            } else if (a == 'Z') {
                puntuak += 11;
            } else if (a == '!') {

                puntuak += 19;
                puntuak -= 3;

            } else if (a == '?') {
                puntuak += 15;
                puntuak -= 3;

            } else if (a == ' ') {
                puntuak += 5;
                puntuak -= 3;

            }

        }

        return puntuak;
    }
}
