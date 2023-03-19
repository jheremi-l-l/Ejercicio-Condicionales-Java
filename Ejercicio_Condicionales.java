package estructurascontrol;
import java.util.Arrays;

/*
*Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
*String []  nombres = {" "," "," "};
*/
public class Ejercicio_Condicionales {

    public static void main(String[] args) {

        String [] nombres1 = {"Ana", "Maria","Libra"};
        String [] nombres2 = {"Pepe", "Juan", "Leon"};
        String [] concatenar = new String[nombres1.length + nombres2.length];

        int p=0;

        for(int i = 0; i<nombres1.length;i++){
            concatenar[p]= nombres1[i];
            p++;
        }
        for (int j=0; j< nombres2.length;j++){
            concatenar[p]= nombres2[j];
            p++;
        }
        System.out.println("Concatenacion: " + Arrays.toString(concatenar));
    }
}

