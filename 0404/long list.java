class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];  //n개의 원소를 가진 long형 배열 answer를 초기화 한다.
        long num = x;    //x간격만큼 나타내는 long num
        for(int i = 0; i < answer.length; i++){   //i는 0부터 배열answer의 길이만큼 증가하여
            answer[i] = num;    //i번째 배열에 num을 대입한다.
            num += x;         //num은 num에 x를 더한다.
        }           //배열 answer만큼 계속 반복한다.
        return answer;
    }
}