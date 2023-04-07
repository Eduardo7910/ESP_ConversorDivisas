package Temperaturas;

import javax.swing.JOptionPane;

public class Conversor_Temperatura {
	

	public double ConvertirCelciusaFarenheit(double valor) {
			double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + farenheit + "Grados Farenheit");
			return farenheit;
	}

	public void ConvertirCelciusaKelvin(double valor) {
			double Kelvin = valor * 273.15;
		Kelvin = (double) Math.round(Kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " + Kelvin + " Grados Farenheit");
	}

	public void ConvertirFarenheitaCelcius(double valor) {
			double Celcius = (valor - 32) / 1.8;
		Celcius = (double) Math.round(Celcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " + Celcius + " Grados Celcius");
	}

	public double ConvertirKelvinaCelcius(double valor) {
			double kelvinCelcius = valor - 273.15;
		kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Kelvin son " + kelvinCelcius + " Grados Celcius");
			return kelvinCelcius;
	}

	public void ConvertirkelvinaFarenheit(double valor) {
			double kelvinFarenheit = ConvertirKelvinaCelcius(valor);
			kelvinFarenheit = ConvertirCelciusaFarenheit(kelvinFarenheit);
			kelvinFarenheit = (double) Math.round(kelvinFarenheit * 100d) / 100;
		JOptionPane.showInputDialog(null, +valor+ " Kevin son" + kelvinFarenheit + " Celcius");
	}

}
