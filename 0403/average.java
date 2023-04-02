class average {
    public double solution(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){  //i가 0부터 배열arr길이만큼 i씩 증가할 때
            sum += arr[i];       // sum은 sum에서 i번째 배열을 더해준다  
        }
        double answer = (double)sum / arr.length;   // 실수형answer는 실수형sum을 arr길이만큼 나눈다.
        return answer;
    }   
}
