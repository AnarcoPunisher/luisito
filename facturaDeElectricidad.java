/*
Programa: Factura De Electricidad
Autor: Luis Angel Martinez Castillo
Matricula: 38653
Descripcion: Calcular e imprimir la 
factura de un consumo de electricidad, 
suponiendo que se capturan la lectura 
actual y anterior. Tambien suponer que 
la tasa de cobro por kilo consumido 
es 6.73 y el cobro fijo es de $30.78.
ALGORITMO: facturaDeElectricidad
start
	print: "lectura actual?"
	print: "lectura anterior?"
	read actual, anterior
	print: "la factura es:" (actual-anterior)*6.73+30.78
end
*/

package entradaSalida;

import javax.swing.JOptionPane;

public class facturaDeElectricidad {

	public static void main(String[] args) {
		
		float actual, anterior;

		actual=Float.parseFloat(JOptionPane.showInputDialog("Cual es la lectura actual? "));
		anterior=Float.parseFloat(JOptionPane.showInputDialog("Cual es la lectura anterior? "));
		
		System.out.print("La factura es:\n"+((actual-anterior)*6.73+30.78));
		
		JOptionPane.showMessageDialog(null, "La factura es:\n"+((actual-anterior)*6.73+30.78));


	}

}
