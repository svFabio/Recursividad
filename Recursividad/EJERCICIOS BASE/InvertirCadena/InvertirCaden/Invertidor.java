
/**
 * INVERTIR UNA CADENA
 * 
 * VACA ---> ACAV
 */
public class Invertidor {
    public String Invertir(String palabra){
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
        return res;
    }
}
