public class bubbleSort{
    public static void main(String[] args) {
        int arrays[] = {8,5,6,2,4,12,1,3,89,0};
        Bubble bubble = new Bubble();
        bubble.sort(arrays);
        for(int num : arrays){
            System.out.print(num + " ");
        }
    }
}

class Bubble{
    public void sort(int[] data) {
        int num = 1;
        while(num<data.length){
            for(int i=0; i<data.length-1; i++){
                int storeNum = data[i];
                if(data[i]>data[i+1]){
                    data[i] = data[i+1];
                    data[i+1] = storeNum;
                }
            }
            num++;
        }   
    }
}