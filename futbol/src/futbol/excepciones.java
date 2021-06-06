package futbol;

public class excepciones extends Exception{
    
    private int codigoError;
     
    public excepciones(int codigoError){
        super();
        this.codigoError=codigoError;
    }
     
    @Override
    public String getMessage(){
         
        String mensaje="";
         
        if (codigoError == 1){
                mensaje="OPCION NO VALIDA";
        }
         
        return mensaje;
         
    }
     
}