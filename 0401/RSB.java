//가위 : 2, 바위 : 0, 보 : 5 
//문자열 rsp가 매개변수로 주어질 때 가위바위보를 이길 경우를 순서대로 나타낼
class Solution {
    public String solution(String rsp) {
        String answer = "";  //문자열answer를 초기화한다.
        String[] arr = rsp.split("");   //문자열rsp를 ""기준으로 나누어 arr배열에 넣는다.
        
        for(int i = 0; i < arr.length; i++){   // i는 0부터 arr배열 길이만큼 
            if(arr[i].equals("2"))  //i번째 배열이 "2"와 같다면
                answer += "0";   //answer에 "0"을 더한다.
            else if(arr[i].equals("0"))  //i번째 배열이 "0"와 같다면
                answer += "5";  //answer에 "5"을 더한다.
            else if(arr[i].equals("5"))  //i번째 배열이 "5"와 같다면
                answer += "2";  //answer에 "2"을 더한다.
        }
        return answer;
    }
}