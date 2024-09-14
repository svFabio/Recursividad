
/**
   
 */
public class ConvertBin{
    public int transformar(int numero){   
        int mult = 1;
        return transformar(numero,mult);
    }
    private int transformar(int numero,int mult){
        int res;
        if(numero == 0){
            res = 0;
        }else{
            int residuo = numero%2;
            numero = numero/2;
            res = (residuo*mult)+transformar(numero,mult*10);
        }
        return res;
    }
    
    
    
    
}
