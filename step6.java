// 백준 15596번
public class Test {
    long sum(int[] a) {
        long ans = 0; 

        
        for(int i = 0; i < a.length; i++){
            ans += a[i];
        }
        return ans; //a 배열에 저장되어있는 정수들을 더하여 long 형으로 리턴시켜주어야한다.
    }
}

//백준 4673번

import java.io.IOException;
 
public class Main {
    public static void main(String args[]) throws IOException {
        int[] arr = new int[10001];
        // 1~10000
        arr[0]=1;
        for(int i=0;i<10001;i++){
            if(arr[i]!=0) continue;
            int tn = i;
            // 셀프 넘버가 아닌것 골라주기
            while(true){
                int size = (tn+"").length();
                int t = tn;
                for(int j=0;j<size;j++)
                    tn += (t+"").charAt(j)-'0';
                if(tn>10000 || arr[tn]!=0) break;
                arr[tn] = 1;
            }
        }
        // 셀프 넘버 출력
        for(int i=0;i<10001;i++)
            if(arr[i]==0) System.out.println(i);
    }
}

//백준 1065

import java.util.Scanner;
     public class Main {
         public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             System.out.print(arithmetic_sequence(in.nextInt()));
         }
         
         public static int arithmetic_sequence(int num) {
             int cnt = 0; // 한수 카운팅
             if (num < 100) {
                 return num;
             }else {
                 cnt = 99;
                 if (num == 1000) { //예외처리
                     num = 999;
                 }
                 for (int i = 100; i <= num; i++) {
                     int hun = i / 100; //백의자리
                     int ten = (i / 10) % 10; //십의자리
                     int one = i % 10; //일의자리
                     if ((hun - ten) == (ten - one)) { //각 자릿수가 수열을 이루면
                         cnt++; //카운트 증가
                     }
                 }
             }
             return cnt; //카운트 
         }
     }
