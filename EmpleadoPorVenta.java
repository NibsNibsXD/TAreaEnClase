
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Aguirre
 */
public class EmpleadoPorVenta extends EmpleadoComun{
    private double ventas[],tasa;
    public EmpleadoPorVenta(int code, String name, double salary){
        super(code,name);
        ventas=new double[12];
        tasa = 0.05;
    }
    
    private int mesActual(){
        Calendar fecha = Calendar.getInstance();
        return fecha.get(Calendar.MONTH);
    }
    
    public void agregarVentas(double monto){
        ventas[mesActual()] += monto;
    }
    
    public double comision(){
        return ventas[mesActual()]*tasa;
    }
    
    public double pagar(){
        return super.pagar() + comision();
    }
    
    public String toString(){
        return super.toString() + "comision: " + comision();
    }
    
    
    
}
