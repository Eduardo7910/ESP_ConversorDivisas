package ConvertidorMonedas;

import javax.swing.JOptionPane;

public class Conversor_Monedas {
	
	/*public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(getClass()));
	}*/

	public void ConvertirPesosaDolares(double valor) {
		double monedaUSD = valor / 18.10;
		monedaUSD = (double) Math.round(monedaUSD * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaUSD + "Dolares.");
	}

	public void ConvertirPesosaEuros(double valor) {
		double monedaEUR = valor / 19.79;
		monedaEUR = (double) Math.round(monedaEUR * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaEUR + "Euros.");
	}

	public void ConvertirPesosaLibrasE(double valor) {
		double monedaGBP = valor / 22.41;
		monedaGBP = (double) Math.round(monedaGBP * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaGBP + "Libras");
	}
	
	public void ConvertirPesosaWones(double valor){
		double monedaKRW = valor / 0.014;
		monedaKRW =   (double) Math.round(monedaKRW * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaKRW + "Wones");
	}
	
	public void ConvertirPesosaYenesJ(double valor){
		double monedaJPY = valor / 0.14;
		monedaJPY =   (double) Math.round(monedaJPY * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaJPY + "Yenes");
	}

}
