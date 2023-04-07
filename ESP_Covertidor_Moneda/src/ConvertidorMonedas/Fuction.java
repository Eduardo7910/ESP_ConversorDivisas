package ConvertidorMonedas;

import javax.swing.JOptionPane;

public class Fuction {

	Conversor_Monedas monedas_Extranjeras = new Conversor_Monedas();
	Conversor_MonedasEx moneda_Nacional = new Conversor_MonedasEx();
	
	public void ConvertirMonedas(double Minput){
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda que deseas convertir", "Monedas", JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, "Seleccion")).toString();
		
		switch (opcion) {
		
		case "De Pesos a Dólar":
			monedas_Extranjeras.ConvertirPesosaDolares(Minput);
			break;
			
		case "De Pesos a Euro":
			monedas_Extranjeras.ConvertirPesosaEuros(Minput);
			break;
			
		case "De Pesos a Libras":
			monedas_Extranjeras.ConvertirPesosaLibrasE(Minput);
			break;
			
		case "De Pesos a Won Coreano":
			monedas_Extranjeras.ConvertirPesosaWones(Minput);
			break;
			
		case "De Pesos a Yen":
			monedas_Extranjeras.ConvertirPesosaYenesJ(Minput);
			
			//Extranjera a Nacional
			
		case "De Dólar a Pesos":
			moneda_Nacional.ConvertirDolaresaPesosMXN(Minput);
			break;
		
		case "De Euro a Pesos":
			moneda_Nacional.ConvertirEurosaPesosMXN(Minput);
			
		case"De Libras a Pesos":
			moneda_Nacional.ConvertirLibrasaPesosMXN(Minput);
			break;
			
		case "De Won Coreano a Pesos":
			moneda_Nacional.ConvertirWonesaPesosMXN(Minput);
			break;
			
		case "De Yen a Pesos":
			moneda_Nacional.ConvertirYenesJaPesosMXN(Minput);
			break;
		}
		
	}
}
