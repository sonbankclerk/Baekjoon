import java.lang.Math;

class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price>=500000){
            answer=(int)Math.floor(price*0.80);
        }else if(price>=300000){
            answer=(int)Math.floor(price*0.90);
        }else if (price >= 100000){
            answer=(int)Math.floor(price *0.95);
        }else{
            answer = (int)price;
        }
        return answer;
    }
}