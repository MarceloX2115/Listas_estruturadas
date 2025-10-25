package EncadeadaCircular;

public class CRUD {
    NoCircular inicio = null;
    NoCircular fim = null;

    public void inserir(int valor) {
        NoCircular novo = new NoCircular(valor);
        if (inicio == null) {
            inicio = fim = novo;
            novo.proximo  = inicio;
        } else {
            fim.proximo = novo;
            fim = novo;
            fim.proximo = inicio;
        }
    }

    public boolean buscar(int valor) {
        if (inicio == null) return false;
        NoCircular aux = inicio;
        do {
            if (aux.valor == valor) return true;
            aux = aux.proximo;
        } while (aux != inicio);
        return false;
    }
     public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        NoCircular aux = inicio;
        System.out.print("Lista: ");
        do {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        } while (aux != inicio);
        System.out.println();
    }
     public void remover(int valor) {
        if (inicio == null) return;
        NoCircular atual = inicio, anterior = fim;

        do {
            if (atual.valor == valor) {
                if (atual == inicio) inicio = inicio.proximo;
                if (atual == fim) fim = anterior;
                anterior.proximo = atual.proximo;
                if (inicio == fim && inicio.valor == valor) inicio = fim = null;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);
    }

    
}
