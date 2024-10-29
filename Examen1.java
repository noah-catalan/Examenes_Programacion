public class Main {
    public static int sumaImpares(int a, int b) {
        int suma = 0;
        for(int i=a; i<=b; i++){
            if(i%2==1){
                suma+=i;
            }
        }
        return suma;
    }

    public static boolean esPrimo(int n){
        boolean resultado = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                resultado = false;
            }
        }
        return resultado;
    }

    public static int[] primosEntre(int x, int y){
        int num1= x;
        int num2= y;
        if(x>y){
            num1=y;
            num2=x;
        }
        int contador = 0;
        for(int i=num1+1; i<=num2; i++){
            if(esPrimo(i)){contador++;}

        }
        int[] resultado = new int[contador];
        int contador2 = 0;
        for(int i=num1+1; i<=num2; i++){
            if(esPrimo(i)){
                resultado[contador2] = i;
                contador2++;
            }
        }
        return resultado;
    }

    public static int numerosPrimosHasta(int ulti){
        int contador = 0;
        for(int i = 2; i<=ulti; i++){
            if(esPrimo(i)){contador++;}
        }
        return contador;
    }

    public static int invertirNumero(int num){
        String snum = Integer.toString(num);
        String res = "";
        for(int i=snum.length()-1; i>=0; i--){
            res += String.valueOf(snum.charAt(i));
        }
        return Integer.parseInt(res);
    }


    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("La suma de los números impares entre 3 y 7 es: " + sumaImpares(3,7) + "\n");

        //Ejercicio 2
        System.out.println("El número 7 es primo? " + esPrimo(7) + "\n");

        //Ejercicio 3
        System.out.println("Los números primos entr el 10 y el 20 son los siguientes: ");
        for(int i=0; i<primosEntre(10,20).length; i++){
            System.out.print(primosEntre(10,20)[i] + " ");
        }
        System.out.println("\n");

        //Ejercicio 4
        System.out.println("Cuantos números primos hay antes del número 14? " + numerosPrimosHasta(14) + "\n");

        //Ejercicio 5
        System.out.println("Si invertimos el número 9823 nos quedaría el " + invertirNumero(9823) + "\n");

    }
}
