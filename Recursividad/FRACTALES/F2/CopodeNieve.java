
/**
 * Analisis 
 * nivel(0) = 3
 * nivel(1) = 6
 * nivel(2) = 18
 * nivel(3) = 66
 * 
 * 
 * 
 */
public class CopodeNieve
{
   public int Copito(int nivel){
       return Copito(nivel,0);
   }
   private int Copito(int nivel, int expo){
       if(nivel == 0){
           return 3;
       }else{
           return Copito(nivel-1,expo+2) + 3 * (int)Math.pow(2,expo);
       }
    
   }
   //codigo del unicornio
   private int CopitoUnicornio(int nivel){
       if(nivel == 0){
           return 3;
       }else{
           return Copito(nivel-1) + 3 * (int)Math.pow(2,2*(nivel-1));
       }
    
    } 
    
    
    
}
