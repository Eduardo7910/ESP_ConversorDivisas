package ConvertidorMonedas;

import javax.swing.JOptionPane;

public class Conversor_MonedasEx {

	public void ConvertirDolaresaPesosMXN(double valor){
		double monedaMXN = valor / 18.09;
		monedaMXN =   (double) Math.round(monedaMXN * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaMXN + "Pesos");
	}
	
	public void ConvertirEurosaPesosMXN(double valor){
		double monedaMXN = valor / 0.051;
		monedaMXN =   (double) Math.round(monedaMXN * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaMXN + "Pesos");
	}
	
	public void ConvertirLibrasaPesosMXN(double valor){
		double monedaMXN = valor / 0.045;
		monedaMXN =   (double) Math.round(monedaMXN * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaMXN + "Pesos");
	}
	
	public void ConvertirWonesaPesosMXN(double valor){
		double monedaMXN = valor / 71.68;
		monedaMXN =   (double) Math.round(monedaMXN * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaMXN + "Wones");
	}
	
	public void ConvertirYenesJaPesosMXN(double valor){
		double monedaMXN = valor / 7.33;
		monedaMXN =   (double) Math.round(monedaMXN * 100d)/100;
		JOptionPane.showMessageDialog(null, "Usted tiene la cantidad de $" + monedaMXN + "Pesos");
	}
}
