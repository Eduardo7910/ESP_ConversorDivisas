package Convertidor;

import javax.swing.JOptionPane;

import ConvertidorMonedas.Fuction;
import Temperaturas.Funtion_Temperatura;



public class Index {


	
	public static void main(String[] args) {
		
		Fuction monedas = new Fuction();
		Funtion_Temperatura temperatura = new Funtion_Temperatura();
		
	

		boolean live = true;
		while (live) {
			
			
			 String Options = (JOptionPane.showInputDialog(null, "Seleccione una opcion de convercion", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,

					new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Seleccion")).toString();

			switch (Options) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad que desee convertir: ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);

					int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Selecciona opción Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                    }

                   } else {
                       JOptionPane.showMessageDialog(null, "Valor inválido");                
                   }
                    	break;

			// Caso de temperatura

			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog(null, "Ingrese los grados que desea convertir");
				if(ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirTemperaturas(Minput);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if((respuesta == 0)&&(ValidarNumero(input)==true)) {
						//System.out.println("Selecciona opcion Afirmativa");
					}else {
						JOptionPane.showMessageDialog(null, "Programa Finalizado");
					}
					
				}else {
					JOptionPane.showConfirmDialog(null, "valor invalido");
				}
				break;
			}
		}

	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 | x < 0);
			return true;
		} catch (NumberFormatException Ne) {
			return false;
		}

	}
}
