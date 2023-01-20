import java.io.*;
import java.util.*;

// BaekJonn11866

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5, 6
        for (int i=1; i<=n; i++){
            queue.add(i);
        }
        int cnt = 0;
        while(!queue.isEmpty()){
            cnt++;
            int a = queue.poll();
            // 홀수 회차
            if(cnt%2==1){
                list.add(a);
            }else{ //짝수 회차
                queue.add(a);
            }
        }
//        System.out.println(Collections.unmodifiableList(list));
        System.out.println(list.get(list.size()-1));
    }
}