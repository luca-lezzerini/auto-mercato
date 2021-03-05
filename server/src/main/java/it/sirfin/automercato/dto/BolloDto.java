package it.sirfin.automercato.dto;

public class BolloDto {

    private Double importo;

    public BolloDto() {
    }

    public BolloDto(Double importo) {
        this.importo = importo;
    }

    public Double getImporto() {
        return importo;
    }

    public void setImporto(Double importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "BolloDto{" + "importo=" + importo + '}';
    }

}
