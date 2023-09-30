package conversorDivisas;

import javax.swing.JOptionPane;

public class ConvertirPesosAMonedas {

	
	public void ConvertirPesoADolarEstadounidense(double valor) {
		double monedaDolarEs = valor / 17.50;
		monedaDolarEs = (double) Math.round(monedaDolarEs *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: US$ " +monedaDolarEs+ " Dolares Estadounidenses (USD)");
	}
	
	public void ConvertirPesoADolarCanadiense(double valor) {
		double monedaDolarCa = valor / 17.50;
		monedaDolarCa = (double) Math.round(monedaDolarCa *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: C$" +monedaDolarCa+ " Dolares Canadienses (CAD)");
	}
	
	public void ConvertirPesoAEuro(double valor) {
		double monedaEuro = valor / 18.50;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Conversión: €" +monedaEuro+ " Euros (EUR)");
	}
	
	public void ConvertirPesoALibraEsterlina(double valor) {
		double monedaLibra = valor / 21.50;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: £" +monedaLibra+ " Libras Esterlinas (GBP)");
	}
	
	public void ConvertirPesoARealBrasieno(double valor) {
		double monedaReal= valor / 0.29;
		monedaReal = (double) Math.round(monedaReal *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: R$" +monedaReal+ " Reales Brasiseños (BRL)");
	}
	
	public void ConvertirPesoASolPeruano(double valor) {
		double monedaSol = valor / 0.22;
		monedaSol = (double) Math.round(monedaSol *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: S/." +monedaSol+ " Soles Peruanos (PEN)");
	}
	
	public void ConvertirPesoAYenJapones(double valor) {
		double monedaYen = valor / 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: ¥" +monedaYen+ " Yenes Japoneses (JPY)");
	}
	
	public void ConvertirPesoAYuanChino(double valor) {
		double monedaYuan = valor / 2.39;
		monedaYuan = (double) Math.round(monedaYuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: ¥" +monedaYuan+ " Yuanes Chinos (CNY)");
	}
	
	public void ConvertirPesoAWonSurcoreano(double valor) {
		double monedaWon = valor / 0.013;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Conversión: ₩" +monedaWon+ " Wones Surcoreanos (KRW)");
	}
}
