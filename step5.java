//백준 10818번
//최소값 최대값 출력
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //입력부생성
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //데이터 저장소
        int [] array = new int[n]; 
        
        //데이터 저장소에  입력 받는것을 반복
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
      
        //연산 _배열안의 낮은 수 부터 정리
        Arrays.sort(array);
       
        System.out.print(array[0] + " " + array[n-1]);
    }
}


//백준 2562번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args)throws IOException {
      //생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// InputStreamReader로 바이트화한 값을 BufferedReader로 문자화

        int [] array = new int[9]; //배열이 9인 input 생성
        int max = 0; //최대값 저장소 
        int line = 0;  //최대값 자릿수
        int count = 0;
      
      //입력
        for(int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        //연산
        //어떤 값을 찾는다
        // 최소값 = 상대적으로 가장 작은 수 
        // 상대적으로 더 작다.
      
        // 부등호를 써서 대소비교를한다.
        // 반복해서 비교를한다.
      /////////////////////////////////
    
        // 어떤 값 자릿수는?
      
        // 배열 (인덱스, 밸류) 
        // 인덱스 자릿수의 관계
      
        // 인덱스 = 자릿수 -1
        // 자릿수 = 인덱스 +1
                

        //연산
          for(int value : array){ 
            count++;
     
            if(value > max){
                max = value;
                line = count;

            }
        }
      

      //출력
        System.out.println(max);
        System.out.println(line);

    }
}

//백준 2577번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args)throws IOException {
        //생성 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
  
        int [] array = new int[10];  // 0~9 = 인덱스  ,  밸류 = 몇번씩 쓰였는지.

        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        
       // 연산 
       //입력 받은 값을 문자화
        
        String str = String.valueOf(value);
        

        for(int i = 0; i < str.length(); i++){
          //str.charAt = [1,7,0,3,7,3,0,0]
            array[(str.charAt(i) - 48)]++;
        }
      
       //출력
        for(int j : array){
            System.out.println(j);
        }
    }
}

//백준 3052번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i = 0; i < 10; i++){
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.print(h.size());




    }
}

//백준 1546번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double array [] = new double[Integer.parseInt(br.readLine())];


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < array.length; i++){
            array[i] = Double.parseDouble(st.nextToken());
        }
        
        double sum = 0;
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            sum += ((array[i] / array[array.length-1]) * 100);
        }
        System.out.print(sum/array.length);




    }
}
