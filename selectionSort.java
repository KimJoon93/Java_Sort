/**
 *  선택 정렬
 *  주어진 데이터 중 최소값 찾기
 *  최소값을 맨 앞에 위치한 값과 교환
 *  시간복잡도: O(n^2)
 * 
 */
public class selectionSort{

    public static void main(String[] args) {
        
        int[] arrays = {66,10,1,99,5};
        
        int min = arrays[0];
        int minOrder = 0;
        int minPlus = 0;
        int watchOrder = 0;

        while(minPlus < arrays.length){
            min = arrays[minPlus];
            //최소값 구하기
        for(int i=minPlus; i<arrays.length; i++){
            if(arrays[i]<min){
                min = arrays[i];
                minOrder = i;
            }
        }
        arrays[minOrder] = arrays[watchOrder];
        arrays[watchOrder] = min;
        watchOrder++;
        minPlus++;
        }
        for(int i=0; i<arrays.length; i++){
            System.out.println(arrays[i]);
        }
    }
}
