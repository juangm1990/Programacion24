package TercerTrimestre.Recuperacion.Recuperacion3;

public class Pregunta1A {
    public static void main(String[] args) {
        String[] textos = {"Hola mundo", "Aprender Java", "Programación es divertida", "OpenAI", "ChatGPT", "Código abierto", "Trabajo en equipo"};

        int letraA = 0;
        int letraO = 0;

        for (int i = 0; i < textos.length; i++) {
            String texto = textos[i];

            boolean tieneLetraA = false;
            boolean tieneLetraO = false;

            for (int j = 0; j < texto.length(); j++) {
                char letra = texto.charAt(j);

                if (letra == 'a' || letra == 'A') {
                    tieneLetraA = true;
                }
                if (letra == 'o' || letra == 'O') {
                    tieneLetraO = true;
                }
            }

            if (tieneLetraA) {
                letraA = letraA + 1;
            }
            if (tieneLetraO) {
                letraO = letraO + 1;
            }
        }

        System.out.println("Número de cadenas que contienen la letra 'a': " + letraA);
        System.out.println("Número de cadenas que contienen la letra 'o': " + letraO);
    }
}
