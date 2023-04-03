
class anumberwhoseremainderisone {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++){   //for문을 이용하여 i는 2부터 n까지 
            if (n % i == 1){    //n을 i로 나누어 나머지가 1이면
                answer = i;   //answer는 i이고
                break;   //break한다.
            }
            
        }
        return answer;
    }
    
}
