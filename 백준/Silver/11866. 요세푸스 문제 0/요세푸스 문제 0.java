import java.io.*;
import java.util.*;

// BaekJonn11866

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        // 1, 2, 3, 4, 5, 6, 7
//        System.out.println(queue);

        String ans = "";
        int cnt = 0;

        while (!queue.isEmpty()) {
            int a = queue.poll();
            cnt ++;
            if(cnt%k==0){
                ans += a+","+" ";
//                System.out.println(queue);
//                System.out.println(ans);
            }else{
                queue.add(a);
//                System.out.println(queue);
            }
        }
        // <3, 6, 2, 7, 5, 1, 4>
        ans = ans.substring(0, ans.length()-2);
//        System.out.println(ans);
        System.out.println("<"+ans+">");
    }
}