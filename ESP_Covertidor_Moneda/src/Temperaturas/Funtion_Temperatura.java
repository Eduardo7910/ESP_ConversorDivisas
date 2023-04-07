package Temperaturas;

import javax.swing.JOptionPane;

public class Funtion_Temperatura {
	

	Conversor_Temperatura temperatura = new Conversor_Temperatura();
	
	public void ConvertirTemperaturas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige una opcion para convertir", "Temperatura",JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
		
		switch(opcion) {
		
		case "Grados Celcius a Grados Farenheit":
			temperatura.ConvertirCelciusaFarenheit(Minput);
			break;

		case "Grados Celcius a Kelvin":
			temperatura.ConvertirCelciusaKelvin(Minput);
			break;
			
		case "Grados Farenheit a Grados Celcius":
			temperatura.ConvertirFarenheitaCelcius(Minput);
			break;
			
		case "Kelvin a Grados Celcius":
			temperatura.ConvertirKelvinaCelcius(Minput);
			break;
			
		case "Kelvin a Grados Farenheit":
			temperatura.ConvertirkelvinaFarenheit(Minput);
			break;
		}
		
	}
}
