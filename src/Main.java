import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        enderecos.add(new Endereco("Rua tal", 213));
        pessoas.add(new Pessoa("Erick", 20, enderecos));

        enderecos.add(new Endereco("Rua lat", 321));
        pessoas.add(new Pessoa("Rafael", 20, enderecos));

        System.out.println("Buscar:");
        String nomeBuscado = scan.nextLine();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().toLowerCase().contains(nomeBuscado.toLowerCase())) {
                System.out.println("\nNome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("Rua: " + pessoa.getEnderecos().get(0).getRua());
                System.out.println("Numero: " + pessoa.getEnderecos().get(0).getNumero());
            }
        }


//        for (int i = 0; i<3; i++){
//
//            String nome = scan.next();
//            int idade = scan.nextInt();
//
//            List<Endereco> end = new ArrayList<>();
//
//            int qtd = scan.nextInt();
//
//            for (int j=0; j<qtd; j++){
//                System.out.println("Endereco " + (j+1));
//                end.add(new Endereco(scan.next(), scan.nextInt()));
//            }
//
//            pessoas.add(new Pessoa(nome, idade, end));
//
//        }
//
//        for (int i = 0; i<3; i++){
//
//            System.out.println(pessoas.get(i).getNome());
//
//            for (int j=0; j<pessoas.get(i).getEnderecos().size(); j++){
//                System.out.println(pessoas.get(i).getEnderecos().get(j).getRua());
//            }
//
//        }

    }
}