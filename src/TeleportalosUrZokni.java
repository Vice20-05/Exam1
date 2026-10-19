

class TeleportalosUrZokni extends  Urzokni{
    private  final  String galaxis;
    public TeleportalosUrZokni(String azonosito,int tisztasagPont,String galaxis){
        super(azonosito, tisztasagPont);
        this.galaxis=galaxis;
    }

    public String getGalaxis(){
        return  galaxis;//we give back the galaxis, if not we cannot read the value
    }
    @Override 
    public String cimke(){
        return " Teleport zokni: "+azonosito+" ";
    }

}