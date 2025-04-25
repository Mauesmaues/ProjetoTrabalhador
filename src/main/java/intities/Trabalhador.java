package intities;

import ENUMS.Nivel;

import java.time.LocalDate;
import java.util.List;

public class Trabalhador {
    public Departamento departamento;
    public LocalDate entrada;
    public String nome;
    public Nivel nivel;
    public float salarioBase;
    public List<Contratos> contratos;

    public Trabalhador() {
    }

    public Trabalhador(Departamento departamento, LocalDate entrada, String nome, Nivel nivel, float salarioBase, List<Contratos> contratos) {
        this.departamento = departamento;
        this.entrada = entrada;
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.contratos = contratos;
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

    public void setContratos(List<Contratos> contratos) {
        this.contratos = contratos;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarContrato(Contratos contratos){
        this.contratos.add(contratos);
    }

    public void removerContrato(Contratos contratos){
        this.contratos.remove(contratos);
    }


}

