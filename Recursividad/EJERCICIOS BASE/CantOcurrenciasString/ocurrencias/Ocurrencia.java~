
public class Ocurrencia{
    
    public int Buscar(String palabra, char x){
       return Buscar(palabra,x,0);
    }
    
    private int Buscar(String palabra, char x, int pos){
       int res = 0;
       if(pos == palabra.length()){ //caso base
          res = 0;
        }else{
            char actual = palabra.charAt(pos); //rescato en una variable el character en la posicion pos de la palabra
            if(actual == x){
                res = 1 + Buscar(palabra,x,pos+1);
            }else{
                res = Buscar(palabra,x,pos+1);
            }
        }
       return res;
    } 
}









/**
 *    
       
       
       
   
    
    
    
    public int Buscar(String palabra, char x){
           return Buscar(palabra,x,0);
        }
       private int Buscar(String palabra, char x, int pos){
           int res;
           
           if(palabra.charAt(pos) == x){
               res = 1 + Buscar(palabra,x,pos+1);
           }else{
               res = Buscar(palabra,x,pos+1);
           }
           return res;
       } 
 */
