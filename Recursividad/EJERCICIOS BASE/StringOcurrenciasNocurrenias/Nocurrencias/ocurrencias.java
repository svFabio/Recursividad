import java.util.ArrayList;
/**
 * "lo que no me mata me fortalece" : 
 *  res = {"lo",1},("que",1)...("me",2),("fortalece",1)}
 */
public class ocurrencias{
    public class Par{
        String pal;
        int cant;
        public Par(String palabra){
            pal = palabra;
            cant = 1;
        }
        public String toString(){
            return  "("+pal+","+cant+")";
        }
    }
    public ArrayList<Par> contarPalabras(String texto){
        ArrayList<Par> res = new ArrayList<Par>();
        res = contarPalabras(texto+".",0,texto.length(),"",res);
        return res;
    }
    private ArrayList<Par> contarPalabras(String texto, int i, int k, String compuesto, ArrayList<Par> res){
        ArrayList<Par> respuesta;
        if(i > k){ //BASE cuando pos es mayor al limite
           respuesta = res;
         }else{ 
           if(texto.charAt(i) == ' ' || texto.charAt(i) == '.' || texto.charAt(i) == ','){ 
                  int posCompuesto = posDe(compuesto,res,0);
                  if(posCompuesto==-1){
                    Par p = new Par(compuesto);
                    res.add(p);
                  }else{
                      Par p = res.get(posCompuesto);
                      p.cant++;
                  }
                  compuesto = ""; // reinicio
           }else{
               compuesto = compuesto + texto.charAt(i); //examen
           }
           respuesta = contarPalabras(texto,i+1,k,compuesto,res);
        }
        return respuesta; 
    }
    private int posDe(String compuesto, ArrayList<Par> res, int i){
        int index;
        if(i>res.size()-1){ //cuando es mayor a la ultima posicion
            index = -1;
        }
        else if(compuesto.equals(res.get(i).pal)){
            index = i;
        }else{
            index = posDe(compuesto,res,i+1); //examina todo el arreplo de respuestas
        }
        return index;
    }
}
