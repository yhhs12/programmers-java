//각 자릿수를 더하는 문제
class Addthenumberofdigits {
    public int solution(int n) {
        int answer = 0;
        while (n > 0){    //while반복문을 이용하여 자연수n을 
            answer += n % 10;   //10으로 나눈 나머지가 1의 자릿수가 되고
            n /= 10;  //10으로 나눠 나온 몫으로 다시 반복문을 돌려 위에 식을 풀면 10의 자리수가 된다.
        }  //자연수n의 각각의 자릿수를 더할 수 있다.

        return answer;
    }
    
}
