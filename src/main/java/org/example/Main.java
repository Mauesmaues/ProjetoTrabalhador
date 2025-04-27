package org.example;

import ENUMS.Nivel;
import intities.Contratos;
import intities.Departamento;
import intities.Trabalhador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatoDara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento:");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Digite a data de entrada:");
        System.out.println("Digite o nome do trabalhador:");
        String nome = sc.nextLine();
        System.out.println("Digite o nivel:");
        String nivel = sc.nextLine();
        System.out.println("Digite a base salarial:");
        double baseSalarial = sc.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, Nivel.valueOf(nivel), baseSalarial, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos o trabalhador vai ter?");
        int nContratos = sc.nextInt();

        for(int i = 1; i <= nContratos; i++) {
            System.out.println("Contrato #" + i + ":");
            System.out.println("Data de entrada (dd/MM/yyyy):");
            LocalDate date = LocalDate.parse(sc.next(), formatoDara);
            System.out.println("Data valor por hora:");
            double hora = sc.nextDouble();
            System.out.println("Duração do contrato (horas):");
            int duraçãoContrato = sc.nextInt();
            Contratos contrato = new Contratos(date, hora, duraçãoContrato);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        sc.nextLine();
        System.out.println("Entre com mes e ano (MM/YYYY) para saber a renda: ");
        String data= sc.nextLine();
        int mes = Integer.parseInt(data.substring(0,2));
        int ano = Integer.parseInt(data.substring(3));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
        System.out.println("Valor ganho em " + data + ": " + String.format("%.2f", trabalhador.calcularRenda(ano, mes)));

        System.out.println(trabalhador.toString());
    }
}