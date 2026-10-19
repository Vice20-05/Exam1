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

  public  String getAzonosito(){
    return azonosito;
  }


   public  int getTisztasagPont(){
    if(tisztasagPont<0){ //the idea is that if tisztasagPont is smaller or equal to -1 
      //it gives the respected error ,or if it's 
     System.err.println("tisztasagPont nem lehet negativ az ertek");
      //throw.IllegalAccessException("Nem lehet negativ vagy null"); didn't know how the throw IllegalAccessException syntax is 
    }
    return  tisztasagPont; // we don't need getTisztasagPont since it's a getter , we just return the value
   }

   public  String cimke(){
    return azonosito+" : "+tisztasagPont;
   }   
}
