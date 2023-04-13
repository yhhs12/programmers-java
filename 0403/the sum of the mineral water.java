class thesumofthemineralwater {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){  //i가 1부터 n까지 증가할 때
            if(n % i == 0){  //n을 i로 나누었을 때 0이면
                int a = 0;
                answer += i;  //answer에 i를 더한다.
            }
        }
        return answer;
    }
} 
    

