/**
 *  삽입 정렬
 *  오름차순 정렬
 */
public class insertionSort{
    public static void main(String[] args) {
        int arrays[] = {8,5,6,2,4,3,10,12};
        Insertion selection = new Insertion();
        selection.sort(arrays);
        for(int num : arrays){
            System.out.print(num + " ");
        }
    } 
}
class Insertion{
    public void sort(int[] data){
        int order = 1;
        int num = 1;
        
        while(order<data.length){
            for(int i=0; i<num; i++){
                int key = data[order];
                if(key<data[i]){
                    data[order] = data[i];
                    data[i] = key;
                }
            }
            order++;
            num++;
        }
    }
}