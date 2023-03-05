/*
Principais aspectos da anatomia de um código em Java
*/

/*
Para atribuir uma variável é necessáio explicitar o tipo de variável antes (se string, inteiro, etc)
Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
Exemplo: 
String meuNome = "Kelvin";
int anoFabricacao = 2022;
boolean verdadeira;
*/

public class MinhaClasse {
    
public static void main (String [] args) {
    String primeiroNome = "Kelvin";
    String segundoNome = "Aurélio";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print("Olá turma, sejam bem-vindos! O meu nome é "+ nomeCompleto + " ");
} 

/*
Para atribuir métodos seguimos a convenção: TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
Exemplo:
int somar (int numeroUm, int numero2);
String formatarCep (long cep);
*/  

/*
Criando um novo método para exemplificar:
*/
    
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
    }       
}