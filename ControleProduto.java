public class ControleProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

      
        System.out.print("Digite o código do produto: ");
        produto.codigo = scanner.nextLine();

        System.out.print("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.print("Digite o tamanho/peso do produto: ");
        produto.tamanhoOuPeso = scanner.nextLine();

        System.out.print("Digite a cor do produto: ");
        produto.cor = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        produto.valor = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        produto.quantidade = scanner.nextInt();

        produto.mostrarDetalhes();

        
        System.out.print("Digite a quantidade a ser vendida: ");
        int quantidadeVendida = scanner.nextInt();
        produto.vender(quantidadeVendida);

        
        System.out.println("Métodos de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Espécie");
        System.out.println("3 - Transferência");
        System.out.println("4 - Débito (5% de desconto)");
        System.out.println("5 - Crédito (3x sem juros)");

        System.out.print("Escolha o método de pagamento: ");
        int metodoPagamento = scanner.nextInt();
        double valorFinal = produto.valor * quantidadeVendida;

        switch (metodoPagamento) {
            case 1: 
            case 3: 
                System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
                break;
            case 2: 
                System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
                System.out.print("Digite o valor pago: ");
                double valorPago = scanner.nextDouble();
                if (valorPago > valorFinal) {
                    System.out.printf("Troco: R$ %.2f%n", valorPago - valorFinal);
                } else {
                    System.out.println("Valor pago insuficiente.");
                }
                break;
            case 4: 
                valorFinal = produto.calcularDesconto(valorFinal);
                System.out.printf("Valor a pagar (com desconto): R$ %.2f%n", valorFinal);
                break;
            case 5: 
                System.out.printf("Valor a pagar em 3x de R$ %.2f (sem juros)%n", valorFinal / 3);
                break;
            default:
                System.out.println("Método de pagamento inválido!");
        }

        scanner.close();
    }
}
