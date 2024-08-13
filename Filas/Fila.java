public class Fila {

    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int tamanho;

    public Fila(int tamanho) {
        this.primeiro = 0;
        this.ultimo = 0;
        this.dados = new int[tamanho + 1];
        this.tamanho = tamanho + 1;
    }

    public boolean fila_vazia() {
        return primeiro == ultimo;
    }

    public boolean fila_cheia() {
        return (ultimo + 1) % tamanho == primeiro;
    }

    public void imprimir_fila() {
        if (fila_vazia()) {
            System.out.println("Fila Vazia");
            return;
        }

        int i = primeiro;
        while (i != ultimo) {
            System.out.println(dados[i]);
            i = (i + 1) % tamanho;
        }
    }

    public void inserir_na_fila(int valor) {
        if (fila_cheia()) {
            System.out.println("Não é possível inserir: Fila cheia");
        } else {
            dados[ultimo] = valor;
            ultimo = (ultimo + 1) % tamanho;
        }
    }

    public int remover_da_fila() {
        if (fila_vazia()) {
            System.out.println("Não é possível remover: Fila vazia");
            return -1;
        } else {
            int valorRemovido = dados[primeiro];
            primeiro = (primeiro + 1) % tamanho;
            return valorRemovido;
        }
    }
}