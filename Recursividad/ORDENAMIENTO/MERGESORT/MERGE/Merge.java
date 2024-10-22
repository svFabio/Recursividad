import java.util.Arrays;
/**
 *                                7,1,3,6,2,4,8
 *    ArrMitad1 7,1,3,6                               ArrMitad1 2,4,8
 *   pos        0 1 2 3                                         0 1 2                    
 *   saca mitad 0+1/2 = 0                          
 *   arr en la pos 0 es 7
 *   7,1                     3,6
 *   Mitad de 7 , 1
 *   como 7 es solo haz
 *   mezcla
 *   7 --- 1 MEZCLA          3 --- 6
 *   1,7     RESULTADO       3,6 Arreglo
 *   resultado se cambia     ordenado
 *   en arrMitad
 */
public class Merge{
    
    public void ordenarMezcla(int[] arr){
        ordenarMezcla(arr,0,arr.length-1); //-1 porque se pasa 
        System.out.println(Arrays.toString(arr));
    } 
    
    private void ordenarMezcla(int[] arr, int ini, int fin){
        if(ini < fin){ //Caso Base, mientras
            int mitad = (fin+ini)/2;
            ordenarMezcla(arr,ini,mitad);   //MITAD IZQUIERDA
            ordenarMezcla(arr,mitad+1,fin); //MITAD DERECHA
            
            int [] mitadIzq = new int[mitad-ini+1]; //ARREGLOS AUXILIARES
            llenar(ini,arr,mitad,0,mitadIzq);
            
            
            int [] mitadDer = new int[fin-(mitad+1)+1]; //ARREGLOS AUXILIARES
            llenar(mitad+1,arr,fin,0,mitadDer);
            
            mezclar(ini,arr,0,mitadIzq,0,mitadDer);
        }
    }
    
    private void mezclar(int ini, int[] arr, int i, int []mitadIzq,int j,int []mitadDer){
        if(i<mitadIzq.length && j<mitadDer.length ){
            if(mitadIzq[i]<mitadDer[j]){
                arr[ini] = mitadIzq[i];
                mezclar(ini+1,arr,i+1,mitadIzq,j,mitadDer); //
            }else{
               arr[ini] = mitadDer[j];
               mezclar(ini+1,arr,i,mitadIzq,j+1,mitadDer);
            }
        }else if(i<mitadIzq.length){ // SI ya termino mitad derecha
               arr[ini] = mitadIzq[i];
               mezclar(ini+1,arr,i+1,mitadIzq,j,mitadDer);
        }else if(j<mitadDer.length){
               arr[ini] = mitadDer[j];
               mezclar(ini+1,arr,i,mitadIzq,j+1,mitadDer);
        }
    }
    
    private void llenar(int ini, int[] arr, int fin, int i, int [] aux){
        if(ini<=fin){
            aux[i] = arr[ini];
            llenar(ini+1,arr,fin,i+1,aux);
        }
    }   
}
