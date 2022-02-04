import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[10];
        
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            String tmp = sc.next();
           
            long d=1;
            for(int j=tmp.length()-1; j>=0; j--){
                alpha[tmp.charAt(j)-'A'] += d;
                d*=10;
            }
        }

        Arrays.sort(alpha);
        int index = 9;
        int sum =0;
        for(int i=alpha.length-1; i>=0; i--){
            if(alpha[i] == 0){
                break;
            }
            sum += alpha[i]*index;
            index--;
        }
        System.out.println(sum);



           
            
        
        
    }
}