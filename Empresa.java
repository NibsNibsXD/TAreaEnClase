
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge Aguirre
 */
public class Empresa {
    static Scanner lea = new Scanner(System.in);
    static Empleado[] empleados = new Empleado[100];
    static int numDeEmpleados = 0;
            
    public static void main(String[] args) {
       
        int op;
        
        do{
            System.out.println("1- Agregar Empleado");
            System.out.println("2- Pagar Empleado");
            System.out.println("3- Lista de Empleados");
            System.out.println("4- Sub Menu especifico");
            System.out.println("5- Salir");
            System.out.print("Escoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    hire();
                    break;
                case 2:
                    pay();
                    break;
                case 3:
                    list();
                    break;
                case 4:
                    submenu();
                    break;
            }
        }while(op!=5);
        
    }
    
    /**
     * Recorre la lista de Empleados. Si encuentra un
     * empleado con ese codigo, se retorna, sino, retorna null
     * @param cod Codigo del Empleado
     * @return El obj Empleado si se encuentra, null si no
     */
    private static Empleado search(int cod){
        return null;
    }

    /**
     * Contrata un nuevo empleado
     * 1- Se pide del teclado el tipo: COMUN, HORA, VENTA o TEMPORAL
     * 2- Se instancia un objeto segun el tipo y se guarda en el arreglo
     * 3- pero siempre y cuando el Codigo NO este repetido
     * 4- LOS DATOS requeridos se ingresan del teclado
     */
    private static void hire() {
        System.out.println("TIPO:"  );
        System.out.print(" (COMUN, HORA, VENTA, TEMPORAL): ");
        String tipo = lea.nextLine();
        
        
        System.out.print("CODIGO:");
        int cod = lea.nextInt();
        
        
        if (search(cod) != null) {
            System.out.println("Ya existe este codigo");
            return;
        }
        
        System.out.print("Nombre: ");
        String nombre = lea.next();
        
        Empleado e = null;
        switch(tipo) {
            switch(tipo) {
        case "CASE":
            EmpleadoPorVenta emp = new Empleado(cod, nombre);
            break;

        case "HORA":
            emp = new EmpleadoPorHora(cod, nombre);
            break;
        case "VENTA":
            System.out.print("Ingrese salario base: ");
            double salario = lea.nextDouble();
            emp = new EmpleadoPorVenta(cod, nombre, salario);
            break;
        case "TEMPORAL":
            // Case for EmpleadoTemporal
            emp = new EmpleadoTemporal(cod, nombre);
            break;
        }
    }
        
    /**
     * Le paga a un empleado
     * 1- Pide del teclado el codigo
     * 2- Buscamos ese empleado
     * 3- Si existe, mostramos en pantalla su pago
     */
    private static void pay() {
        System.out.print("Codigo de empleado: ");
        int cod = lea.nextInt();
        
        Empleado emp = search(cod);
        
        if (emp != null) {
            System.out.println("El pago es: " + emp.pagar());
        } else {
            System.out.println("Empleado no encontrado.");
        }
           
    }

    /**
     * Imprimir la lista de empleados
     */
    private static void list() {
        for (int i = 0; i < numDeEmpleados; i++) {
            System.out.println(empleados[i]);
    }

    
    private static void submenu() {
        int op;
        do{
            System.out.println("1-Fecha Fin Contrato a Temporales");
            System.out.println("2-Ingresar Venta");
            System.out.println("3-Ingresar Horas de Trabajo");
            System.out.println("4-Regresar al Menu Principal");
            System.out.print("Escoja Opcion: ");
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    setFin();
                    break;
                case 2:
                    ventas();
                    break;
                case 3:
                    horas();
            }
            
        }while(op!=4);
    }
    
    /**
     * 1- Leer un codigo
     * 2- Buscar el empleado, que existe y q sea Temporal
     * 3- Si concuerda, set fecha fin contrato
     * 4- Leer del teclado los datos
     */
    private static void setFin() {
        
    }

    /**
     * 1- Leer un codigo
     * 2- Buscar empleado, que exista y que sea PorVentas
     * 3- Si concuerda, agregar una venta
     * 4- Leer del teclado los datos
     */
    private static void ventas() {
        
    }

    /**
     * 1- Leer un codigo
     * 2- Buscar empleado, que exista y que sea PorHoras
     * 3- Si concuerda, agregar las horas trabajadas
     * 4- Leer del teclado los datos
     */
    private static void horas() {
        
    }

}
