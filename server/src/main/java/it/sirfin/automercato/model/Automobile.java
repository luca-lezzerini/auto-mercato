package it.sirfin.automercato.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Automobile implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String targa;
    @Column
    private String modello;
    @Column
    private Integer cilindrata;

    public Automobile() {
    }

    public Automobile(String targa, String modello, Integer cilindrata) {
        this.targa = targa;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Automobile{" + "id=" + id + ", targa=" + targa + ", modello=" + modello + ", cilindrata=" + cilindrata + '}';
    }
    
    
}
