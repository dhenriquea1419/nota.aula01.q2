import java.util.Scanner;

class Produto {
    String codigo, nome, tamanhoOuPeso, cor;
    double valor;
    int quantidade;

    void vender(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    double calcularDesconto(double valorFinal) {
        return valorFinal * 0.95; 
    }

    void mostrarDetalhes() {
        System.out.printf("Produto: %s | Código: %s | Preço: R$ %.2f | Estoque: %d%n",
                nome, codigo, valor, quantidade);
    }
}
