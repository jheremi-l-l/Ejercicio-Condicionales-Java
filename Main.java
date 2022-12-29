public class Main {
    public static void main(String[] args) {
        //Comparacion de variable num es positivo o negativo con IF
        /*int num = -4;
        if (num > 0) {
            System.out.println("El numero es positivo");
        }else if (num == 0){
            System.out.println("El numero es igual a 0");
        }else {
            System.out.println("El numero es negativo");
        }*/

        /*Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
         el bloque de código que tendrá el bucle
         */

        //int variable = 0;

        /*while (variable < 3){
            variable = variable + 1;
            System.out.println(variable);
        }*/

        /*do {
            System.out.println(variable);
            variable = variable +1;
        } while (variable < 0);*/

        /* EJERCICIO DE BUCLE FOR
        for  (int numero = 0; numero <=3; numero++){
            System.out.println(numero);
        }*/

       var estacion ="Verano";

        switch (estacion){
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Es otra estacion");
        }

    }
}