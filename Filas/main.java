public class main {
    public static void main(String[] args) {
        Fila fila = new Fila(6);

        fila.inserir_na_fila(90);
        fila.inserir_na_fila(40);
        fila.inserir_na_fila(30);
        fila.inserir_na_fila(77);
        fila.inserir_na_fila(100);
        fila.inserir_na_fila(1000);
        fila.imprimir_fila();

        fila.remover_da_fila();
        fila.remover_da_fila();
        fila.remover_da_fila();
        fila.remover_da_fila();
        fila.remover_da_fila();
        fila.remover_da_fila();


        System.out.println("Após remover");
        fila.inserir_na_fila(88);
        fila.inserir_na_fila(26);
        fila.inserir_na_fila(44);

        fila.imprimir_fila();
    }
}
