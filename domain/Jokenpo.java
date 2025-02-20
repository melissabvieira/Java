package domain;

public class Jokenpo {
    private Algoritmo algoritmo;

    public Jokenpo() {
    }

    public Jokenpo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void jogar(TipoJogada tipoJogada) {
        algoritmo.executar(tipoJogada);
    }
}
