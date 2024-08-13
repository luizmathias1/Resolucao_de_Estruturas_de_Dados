public class Main {

    static Pilhas pilhas = new Pilhas(3);

    public static void main(String[] args) {

        pilhas.pilha_vazia();

        pilhas.inserir_na_pilha(10);
        pilhas.inserir_na_pilha(20);
        pilhas.inserir_na_pilha(30);

        pilhas.mostra_pilha();
        pilhas.remover_da_pilha();
        pilhas.remover_da_pilha();

        pilhas.mostra_pilha();

    }
}

