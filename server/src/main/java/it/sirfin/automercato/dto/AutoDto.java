package it.sirfin.automercato.dto;

import it.sirfin.automercato.model.Automobile;

public class AutoDto {

    private Automobile automobile;

    public AutoDto() {
    }

    public AutoDto(Automobile automobile) {
        this.automobile = automobile;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    @Override
    public String toString() {
        return "AutoDto{" + "automobile=" + automobile + '}';
    }
}
