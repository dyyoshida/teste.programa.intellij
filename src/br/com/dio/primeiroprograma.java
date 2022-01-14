package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {
    public static void main(String[] args) {

        gato gato = new gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Meu primeiro programa em Java", 200);
        System.out.println(livro1);

        /*
        int a = 5;
        int b = 10;
        System.out.println("Seja bem vindo !! " + (a+b));
*/

    }
}

class Livro {
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}