package conversorDivisas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolarEstadounidenseAPeso(double valor) {
		double monedaDolarEs = valor * 17.50;
		monedaDolarEs = (double) Math.round(monedaDolarEs *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaDolarEs+ " Pesos (MXN)");
	}
	
	public void ConvertirDolarCanadienseAPeso(double valor) {
		double monedaDolarCa = valor * 13.00;
		monedaDolarCa = (double) Math.round(monedaDolarCa *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaDolarCa+ " Pesos (MXN)");
	}
	
	public void ConvertirEuroAPeso(double valor) {
		double monedaEuro = valor * 18.50;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Conversión: $" +monedaEuro+ " Pesos (MXN)");
	}
	
	public void ConvertirLibraEsterlinaAPeso(double valor) {
		double monedaLibra = valor * 21.50;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaLibra+ " Pesos (MXN)");
	}
	
	public void ConvertirRealBrasilenoAPeso(double valor) {
		double monedaReal = valor * 0.29;
		monedaReal = (double) Math.round(monedaReal *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaReal+ " Pesos (MXN)");
	}
	
	public void ConvertirSolPeruanoAPeso(double valor) {
		double monedaSol = valor * 0.22;
		monedaSol = (double) Math.round(monedaSol *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaSol+ " Pesos (MXN)");
	}
	
	public void ConvertirYenJaponesAPeso(double valor) {
		double monedaYen = valor * 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaYen+ " Pesos (MXN)");
	}
	
	public void ConvertirYuanChinoAPeso(double valor) {
		double monedaYuan = valor * 2.39;
		monedaYuan = (double) Math.round(monedaYuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaYuan+ " Pesos (MXN)");
	}
	
	public void ConvertirWonSurcoreanoAPeso(double valor) {
		double monedaWon = valor * 0.013;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: $" +monedaWon+ " Pesos (MXN)");
	}
}
