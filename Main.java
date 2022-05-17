import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.imprimeMensagem("paralelepipedo");

        List<Integer>numeros = new ArrayList<>();
            numeros.add(10);
            numeros.add(105);
            numeros.add(109);
            numeros.add(110);
            numeros.add(13);

        metodos.verificaPar(numeros);

        metodos.recebeString("luan",2);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("luan");
        pessoa.setSexo("masculino");
        pessoa.setIdade(12);
        metodos.imprimePessoa(pessoa);

        metodos.verificaIdade(30);


    }
}
