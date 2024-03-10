package ProblemaFisica;

import javax.swing.*;

public class ProblemaFisica {

        public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido al solucionador de problemas de física!\n\n" +
                    "Este programa te ayudará a calcular la aceleración y la tensión en una situación dada.\n" +
                    "Por favor, sigue las instrucciones para proporcionar la información necesaria.");

            double m1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa de la bola colgante (m1) en kg: "));
            double m2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa del bloque sobre la mesa (m2) en kg: "));
            double g = 9.8; // Aceleración gravitacional en m/s^2

            // Solicitar al usuario que ingrese el coeficiente de fricción
            String[] opcionesFriccion = {"0 (sin fricción)", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0", "Ingresar otro valor"};
            String coeficienteFriccionSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione el coeficiente de fricción:",
                    "Coeficiente de Fricción", JOptionPane.PLAIN_MESSAGE, null, opcionesFriccion, opcionesFriccion[0]);

            double mu;
            if (coeficienteFriccionSeleccionado.equals("Ingresar otro valor")) {
                String valorFriccionPersonalizado = JOptionPane.showInputDialog("Ingrese el coeficiente de fricción personalizado:");
                mu = Double.parseDouble(valorFriccionPersonalizado);
            } else {
                mu = Double.parseDouble(coeficienteFriccionSeleccionado.split(" ")[0]); // Extraer el valor numérico del coeficiente seleccionado
            }

            // Calcular la aceleración
            double a = (m2 * g - mu * m1 * g) / (m1 + m2);

            // Calcular la tensión en la cuerda
            double T = m1 * (g - a);

            // Mostrar resultados
            JOptionPane.showMessageDialog(null, "La aceleración es: " + a + " m/s^2\n" +
                    "La tensión es: " + T + " N");

            int option = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Salir", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }



