/*
 *     (30 Puntos)                      
 */
public class numerosFelices
{
    public boolean NumeroFeliz(int n){ //esta n no cambia nunca
        return NumeroFeliz(n,cuadrados(n,0));
    }
    
    private int cuadrados(int n, int resultado){ //esta n si cambia
        int resi = n % 10;    //12--2 //1--1
        resi = resi * resi;   //4     //1
        if(n == 0){
            return resultado;
        }
        else{             // 1  0
            return cuadrados(n/10, resultado+resi); //0+4+1
        }
    }
    
    private boolean NumeroFeliz(int n, int nCopy){ //esta n si cambia
            boolean res;    
            if(nCopy == n){
               return false;
            }else if(nCopy == 1){
                return true;
            }else{
                res = NumeroFeliz(n,cuadrados(nCopy,0)) ;
            }
            return res;
    }
}

