package conversorMenu;

import javax.swing.JOptionPane;

import conversorDivisas.function;

public class ConversorMenu {
    public static void main (String[] args) {

        function monedas = new function();
             
        while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(null, "¡Bienvenido al conversor! Seleccione aceptar para continuar. De lo contrario, de click en el botón cerrar.", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Divisas"}, "Seleccion")).toString();

        	switch(opciones) {
        	case "Divisas":
        		 String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);

                     int respuestaDivisa=JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuestaDivisa){
                     	System.out.println("Selecciona opción Afirmativa");
                     } else{
                        	JOptionPane.showMessageDialog(null, "Fin del conversor, de click en el botón cerrar.");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un valor.");                
                    }
                     	break;
        }                
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
        	
