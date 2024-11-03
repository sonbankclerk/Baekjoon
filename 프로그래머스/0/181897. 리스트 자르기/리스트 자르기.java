class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        if(n==1){
            answer = new int[slicer[1]+1];
            for(int i=0; i<=slicer[1]; i++){
                answer[i] = num_list[i];
            }
        }else if(n==2){
            answer = new int[num_list.length - slicer[0]];
            for(int i=slicer[0], j=0; i<num_list.length; i++, j++){
                answer[j] = num_list[i];
            }
        }else if(n==3){
            answer = new int[slicer[1]-slicer[0]+1];
            for(int i=slicer[0], j=0; i<=slicer[1]; i++, j++){
                answer[j] = num_list[i];
            }
        }else{
            answer = new int[(slicer[1]-slicer[0])/slicer[2]+1];
            for(int i=slicer[0], j=0; i<=slicer[1]; i=i+slicer[2], j++){
                answer[j] = num_list[i];
            }
        }
        return answer;
    }
}