package DuplaEncadeada;

public class NoDupla {
    int valor;
    NoDupla anterior, proximo;

    public NoDupla(int valor) {
        this.valor = valor;
        anterior = proximo = null;
    }
}
