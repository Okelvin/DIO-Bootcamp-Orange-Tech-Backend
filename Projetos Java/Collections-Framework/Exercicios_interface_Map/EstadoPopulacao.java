// Dada a população estimada de alguns estados do NE brasileiro, faça:
// Estado = PE - População = 9.616.621
// Estado = AL - População = 3.351.543
// Estado = CE - População = 9.187.103
// Estado = RN - População = 3.534.265
// A. Crie um dicionário e relacione os estados e suas populações;
// B. Substitua a população do estado do RN por 3.534.165;
// C. Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
// D. Exiba a população PE;
// E. Exiba todos os estados e suas populações na ordem que foi informado;
// F. Exiba os estados e suas populações em ordem alfabética;
// G. Exiba o estado com o menor população e sua quantidade;
// H. Exiba o estado com a maior população e sua quantidade;
// I. Exiba a soma da população desses estados;
// J. Exiba a média da população deste dicionário de estados;
// K. Remova os estados com a população menor que 4.000.000;
// L. Apague o dicionário de estados;
// M. Confira se o dicionário está vazio.
// -----

package Exercicios_interface_Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;


public class EstadoPopulacao {
    public static void main(String[] args) {
        System.out.println("A . Crie um dicionário e relacione os estados e suas populações\n");
        Map <String, Integer> estadosPopulacao = new HashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        System.out.println(estadosPopulacao + "\n");

        System.out.println("B. Substitua a população do estado do RN por 3.534.165:\n");
        estadosPopulacao.put("RN", 3534165 );
        System.out.println(estadosPopulacao + "\n");

        System.out.println("C. Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: " + estadosPopulacao.containsKey("PB"));
        estadosPopulacao.put("PB",4039277);
        System.out.println(estadosPopulacao + "\n");

        System.out.println("D. Exiba a população PE: \n");
        System.out.println("O estado PE tem " + estadosPopulacao.get("PE") + " habitantes \n");

        System.out.println("E. Exiba todos os estados e suas populações na ordem que foi informado\n");
        Map <String, Integer> estadosPopulacao2 = new LinkedHashMap<>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};;
        System.out.println(estadosPopulacao2 + "\n");
        
        System.out.println("F. Exiba os estados e suas populações em ordem alfabética: \n");
        Map <String, Integer> estadosPopulacao3 = new TreeMap<>(estadosPopulacao2);
        System.out.println(estadosPopulacao3 +"\n");

        System.out.println("G. Exiba o estado com o menor população e sua quantidade \n");
        // Identifica a menor população:

        Integer menorPopulacao = Collections.min(estadosPopulacao3.values());

        // Para identificar  uma chave correspondente a um value, utilizamos o método entrySet, que retorna um Set e permite
        // fazermos as correspondências desejadas com os métodos getValue e getKey:

        // Criando um Set com entrySet:
        Set <Entry<String, Integer>> entries = estadosPopulacao3.entrySet();
        String estadoMenosPopuloso = "";

        // Identifica a chave que corresponde a menon população:

        for (Entry<String, Integer> entry: entries){
            if (entry.getValue().equals(menorPopulacao))
                estadoMenosPopuloso = entry.getKey();
        }

        System.out.println ("Estado com menor população: " + estadoMenosPopuloso + "\n");


        System.out.println("H. Exiba o estado com o maior população e sua quantidade \n");
        // Identifica a maior população:

        Integer maiorPopulacao = Collections.max(estadosPopulacao3.values());

        // Aproveitando o entrySet criado anteriormente, identifica a chave que corresponde ao maior valor:
        String estadoMaisPopuloso = "";
        for (Entry<String, Integer> entry: entries){
            if (entry.getValue().equals(maiorPopulacao))
                estadoMaisPopuloso = entry.getKey();
        }

        System.out.println ("Estado com maior população: " + estadoMaisPopuloso + "\n");

        System.out.println("I. Exiba a soma da população desses estados \n");
        
        Collection <Integer> populacoes = estadosPopulacao2.values();
        int soma = 0;
        for(Integer populacao: populacoes){
            soma = soma + populacao;
        }
        System.out.println(soma + "\n");
        
        System.out.println("J. Exiba a média da população deste dicionário de estados: \n");
        int mediaPopulacao = soma/populacoes.size();
        System.out.println( mediaPopulacao + "\n");
        
        
        System.out.println("K. Remova os estados com a população menor que 4.000.000: \n");
        Iterator <Integer> iterator1 = estadosPopulacao2.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();

        }
        System.out.println(estadosPopulacao2 + "\n");
        
        System.out.println("L. Apague o dicionário de estados: \n");

        estadosPopulacao2.clear();

        System.out.println("M. Confira se o dicionário está vazio: " + estadosPopulacao2.isEmpty());





        

        


        
        


        

        















        
        


    }

    
}
