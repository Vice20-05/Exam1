public  class Main {
    public static void main(String[] args) {
        TeleportalosUrZokni z1=new TeleportalosUrZokni("ZOKNI-32", 3, "Samsung");
        Urzokni z=new TeleportalosUrZokni("ZOKNI-42",0,"Andromeda");

        //int [] sorszamok={4,1,2,2,0,-5};
        z1.mosas(6);
        System.out.println(z1);
        
        System.out.println(z.cimke());
    
    }

    //a cycle that loops in the array
    /*
    

  
    public static  int elsoHianyzoZokni(int[]sorszamok){
        
        private int  number;
        for (number=0;number.size();number++){
            if (number is ==-1 ) returns "0";
            else if a number is dublicate it returns just 1 of the instances
            if there's a missing number ->adds the missing number so it goes sequentially 
        }
    }
        */

}