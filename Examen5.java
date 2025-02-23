import java.util.*;

public class Main {
    
    public static int ej1_numeroDigitos(int n) {
        if(n<10){
            return 1;
        }
        return 1 + ej1_numeroDigitos(n/10);
    }

    public static int ej2_edificiosVistaAlOeste(int[] alturas){
        int count = 0;
        int comp = 0;
        for(int i=alturas.length-1; i>=0; i--){
            if(alturas[i]>comp){
                count++;
                comp = alturas[i];
            }
        }
        return count;
    }

    public static List<Integer> ej4_bebidas(List<List<Integer>> clientDrinks){
        List<Integer> res = new ArrayList<>();
        int freq;
        int count1;
        int count2;

        while(!clientDrinks.isEmpty()) {
            freq = 0;
            count1 = 0;
            count2 = 0;

            // Iterar sobre cada bebida de la primera lista (clientDrinks.get(0))
            for (int i = 0; i < clientDrinks.get(0).size(); i++) {

                // Comprobar cuántos clientes contienen esa bebida
                for (int j = 0; j < clientDrinks.size(); j++) {
                    if (clientDrinks.get(j).contains(clientDrinks.get(0).get(i))) {
                        count2++;
                    }
                }

                // Actualizar la bebida más frecuente
                if (count2 > count1) {
                    freq = i;
                    count1 = count2;
                }
            }

            // Añadir la bebida más frecuente a la lista de resultados
            res.add(clientDrinks.get(0).get(freq));

            // Eliminar todos los clientes que contienen esa bebida
            int bebidaElegida = clientDrinks.get(0).get(freq);
            int i = 0;
            while (i < clientDrinks.size()) {
                if(clientDrinks.get(i).contains(bebidaElegida)) {
                    clientDrinks.remove(i);
                } else{
                    i++;
                }
            }
        }

        return res;
    }

    public static List<String> ej5_subsecuencias(String str){
        List<String> list = new ArrayList<>();
        int n = str.length();
        int totalSubsequences = (1 << n);
        String[] binSet = new String[totalSubsequences];

        String actualSubsequence;

        for(int i=0;i<totalSubsequences;i++){
            binSet[i] = Integer.toBinaryString(i);
            binSet[i] = " ".repeat((str.length()-binSet[i].length())) + binSet[i];
        }

        for(int i=0;i<totalSubsequences;i++){
            actualSubsequence = "";
            for(int j=0;j<str.length();j++){
                if(binSet[i].charAt(j)=='1'){
                    actualSubsequence += String.valueOf(str.charAt(j));
                }
            }
            list.add(actualSubsequence);
        }

        list.remove(0);

        return list;
    }
}
