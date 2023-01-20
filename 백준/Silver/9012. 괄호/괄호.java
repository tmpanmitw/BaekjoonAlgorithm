import java.io.*;
import java.util.*;

// BaekJoon2164

public class  Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(br.readLine());
//        System.out.println(T);

        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < T; i++){
            String a = br.readLine();
            // 한번 돌릴때마다 ans 초기화!!!!
            String ans = "YES";
            for(int j = 0; j < a.length(); j++){
                char c = a.charAt(j);
//                System.out.println(c);
                if(c == '('){
                    stack.push(c);
//                    System.out.println(stack);
                }else{  // ')'일 경우
                    if(stack.empty()){
                         ans = "NO";
                    }else{
                       stack.pop();
//                        System.out.println(stack);
                    }
                }
            }

            if(ans.equals("YES")){
                if(stack.isEmpty()){
                    ans = "YES";
                }else{
                    ans = "NO";
                }
            }
            // 한번 돌릴때마다 스택을 비워줘야 한다!!!!!
            stack.clear();


//            System.out.println(stack);
            System.out.println(ans);
        }
    }
}