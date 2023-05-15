// Crie uma classe LiguagemFavorita que possua os atributos 'nome', 'anoDeCriacao'e 'ide'. Em seguida, 
// crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
// A. Ordem de Inserção
// B. Ordem Natural
// C. IDE
// D. Ano de criação e nome
// E. Nome, ano de criacao e IDE
// Ao final, exiba as linguagens no console, um abaixo da outra.
//-------

package Exercicios_Interface_Set;
import java.util.Objects;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {
        public static void main(String[] args) {

        // Cria o conjunto de linguagens, instanciando a classe Linguagem criada no final do arquivo.
        
        Set <Linguagem> minhasLinguagens = new LinkedHashSet<>(){{
            add(new Linguagem("SQL", 1982, "Intellij"));
            add(new Linguagem("Python", 1991, "PyCharm"));
            add(new Linguagem("Java", 1991, "VScode"));
        }};

        // A)

        System.out.println("\n A. Exibindo conjunto na ordem de inserção\n");
        for (Linguagem lingua: minhasLinguagens) System.out.println(lingua.getNome() + " - " 
        + lingua.getAnoDeCriacao()+" - "+ lingua.getIde()+"\n" );

        // B)

        System.out.println("\n B. Exibindo conjunto na ordem natural\n");
        Set <Linguagem> LinguagensOrdenadas = new TreeSet<>(minhasLinguagens);
        for (Linguagem lingua: LinguagensOrdenadas) System.out.println(lingua.getNome() + " - " 
        + lingua.getAnoDeCriacao()+" - "+ lingua.getIde()+"\n" );

        // C)

        System.out.println("\n C. Exibindo conjunto na ordem natural pela IDE\n");
        Set <Linguagem> LinguagensOrdenadas2 = new TreeSet<>(new ComparatorIDE());
        LinguagensOrdenadas2.addAll(minhasLinguagens);
        for (Linguagem lingua: LinguagensOrdenadas2) System.out.println(lingua.getNome() + " - " 
        + lingua.getAnoDeCriacao()+" - "+ lingua.getIde()+"\n" );

        // D)

        System.out.println("\n D. Exibindo conjunto na ordem natural pelo Ano de criação e nome\n");
        Set <Linguagem> LinguagensOrdenadas3 = new TreeSet<>(new ComparatorAnoeNome());
        LinguagensOrdenadas3.addAll(minhasLinguagens);
        for (Linguagem lingua: LinguagensOrdenadas3) System.out.println(lingua.getNome() + " - " 
        + lingua.getAnoDeCriacao()+" - "+ lingua.getIde()+"\n" );

        // E)

        System.out.println("\n E. Exibindo conjunto na ordem natural pelo nome, ano e ide\n");
        Set <Linguagem> LinguagensOrdenadas4 = new TreeSet<>(new ComparatorNomeAnoIde());
        LinguagensOrdenadas4.addAll(minhasLinguagens);
        for (Linguagem lingua: LinguagensOrdenadas4) System.out.println(lingua.getNome() + " - " 
        + lingua.getAnoDeCriacao()+" - "+ lingua.getIde()+"\n" );
        
        
    }
    
}

// Cria classe Linguagem
class Linguagem implements Comparable <Linguagem> { 

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public Linguagem(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAnoDeCriacao() {
        return this.anoDeCriacao;
    }
    public String getIde() {
        return this.ide;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", anoDeCriacao='" + getAnoDeCriacao() + "'" +
            ", ide='" + getIde() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Linguagem)) {
            return false;
        }
        Linguagem linguagem = (Linguagem) o;
        return Objects.equals(nome, linguagem.nome) && anoDeCriacao == linguagem.anoDeCriacao && Objects.equals(ide, linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }
    @Override
    public int compareTo(Linguagem linguagem) {
       int output = this.nome.compareToIgnoreCase(linguagem.nome);
        return output;
    }
}

//Cria classe ComparatorIDE
class ComparatorIDE implements Comparator <Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        String lingua1 = l1.getIde();
        String lingua2 = l2.getIde();
        return lingua1.compareTo(lingua2);
    }
    
} 

//Cria classe ComparatorAnoeNome
class ComparatorAnoeNome implements Comparator <Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
       int ano = Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
       if(ano != 0) return ano;
       return l1.getNome().compareTo(l2.getNome());   

    }
}

//Cria classe ComparatorAnoeNome
class ComparatorNomeAnoIde implements Comparator <Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome !=0) return nome;
     
        int ano = Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
        if (ano!=0) return ano;

        return l1.getIde().compareTo(l2.getNome());
        }
}
