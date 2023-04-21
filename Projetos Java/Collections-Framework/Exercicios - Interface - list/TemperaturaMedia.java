// Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
// Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média 
// e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
// ----

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collection;
import java.util.Iterator;

public class TemperaturaMedia {
    public static void main(String[] args) {
        
        // Cria a lista com as temperaturas médias mensais:
        System.out.println("Temperaturas médias mensais:");
        List <Double> temperaturas = new ArrayList<>();
        temperaturas.add(35d);
        temperaturas.add(37d);
        temperaturas.add(36d);
        temperaturas.add(34d);
        temperaturas.add(32d);
        temperaturas.add(30d);
        System.out.println(temperaturas.toString());

        // Cria lista com os meses do ano
        List <String> meses = new ArrayList<>(Arrays.asList("Janeiro","Fevereiro",
        "Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Novembro","Dezembro"));
       
        // Calcula a temperatura média semestral:
        Iterator <Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
          Double next = iterator.next();
          soma += next;  
        }
        double temperaturaMedia = (soma/temperaturas.size());
        System.out.println("A temperatura média semestral é de " + temperaturaMedia + " ºC");
        System.out.println("Temperaturas acima da média semestral: ");
        for(Double temperatura:temperaturas){
            if (temperatura > temperaturaMedia){        
            System.out.println(temperatura + " - " + meses.get(temperaturas.indexOf(temperatura)));
            } 
        }
    }
}

