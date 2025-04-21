package hemant_sir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PintuAndFruit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String[] nAndM = br.readLine().split(" "); // m = type of fruits, n = baskets
            String[] f = br.readLine().split(" "); // p is the cost f is the type of fruit
            String[] p = br.readLine().split(" ");
        }
    }
}
