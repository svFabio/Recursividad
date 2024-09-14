
/**
 * Unicornio  
 
 */
public class CaracteresDistintos{
    public boolean verificarCadena(String cad){
        int pos = 0;
        String aux = "";      //normalizar a minuscula      
        return verificarCadena(cad.toLowerCase(),pos,aux);
    }
    
    private boolean verificarCadena(String cad, int pos, String aux){
        boolean res;
        //PARTE BASICA
        if(pos == cad.length()){
            res = true;
        }else{
            //char es un tipo de dato primitivo
            char actual = cad.charAt(pos);
            
            if(aux.contains(actual+"")){ 
                //lo convierto en una cadena, lo obligo a volverse
                //un string, string es subclase de charSecuence si lo
                //acepta, por temas de poli y herencia el tipo de dato
                //podra ser utilizado.
                res = false;
            }else{
                aux = aux + actual;
                res = verificarCadena(cad,pos+1,aux);
            }
        }
        return res;
    }
}
