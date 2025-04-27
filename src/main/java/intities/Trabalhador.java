package intities;

import ENUMS.Nivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private Nivel nivel;
    private double salarioBase;

    private Departamento departamento;
    private List<Contratos> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, Nivel nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void adicionarContrato(Contratos contrato) {
        this.contratos.add(contrato);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void removerContrato(Contratos contrato){
        this.contratos.remove(contrato);
    }

    public double calcularRenda(int ano, int mes){
        double soma = salarioBase;
        soma += this.contratos.stream()
                .filter(c -> {
                    LocalDate data = c.getDataInicio();
                    int tempAno = data.getYear();
                    int tempMes = data.getMonthValue();
                    System.out.println("Ano: " + tempAno + ", Mês: " + tempMes);
                    System.out.println("Ano: " + ano + ", Mes: " + mes);
                    return  tempAno == ano && tempMes == mes ;
                })
                .map(c -> {
                    double valor = c.valorTotal();
                    System.out.println("Valor do contrato: " + valor);
                    return valor;
                })
                .reduce(0.0, (a, b) -> {
                    System.out.println("Somando: " + a + " + " + b);
                    return a + b;
                });

        return soma;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "contratos=" + contratos +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", salarioBase=" + salarioBase +
                ", departamento=" + departamento +
                '}';
    }
}

