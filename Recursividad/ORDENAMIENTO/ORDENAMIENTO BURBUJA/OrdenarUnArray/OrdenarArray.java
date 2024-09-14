
/**
 * 
 * decir "hasta" es inclusivo, es decir >= o <=
 */
public class OrdenarArray{
    public int[] ordenar(int []arr){
        //  length() es diferente para arrays 
        for(int     i = 1 ; i <= arr.length-1   ; i++){
            for(int j = 0 ; j <= arr.length-i-1 ; j++){
                if(arr[j]> arr[j+1]){
                   int aux = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = aux;
                }
            }
        }
        return arr;
    }
    
    public int[] ordenaRec(int []arr){
       /**
        * primero se controla el caso recursivo por-
        * que traduciendolo.
        * 
        * "j" va cambiando de valor cada vez
        * tiene que ser un parametro
        * 
        * del for de j, solo dejamos la condicion y lo 
        * cambio por un if
        * 
        * ahora nos centramos en for de i
        * como i varia cada vez lo manejo como parametro 
           */
        for(int     i = 1 ; i <= arr.length-1   ; i++){
            for(int j = 0 ; j <= arr.length-i-1 ; j++){
                if(arr[j]> arr[j+1]){
                   int aux = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = aux;
                }
            }
        }
       return arr;
    }
    
    
    
    
    
    
    
    
    
}
