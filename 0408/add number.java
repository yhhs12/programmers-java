//ex> a=3, b=5  -> 3 + 4 + 5 = 12  //a=7 b=4 -> 7 + 6 + 5 + 4 = 22
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a<=b){   //a가 b보다 작거나 같으면
            for(int i = a; i <= b; i++)  //a에서 b까지 1만큼 증가하여 반복하여
                answer+=i;  //각각 더해준다
        }else{  //a가 b보다 크거나 같으면
            for(int i = b; i <= a; i++)  //b에서 a까지 1만큼 증가하여 반복하여
                answer += i;  //각각 더해준다
        }
        return answer;
    }
}