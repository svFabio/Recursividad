
/**

 */
public class BurbujaRecursivo
{
    public int[] ordenaRec(int []arr, int j){
       for(int     i = 1 ; i <= arr.length-1   ; i++){
            if (j <= arr.length-i-1){
                if(arr[j]> arr[j+1]){
                   int aux = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = aux;
                }
            }else{
                j = 0;
                i = i+1;
            }
        }
       return arr;
    }
}
