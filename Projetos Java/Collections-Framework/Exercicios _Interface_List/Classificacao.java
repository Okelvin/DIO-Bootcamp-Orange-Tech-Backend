//UtilizANDO listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//1. "Telefonou para a vítima?"
//2. "Esteve no local do crime?"
//3. "Mora perto da vítima?"
//4. "Devia para a vítima?"
//5. "Já trabalhou com a vítima?"

// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "suspeita", entre 3 e 4 
// como "cúmplice" e 5 como "assassina". Caso contrário, ela será classificado como "inocente."

// -----

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Collection;
//import java.util.Iterator;
import java.util.Scanner;
//import java.util.Locale;

public class Classificacao {
    public static void main(String[] args) {
        System.out.println("Por favor, responda 's' ou 'n' às seguintes perguntas:");
        Scanner scanner = new Scanner(System.in);
            String telefone ="";
            while(true){
                System.out.println("Telefonou para a vítima?");
                telefone = scanner.next();
                if (telefone.equals("s") ||telefone.equals("n")){
                    break;
                } else {
                    System.out.println("Responda 's' ou 'n' por favor");   
                }             
            }

            String local = "";
            while (true){
            System.out.println("Esteve no local do crime?");
            local = scanner.next();
            if (local.equals("s") || local.equals("n")){
                break;
            } else {
                System.out.println("Responda 's' ou 'n' por favor");   
            }             
        }

        String moradia = "";
            while (true){
            System.out.println("Mora perto da vítima?");
            moradia = scanner.next();
            if (moradia.equals("s") || moradia.equals("n")){
                break;
            } else {
                System.out.println("Responda 's' ou 'n' por favor");   
            }             
        }

        String divida = "";
            while (true){
            System.out.println("Devia para a vítima?");
            divida = scanner.next();
            if (divida.equals("s") || divida.equals("n")){
                break;
            } else {
                System.out.println("Responda 's' ou 'n' por favor");   
            }             
        }
         
        String trabalho = "";
            while (true){
            System.out.println("Já trabalhou com a vítima?");
            trabalho = scanner.next();
            if (trabalho.equals("s") || trabalho.equals("n")){
                break;
            } else {
                System.out.println("Responda 's' ou 'n' por favor");   
            }             
        }
            // Cria lista com as respostas dadas pelo usuário:
            List <String> respostas = new ArrayList<>(Arrays.asList(telefone,local,moradia,divida,trabalho));

            //Conta quantas respostas positivas foram dadadas:

            int count = Collections.frequency(respostas, "s");

            //Classifica a pessoa:
            switch(count){
                case 0:
                    System.out.println(" Você é Inocente");
                    break;           
                case 1:
                    System.out.println("Você é Inocente");
                    break;     
                case 2:
                    System.out.println("Você é Suspeito");
                    break;
                case 3:
                    System.out.println("Você é Cúmplice");
                    break;
                case 4:
                    System.out.println("Você é Cúmplice");
                    break;
                case 5:
                    System.out.println("Você é Assassino");
                    break;
            }
        }
    }   


