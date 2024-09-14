import java.util.*;
public class Ejercicio4 
{
    public int cantMenor(int[] estaturas) {
        int res;
        if (estaturas.length == 0) {
            res = 0; 
        }else{
            res = cantMenorAux(estaturas, 1, estaturas[0], 1);
        }
        return res;
    }

    private int cantMenorAux(int[] estaturas, int indice, int menor, int contador) 
    {   
        if (indice >= estaturas.length) {
            return contador;
        }
        if (estaturas[indice] < menor) {
            return cantMenorAux(estaturas, indice + 1, estaturas[indice], 1);
            
        } else if (estaturas[indice] == menor) {
            return cantMenorAux(estaturas, indice + 1, menor, contador + 1);
        }else{
            return cantMenorAux(estaturas, indice + 1, menor, contador);
        }
    }
    
    
    public int menorEstatura(int[] estaturas) {
        
        if (estaturas.length == 1) {
            return estaturas[0];
        }else{
           int menorRestante = menorEstaturaAux(estaturas, 1, estaturas[0]);
           if (estaturas[0] < menorRestante) {
               return estaturas[0];
           }else{
               return menorRestante;
           }
        }
    }
    
    private int menorEstaturaAux(int[] estaturas, int indice, int minActual) {
        if (indice >= estaturas.length) {
            return minActual;
        } else {
            return menorEstaturaAux(estaturas, indice + 1, Math.min(minActual, estaturas[indice]));
        }
    }
}
