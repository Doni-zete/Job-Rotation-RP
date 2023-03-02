public class Pergunta4 {
    public static void main(String[] args) {


        int distancia = 100, velocidadeCarro = 110, velocidadeCaminhao = 80;
        double tempoCarro = 0, tempoCaminhao=0;

        tempoCarro = distancia / (double) velocidadeCarro;
        tempoCaminhao = (distancia - 2 * 5) / (double) (velocidadeCaminhao);
        if (tempoCarro < tempoCaminhao) {

            System.out.println("O carro estará mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo de Ribeirão Preto.");
        }
    }
}

//Sabendo que a distância entre as duas cidades é de 100 km e que o carro e o caminhão saem de cidades opostas,
//podemos calcular o tempo que leva para eles se encontrarem na estrada.