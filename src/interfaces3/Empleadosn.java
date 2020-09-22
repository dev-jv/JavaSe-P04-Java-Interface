/*
package interfaces3;

import java.util.*;
//---------------------------------------------------------------------// Si un Empleado toma decicisiones
	public class Empleadosn {
		
	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000,2015, 9, 25);
		
		jefe_RRHH.establecerIncentivo(2570);
		
		Empleado empleados[] = new Empleado[6]; // Estamos almacenando un objeto de tipo Jefatura en un array de tipo Empleado en [4], [5]
		
		empleados[0] = new Empleado("Jorge", 5500.0, 2020, 8, 27);
		empleados[1] = new Empleado("Samuel", 4500.0, 2000, 13, 3); 
		empleados[2] = new Empleado("Sara", 7500.0, 2019, 1, 15); 
		empleados[3] = new Empleado("Luis", 4300.0, 2000, 9, 6); 
		empleados[4] = jefe_RRHH; //Polimorfismo en acci�n. Principio de Sustituci�n.
		empleados[5] = new Jefatura("Mar�a", 45000, 2007, 12, 23); // Es otra forma perfectamente v�lida de representar el P.S.
		
		Jefatura jefa_Finanzas = (Jefatura) empleados[5];// Casting
		
		jefa_Finanzas.establecerIncentivo(3000);// Y ahora si!
				
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar m�s dias de vacaciones a los empleados"));
		
		empleados[3].tomar_decisiones("sedgsdsdl�");
		
		for(Empleado e : empleados) {
			e.cargarSueldo(5);
		}
		
		Arrays.sort(empleados); // Un m�todo est�tico utiliza a su clase, y define el tipo [array de objetos]
				
		for(Empleado e : empleados) {
			System.out.println("Nombre: " + e.dameNombre() + "   Id: " + e.dameId() +
					"   Sueldo: " + e.dameSueldo() + "   Fecha: " + e.dameFechaContrato());
		}	// dameSueldo es un metodo perteneciente a dos clases diferentes, y ambas son llamadas seg�n el objeto. [enlazado din�mico]
		
//		System.out.println(Empleado.mostrarIdSiguiente());
				
	}
}
	
//---------------------------------------------------------------------
class Empleado implements Comparable, Jefes{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
	
		altaContrato = calendario.getTime();
		
//		Id = 1;
		
		Id = IdSiguiente;
		
		IdSiguiente++;
	}
	
	public Empleado(String nombre){
		
		this(nombre, 3500, 2015, 13, 23);
	}
	
	public void cambiarSeccion(String secc) {
		secci�n = secc;
	}
	
	public String mostraDatos() {
		return "\nSu nombre es: " + nombre + "\nY su �rea es: " + secci�n + "\nCon un ID: " + Id;
	}
	
	public static String mostrarIdSiguiente() {
		return "El Id Siguiente es: " + IdSiguiente;
	}
		
	public String dameNombre() {
		return nombre;
	}
	
	public int dameId() {
		return Id;
	}
	
	public double dameSueldo() {		
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion a tomadola decision de: " + decision;
	}
	
	public void cargarSueldo(double porcentaje) {	
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
		
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	final private String nombre;

	private double sueldo;
	
	private Date altaContrato;
	
	private String secci�n;
	
//	public static int Id;
	
	private int Id;

	public static int IdSiguiente=1;
	
}

//---------------------------------------------------------------------
class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) { // Constructor que une dos grupos de par�metros! 
		super(nom, sue, agno, mes, dia); // Constructor padre al que nos dirigimos
	}
	

	
	public void establecerIncentivo(double b) {
		incentivo = b;
	}
	
	public double dameSueldo() { 
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo; 
}

//---------------------------------------------------------------------
class Director extends Jefatura{
		
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia); 
	
		}	
	}
*/