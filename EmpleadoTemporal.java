
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Aguirre
 */
public class EmpleadoTemporal extends EmpleadoComun {
    private Calendar finContrato;
    
    public EmpleadoTemporal(int code, String name){
        super(code, name);
        this.finContrato=Calendar.getInstance();
        
    }
    
    public double pagar(){
        Calendar hoy=Calendar.getInstance();
        if(hoy.before(finContrato)){
            return super.pagar();
        }
        return 0;
    }
    
    public String toString(){
        return super.toString()+"Fin Contrato: " + finContrato.getTime();
    }
    
}
