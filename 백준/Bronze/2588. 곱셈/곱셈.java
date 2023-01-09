import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st1.nextToken());

        System.out.println(b%10*a);
        System.out.println(b%100/10*a);
        System.out.println(b/100*a);
        System.out.println(a*b);


    }
}