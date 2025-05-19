package PrimerTrimestre.Array.ArrayBidimensionales;


import java.util.ArrayList;

public class Bingo {
    public static void main(String[] args) throws Exception {
    
        ArrayList<ArrayList<Integer>> carton = generarCarton();

        for (int i = 0; i < carton.size(); i++) {
            for (int j = 0; j < carton.get(i).size(); j++) {
                System.out.print(carton.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generarCarton() {

        ArrayList<Integer> cartonColumna0 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna1 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna2 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna3 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna4 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna5 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna6 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna7 = new ArrayList<Integer>();
        ArrayList<Integer> cartonColumna8 = new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> carton = new ArrayList<ArrayList<Integer>>();
        carton.add(cartonColumna0);
        carton.add(cartonColumna1);
        carton.add(cartonColumna2);
        carton.add(cartonColumna3);
        carton.add(cartonColumna4);
        carton.add(cartonColumna5);
        carton.add(cartonColumna6);
        carton.add(cartonColumna7);
        carton.add(cartonColumna8);

        while (contarElementos(carton) < 15) {
            int numeroAleatorio = (int)Math.floor(Math.random() * 90 + 1);

            if (numeroAleatorio >= 1 && numeroAleatorio < 10) {
                if (cartonColumna0.size() < 2) {
                    cartonColumna0.add(numeroAleatorio);
                }         
            } else if (numeroAleatorio >= 10 && numeroAleatorio < 20) {
                if (cartonColumna1.size() < 2) {
                    cartonColumna1.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 20 && numeroAleatorio < 30) {
                if (cartonColumna2.size() < 2) {
                    cartonColumna2.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 30 && numeroAleatorio < 40) {
                if (cartonColumna3.size() < 2) {
                    cartonColumna3.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 40 && numeroAleatorio < 50) {
                if (cartonColumna4.size() < 2) {
                    cartonColumna4.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 50 && numeroAleatorio < 60) {
                if (cartonColumna5.size() < 2) {
                    cartonColumna5.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 60 && numeroAleatorio < 70) {
                if (cartonColumna6.size() < 2) {
                    cartonColumna6.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 70 && numeroAleatorio < 80) {
                if (cartonColumna7.size() < 2) {
                    cartonColumna7.add(numeroAleatorio);
                }   
            } else if (numeroAleatorio >= 80 && numeroAleatorio <= 90) {
                if (cartonColumna8.size() < 2) {
                    cartonColumna8.add(numeroAleatorio);
                }   
            }
        }

        return carton;
    }

    public static int contarElementos(ArrayList<ArrayList<Integer>> matriz) {

        int cont = 0;

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                cont++;
            }
        }    
        
        return cont;
    }
}
