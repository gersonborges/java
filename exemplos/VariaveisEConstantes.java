package _2318;

public class VariaveisEConstantes {

    public static void main(String[] args) {
        // Declara uma variável, cria um nome
        boolean produtoComprado;

        // Inicia a variável
        produtoComprado = true;

        // Altera o valor da variável
        produtoComprado = false;

        // Declara uma variável, cria um nome
        // e inicia a variável no mesmo comando
        boolean produtoNovo = false;

        // Cria uma variável final, seu valor
        // nunca poderá mudar
        final float TAXA_CREDITO = 3.4F;
        TAXA_CREDITO = 1F; // Erro de compilação
    }
}
