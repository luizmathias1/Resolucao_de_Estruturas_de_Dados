public class Pilhas {

    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilhas(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public int pilha_vazia(){
        if (topo == -1) {
            System.out.println("Pilha vazia");
            return 0;
        }
        else
            return topo;
    }
    public void pilha_cheia() {

    }

    public void mostra_pilha(){
        for (int i = 0; i < capacidade; i++){
            System.out.println(dados[i]);
        }
    }

    public void inserir_na_pilha(int valor){
        if (topo == capacidade -1){
            System.out.println("Não é possivel adicionar valores na pilha");
        }
        else{
            dados[++topo] = valor;
        }
    }

    public int remover_da_pilha(){
        if (topo == -1){
            System.out.println("Impossivel remover de uma lista vazia");
        }
        else{

            int valor_removido = dados[topo];
            dados[topo] = 0;
            topo--;

            return valor_removido;

        }
        return 0;
    }
}
