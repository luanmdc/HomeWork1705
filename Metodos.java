import java.util.ArrayList;
import java.util.List;

public class Metodos {
    //Crie um método que receba uma string e imprima o tamanho dela
    public void imprimeMensagem(String verificaTamanho) {
        System.out.println("a String " + verificaTamanho + " tem " + verificaTamanho.length() + " caracteres");
    }

    //Crie um método que receba uma lista de números e imprima se são números maiores que 100 e pares ou se são menores que 100 e impares
    public List<Integer> verificaPar(List<Integer> numeros) {
        List<Integer> maior100 = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 != 0 && numero < 100) {
                System.out.println("o valor " + numero + " e Impar e menor que 100");
            } else {
                if (numero % 2 != 1 && numero > 100) {
                    System.out.println("o valor " + numero + " e par e maior que 100");
                }

            }

        }
        return numeros;
    }
//Crie um método que receba uma string (palavra) e um número (tamanhoLimite) e verifique se o tamanho da string é maior
// que o tamanho limite, se for, retorne uma mensagem, caso seja igual ou menor, informe outra mensagem.

    public void recebeString(String palavra, int tamanhoLimite) {
        if (palavra.length() > tamanhoLimite) {
            System.out.println("a palavra " + palavra + " nao e permitida, por favor tente novamente.");
        } else {
            System.out.println("a palavra " + palavra + " esta nos paramentros corretos");
        }

    }

    //Crie um objeto Pessoa com alguns atributos
//Crie um método que receba Pessoa e imprima todas as informações de pessoa
//Crie um método que receba Pessoa e um número (idadeLimite) e verifique se a pessoa está na idade limite indicada

     Pessoa pessoa = new Pessoa();

    public void imprimePessoa(Pessoa pessoa) {
        System.out.println(pessoa.toString());
    }

    public void verificaIdade(int idadeLimite) {
        Pessoa pessoa = new Pessoa();

        if (pessoa.getIdade()< idadeLimite) {
            System.out.println("a idade " + pessoa.getIdade() + " esta no limite solicitado");
        } else {
            System.out.println("a idade " + pessoa.getIdade() + " esta fora do limite");
        }

    }
}