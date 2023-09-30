package conversorDivisas;

import javax.swing.JOptionPane;

public class function {

	ConvertirPesosAMonedas monedas = new ConvertirPesosAMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Seleccione la divisa a la que desea convertir la cantidad ingresada: ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Peso (MXN) a Dólar Estadounidense (USD)", "De Peso (MXN) a Dólar Canadiense (CAD)",
    					"De Peso (MXN) a Euro (EUR)", "De Peso (MXN) a Libra Esterlina (GBP)",
    					"De Peso (MXN) a Real Brasileño (BRL)", "De Peso (MXN) a Sol Peruano (PEN)",
    					"De Peso (MXN) a Yen Japonés (JPY)","De Peso (MXN) a Yuan Chino (CNY)",
    					"De Peso (MXN) a Won Surcoreano (KRW)",
    					
    					"De Dólar Estadounidense (USD) a Peso (MXN)","De Dólar Canadiense (CAD) a Peso (MXN)",
    					"De Euro (EUR) a Peso (MXN)","De Libra Esterlina (GBP) a Peso (MXN)",
    					"De Real Brasileño (BRL) a Peso (MXN)", "De Sol Peruano (PEN) a Peso (MXN)",
    					"De Yen Japonés (JPY) a Peso (MXN)","De Yuan Chino (CNY) a Peso (MXN)",
    					"De Won Surcoreano (KRW) a Peso (MXN)"}, 
    			"Seleccion")).toString();
       
    	switch(opcion) {
    	
        case "De Peso (MXN) a Dólar Estadounidense (USD)":
        	monedas.ConvertirPesoADolarEstadounidense(Minput);
        	break;
        case "De Peso (MXN) a Dólar Canadiense (CAD)":
        	monedas.ConvertirPesoADolarCanadiense(Minput);
        	break;
        case "De Peso (MXN) a Euro (EUR)":
        	monedas.ConvertirPesoAEuro(Minput);
        	break;
        case "De Peso (MXN) a Libra Esterlina (GBP)":
        	monedas.ConvertirPesoALibraEsterlina(Minput);
        	break;
        case "De Peso (MXN) a Real Brasileño (BRL)":
        	monedas.ConvertirPesoARealBrasieno(Minput);
        	break;
        case "De Peso (MXN) a Sol Peruano (PEN)":
        	monedas.ConvertirPesoASolPeruano(Minput);
        	break;
        case "De Peso (MXN) a Yen Japonés (JPY)":
        	monedas.ConvertirPesoAYenJapones(Minput);
        	break;
        case "De Peso (MXN) a Yuan Chino (CNY)":
        	monedas.ConvertirPesoAYuanChino(Minput);
        	break;
        case "De Peso (MXN) a Won Surcoreano (KRW)":
        	monedas.ConvertirPesoAWonSurcoreano(Minput);
        	break;    	  
        	
        case "De Dólar Estadounidense (USD) a Peso (MXN)":
        	pesos.ConvertirDolarEstadounidenseAPeso(Minput);
        	break;
        case "De Dólar Canadiense (CAD) a Peso (MXN)":
        	pesos.ConvertirDolarCanadienseAPeso(Minput);
        	break;
        case "De Euro (EUR) a Peso (MXN)":
        	pesos.ConvertirEuroAPeso(Minput);
        	break;
        case "De Libra Esterlina (GBP) a Peso (MXN)":
        	pesos.ConvertirLibraEsterlinaAPeso(Minput);
        	break;
        case "De Real Brasileño (BRL) a Peso (MXN)":
        	pesos.ConvertirRealBrasilenoAPeso(Minput);
        	break;
        case "De Sol Peruano (PEN) a Peso (MXN)":
        	pesos.ConvertirSolPeruanoAPeso(Minput);
        	break;
        case "De Yen Japonés (JPY) a Peso (MXN)":
        	pesos.ConvertirYenJaponesAPeso(Minput);
        	break;
        case "De Yuan Chino (CNY) a Peso (MXN)":
        	pesos.ConvertirYuanChinoAPeso(Minput);
        	break;	
        case "De Won Surcoreano (KRW) a Peso (MXN)":
            pesos.ConvertirWonSurcoreanoAPeso(Minput);
            break;
            
        }      
    }
        
}
