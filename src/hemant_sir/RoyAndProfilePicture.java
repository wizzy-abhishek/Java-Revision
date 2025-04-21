package hemant_sir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndProfilePicture {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            String[] value = br.readLine().split(" ");
            System.out.println(profilePicture(Integer.parseInt(value[0]) ,
                    Integer.parseInt(value[1]) ,
                    l));
        }

    }

    private static String profilePicture(int w , int b , int l){
        if(w > l || b > l){
            return "UPLOAD ANOTHER";
        } else if (w == b) {
            return "ACCEPTED";
        }else{
            return "CROP IT" ;
        }
    }
}

