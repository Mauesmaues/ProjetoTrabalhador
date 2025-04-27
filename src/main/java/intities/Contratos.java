package intities;

import java.time.Duration;
import java.time.LocalDate;

public class Contratos {
    public LocalDate dataInicio;
    public double valorHora;
    public Integer horas;

    public Contratos() {}

    public Contratos(LocalDate dataInicio, double valorHora, Integer horas) {
        this.dataInicio = dataInicio;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return valorHora * horas;
    }
}
