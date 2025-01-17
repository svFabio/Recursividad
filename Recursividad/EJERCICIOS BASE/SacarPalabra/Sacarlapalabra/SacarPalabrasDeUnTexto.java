import java.util.ArrayList;
/**
 * joder se acerca el examen --- {joder,se,acerca,el,examen}
 * n : tamaño 
 * k : limite
 */
public class SacarPalabrasDeUnTexto
{
   public ArrayList<String> sacarPal(String texto){
       ArrayList<String> res = new ArrayList<String>(); //inicializacion
       res = sacarPal(texto+".","",0,texto.length()-1,res); //para que no de error en res
       return res;
    }
    private ArrayList<String> sacarPal(String texto,String compuesto, int i, int k, ArrayList<String> res ){
       ArrayList<String> respuesta;
       if(i > k){ //BASE cuando pos es mayor al limite
           respuesta = res;
       }else{ 
           if(texto.charAt(i) == ' '  || texto.charAt(i) == ',' || texto.charAt(i) == '.'){ 
                  res.add(compuesto);
                  compuesto = "";
           }else{
               compuesto = compuesto + texto.charAt(i); //examen
           }
           respuesta = sacarPal(texto,compuesto,i+1,k,res);
       }
       return respuesta; 
   }
}