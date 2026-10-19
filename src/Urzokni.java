public class Urzokni {
 public String azonosito;
   private int tisztasagPont;

   public Urzokni(String azonosito,int tisztasagPont){
    this.azonosito=azonosito; //missing this. so I aded it since it's a setter
    this.tisztasagPont=tisztasagPont;
   }

   public void mosas(int pluszPont){
    tisztasagPont+=pluszPont;
   }
   public  int getTisztasagPont(){
    return  tisztasagPont; // we don't need getTisztasagPont since it's a getter , we just return the value
   }

   public  String cimke(){
    return azonosito+": "+tisztasagPont;
   }   
}
