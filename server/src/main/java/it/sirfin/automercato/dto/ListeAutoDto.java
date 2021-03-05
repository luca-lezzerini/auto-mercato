package it.sirfin.automercato.dto;

import it.sirfin.automercato.model.Automobile;
import java.util.List;

public class ListeAutoDto {

    private List<Automobile> listaAuto;

    public ListeAutoDto() {
    }

    public ListeAutoDto(List<Automobile> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public List<Automobile> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Automobile> listaAuto) {
        this.listaAuto = listaAuto;
    }

    @Override
    public String toString() {
        return "ListeAutoDto{" + "listaAuto=" + listaAuto + '}';
    }
}
