package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    private String fEnvasado;
    private String fCaducidad;

    public Fecha(String fEnvasado, String fCaducidad){
        this. fEnvasado = fEnvasado;
        this.fCaducidad = fCaducidad;
    }

    public void comparaFecha() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date f1 = format.parse(fEnvasado);
        Date f2 = format.parse(fCaducidad);
        //after before
        if(f1.equals(f2)){
            System.out.println( "son iguales" );
        }else{
            System.out.println( "son diferentes");
        }
    }



}
