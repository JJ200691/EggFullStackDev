package Extra02;

import Extra02.Enum.Instalacion;
import Extra02.Moldes.Edificio;
import Extra02.Moldes.EdificioDeOficinas;
import Extra02.Moldes.Polideportivo;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Extra 2
        /*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
        largo. La clase edificio tendrá como métodos:
            • Método calcularSuperficie(): calcula la superficie del edificio.
            • Método calcularVolumen(): calcula el volumen del edifico.
        Estos métodos serán abstractos y los implementarán las siguientes clases:
            • Clase Polideportivo con su nombre y tipo de instalación que puede ser
            Techado o Abierto, esta clase implementará los dos métodos abstractos y los
            atributos del padre.
            • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
            personas por oficina y numero de pisos. Esta clase implementará los dos
            métodos abstractos y los atributos del padre.
            De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
            edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
            oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
            Crear el método cantPersonas(), que muestre cuantas personas entrarían en
            un piso y cuantas en todo el edificio.
        Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
        contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
        y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
        deberá mostrar la superficie y el volumen de cada edificio.
        Además de esto, para la clase Polideportivo nos interesa saber cuantos
        polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
        deberemos llamar al método cantPersonas() y mostrar los resultados de cada
        edificio de oficinas. */
       
        ArrayList<Edificio> edificios = new ArrayList();
        Edificio poli1 = new Polideportivo("Martin Palermo", Instalacion.TECHADO, 300, 10, 300);
        Edificio poli2 = new Polideportivo("Diego Maradona", Instalacion.ABIERTO, 100, 50, 200);
        Edificio ofi1 = new EdificioDeOficinas(0, 0, 0, 100, 200, 100);
        Edificio ofi2 = new EdificioDeOficinas(0, 0, 0, 1000, 300, 300);
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(ofi1);
        edificios.add(ofi2);
        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
        }

    }

}
