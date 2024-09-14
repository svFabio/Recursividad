
/**

 */
public class PalindromoA_miManera
{
    public boolean Palindromo(String palabra){
        String invertido = Invertir(palabra); 
        
        if(palabra.equals(invertido)){
            return true;
        }else{
            return false;
        }
    }
   
    
    private String Invertir(String palabra){
        return Invertir(palabra,palabra.length()-1); //uva , 3
    }
    private String Invertir(String palabra, int pos){
        String res = ""; //respuesta para armar
        if(pos < 0){
            res = "";
        }else{
            char ultimoChar = palabra.charAt(pos); //a   //v
            res = ultimoChar + Invertir(palabra,pos-1);//uv
        }
        return res; //AVU
    }
    
    
    /**
     private String Palindromo(String palabra,String invertido,int pos){
        if(pos == 0){
            return invertido;
        }else{   //         av             //uva
            invertido = invertido + palabra.charAt(pos); //a
            return invertido + Palindromo(palabra,invertido,pos-1);
        } 
     }*/
    
}
     

