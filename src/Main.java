//Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.




import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Strings> strings = new ArrayList<>();
        Strings s1 = new Strings("top","gun","bom");
        Strings s2 = new Strings("tunel","dun","tom");
        Strings s3 = new Strings("zap","craken","zom");
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.forEach(string -> System.out.println(string));

//        Cachorro c1 = new Cachorro();
//        Animal animal = (Animal) c1;
        Animal animal = new Cachorro();
        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }
    //

        Produto produto1 = new Produto("Ar condicionado", 2000.0);
        Produto produto2 = new Produto("Aquecedor", 800.0);
        Produto produto3 = new Produto("Ventilador", 150.0);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
        //
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
        //
        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}