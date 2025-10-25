package ListaSimples;

public class CRUD {
    No inicio;
     public void inserirInicio(int valor){
         No novo =  new No(valor);
         novo.proximo = inicio;
         inicio = novo;
     }
     public void inserirFim(int valor){
         No novo = new No(valor);
         if (inicio == null){
             inicio = novo;
             return;
         }
         No aux = inicio;
         while (aux.proximo != null){
             aux = aux.proximo;
         }
         aux.proximo = novo;
     }
     public boolean buscar(int valor){
         No aux = inicio;
         while (aux != null){
             if (aux.valor == valor) return true;
             aux = aux.proximo;
         }
         return false;
     }
     public void listar(){
         No aux = inicio;
         System.out.println("Lista: ");
         while (aux != null){
             System.out.println(aux.valor + " ");
             aux = aux.proximo;
         }
         System.out.println();
     }
     public void remover(int valor){
         if (inicio == null) return;
         
         if (inicio.valor == valor ){
             inicio = inicio.proximo;
             return;
         }
         No aux = inicio;
         while (aux.proximo != null && aux.proximo.valor != valor){
             aux = aux.proximo;
         }
         if (aux.proximo != null){
             aux.proximo = aux.proximo.proximo;
         }
     }
    
}
