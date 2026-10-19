public  class Main {
    public static void main(String[] args) {
        TeleportalosUrZokni z1=new TeleportalosUrZokni("ZOKNI-32", 3, "Samsung");
        Urzokni z=new TeleportalosUrZokni("",4,"Andromeda");

        z1.mosas(6);
        System.out.println(z1);
        
        System.out.println(z.cimke());
    
    }


}