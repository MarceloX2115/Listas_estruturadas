package DuplaEncadeada;

public class CRUD {
    NoDupla inicio, fim;

    public void inserirInicio(int valor) {
        NoDupla novo = new NoDupla(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void inserirFim(int valor) {
        NoDupla novo = new NoDupla(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public boolean buscar(int valor) {
        NoDupla aux = inicio;
        while (aux != null) {
            if (aux.valor == valor) return true;
            aux = aux.proximo;
        }
        return false;
    }
     public void listar() {
        NoDupla aux = inicio;
        System.out.print("Lista: ");
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }
      public void remover(int valor) {
        NoDupla aux = inicio;
        while (aux != null && aux.valor != valor) {
            aux = aux.proximo;
        }
        if (aux == null) return;

        if (aux.anterior != null) aux.anterior.proximo = aux.proximo;
        else inicio = aux.proximo;

        if (aux.proximo != null) aux.proximo.anterior = aux.anterior;
        else fim = aux.anterior;
    }


}
