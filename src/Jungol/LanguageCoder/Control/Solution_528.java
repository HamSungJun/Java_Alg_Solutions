package Jungol.LanguageCoder.Control;

import java.io.*;

public class Solution_528 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        bw.write("" + A);
        if (A < 0) {
            bw.newLine();
            bw.write("minus");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
