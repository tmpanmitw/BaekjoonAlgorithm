import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++){
            int a = Integer.parseInt(br.readLine());

            if(a==0){
                stack.pop();
            }else{
                stack.push(a);
            }
        }

        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}