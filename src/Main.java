public class Main {

    public static void main(String[] args) {

        // Criando Listas encadeadas (jeito feio)
        // lista = 25, 398, 69, 101
        NoLista n1 = new NoLista(25);
        n1.proximo = new NoLista(389);
        n1.proximo.proximo = new NoLista(69);
        n1.proximo.proximo.proximo = new NoLista(101);

        NoLista noAux = null;
        while (n1 != null) {
            System.out.print(n1.valor + ", ");
            noAux = n1.proximo;
            n1 = noAux;
        }

        // Criando Listas encadeadas (jeito melhorado)
        // lista = 147, 62, 781, 88
        NoLista n2 = new NoLista(147);
        noAux = n2;
        noAux.proximo = new NoLista(62);
        noAux = noAux.proximo;
        noAux.proximo = new NoLista(781);
        noAux = noAux.proximo;
        noAux.proximo = new NoLista(88);
        noAux = noAux.proximo;


        while (n2 != null) {
            System.out.print(n2.valor + ", ");
            noAux = n2.proximo;
            n2 = noAux;
        }

    }
}
