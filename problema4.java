package ciclosDoWhile;

import javax.swing.JOptionPane;

public class problema4 {

	public static void main(String[] args) {
		
		int num, opciones;
		int  contador, posiciones;
		
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Valor numerico:"));
			
			opciones=Integer.parseInt(JOptionPane.showInputDialog("Opciones\n 1)Verificar si es par\n 2)verificar si es impar\n "
					+ "3)verificar si es primo\n 4)salir\n dame tu opcion"));
			
			switch(opciones){
			
			case 1: if (num%2==0) {
				JOptionPane.showMessageDialog(null, num+" es numero par");
			}
			else {
				JOptionPane.showMessageDialog(null, num+" no es numero par");
			}
			break;
				
			case 2: if (num%2!=0) {			
				JOptionPane.showMessageDialog(null, num+" es numero impar");
			}
			else {
				JOptionPane.showMessageDialog(null, num+" no es numero impar");
			}
			break;
			
			case 3: 
				contador=0;
				for (posiciones=1; posiciones<=num; posiciones++) {
					if (num%posiciones==0) {
						contador++;			
					}
					if (contador>2) {
						JOptionPane.showMessageDialog(null, num+" no es primo");
					}
					else {
						JOptionPane.showMessageDialog(null, num+" es primo");
					}
				}
			}
				break;		
		}
		
		while(opciones!=4);
	}

}
