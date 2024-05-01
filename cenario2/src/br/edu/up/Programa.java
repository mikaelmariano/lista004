package br.edu.up;

public class Programa {
    public static void main(String[] args) {

        // 1. Cria o objeto ponto1 usando o primeiro construtor;
        Ponto ponto1 = new Ponto();

        // 2. Cria o objeto ponto2 na posição (2, 5);
        Ponto ponto2 = new Ponto(2, 5);

        // 3. Calcula a distância do ponto1 ao ponto2;
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distancia);

        // 4. Calcula a distância do ponto2 às coordenadas (7, 2);
        double distanciaCoordenadas = ponto2.calcularDistancia(7, 2);
        System.out.println("Distância entre ponto2 e coordenadas (7, 2): " + distanciaCoordenadas);

        // 5. Altera o valor de x para 10 no ponto1;
        ponto1.setX(10);

        // 6. Altera o valor de y para 3 no ponto1;
        ponto1.setY(3);

        System.out.println("Ponto1 atualizado: " + ponto1.toString());
    }
}
