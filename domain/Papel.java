package domain;

public class Papel extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Empatou - Papel empata com Papel.");
            case TESOURA -> System.out.println("Perdeu - Tesoura corta Papel.");
            case LAGARTO -> System.out.println("Perdeu - Lagarto come Papel.");
            case PEDRA -> System.out.println("Ganhou - Papel cobre Pedra.");
            case SPOCK -> System.out.println("Ganhou - Papel refuta Spock.");
            default -> System.out.println("Opção inválida");
        }
    }
}
