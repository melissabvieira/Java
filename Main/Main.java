package Main;

import domain.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static Algoritmo getAlgoritmo(TipoJogada tipo) {
        Algoritmo algoritmo = null;
        switch (tipo) {
            case PAPEL -> algoritmo = new Papel();
            case TESOURA -> algoritmo =  new Tesoura();
            case PEDRA -> algoritmo =  new Pedra();
            default -> throw new IllegalArgumentException("Tipo invalido");
        }
        return algoritmo;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();

        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + computador);

        TipoJogada jogadaUsuario = TipoJogada.getById(jogada);
        TipoJogada jogadaComputador = TipoJogada.getById(computador);

        System.out.printf("User: %s\n", jogadaUsuario);
        System.out.printf("Computer: %s\n", jogadaComputador);

        Algoritmo algoritmo = getAlgoritmo(jogadaUsuario);

        Jokenpo jokenpo = new Jokenpo(algoritmo);

        jokenpo.jogar(jogadaComputador);

        in.close();
    }
}
