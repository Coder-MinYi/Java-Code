import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        long[] array={9,5,2,7,3,6,8,0,0,0};
        int size=6;
        int index=5;
        createHeap(array,size);
        System.out.println(Arrays.toString(array));
    }

    public static void shiftDown(long[] array,int size,int index){
        while (true){
            int left=2*index+1;
            int right=2*index+2;
            if (left>=size){
                return;
            }
            int max=left;
            if (right<size&&(array[right]>array[left])){
                max=right;
            }
            if (array[index]>array[max]){
                return;
            }
            swap(array,index,max);
            index=max;
        }
    }

    public static void createHeap(long[] array,int size){
        int child=size-1;
        int parent=(child-1)/2;
        for (int i = parent; i >=0 ; i--) {
            shiftDown(array,size,i);
        }
    }
    public static void swap(long[] array,int i,int j){
        long temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
