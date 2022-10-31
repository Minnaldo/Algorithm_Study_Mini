package Lv1;

import java.io.*;

public class sosufind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;

        int[] arr = new int[n+1];   // int타입의 arr은 n+1개의 갯수만큼 int타입으로 공간을 가짐
        // 모든 수를 대입
        for(int i = 0; i <= n; i++)
        {
            arr[i] = i;
        }

        arr[1] = 0; // 1은 소수가 아니라서 0이라고 정의

        for(int i = 2; i <= n; i++)
        {
            if(arr[i] == 0) // 만약 이전에 찾았던 소수의 배수 값일 경우 계산없이 다음 수로 이동
                continue;   // arr[i]번째 방이 0이라면 반복문의 처음으로 이동

            //에라토스테네스의 체를 통해 배수의 수는 소수가 아니라고 정의
            for(int j = i * 2; j <= n; j += i)  // int타입 j가 i*2이고; j가 n이하까지 반복; j = j+i -> 계산을 하지않고 소수가 아닌 값을 찾음
            {
                arr[j] = 0; // arr의 j번째 방은 0 -> 소수가 아니라면
            }
        }

        // 정답 계산
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)     // arr의 i번째 방이 0이 아니라면 -> 소수
                answer++;
        }

        System.out.println(answer);

    }
}
