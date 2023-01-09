import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = a/100+((a/10)%10)*10+(a%10)*100;
        int d = b/100+((b/10)%10)*10+(b%10)*100;
        if(c>d){
            System.out.println(c);
        }else{
            System.out.println(d);
        }
        }
    }
