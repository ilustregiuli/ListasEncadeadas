public class NoLista {

     int valor;
     NoLista proximo;

    public NoLista(int valor) {
        this.valor = valor;
    }

    public NoLista(int valor, NoLista proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

}
