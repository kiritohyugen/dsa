import java.util.Arrays;
public class SumTriangleFromArray {

    public static void printTriangle(int[] array){

        //base case
        if(array.length<1){
            return ;
        }

        int[] temp = new int[array.length-1];
        for(int i=0;i<array.length-1;i++){
            temp[i] = array[i] + array[i+1];
        }
        printTriangle(temp);

        System.out.println(Arrays.toString(array));

    }
    public static void main (String[] args){
        int[] triangle ={1,2,3,4,5,6,7,8,9,10};
        printTriangle(triangle);
    }
}