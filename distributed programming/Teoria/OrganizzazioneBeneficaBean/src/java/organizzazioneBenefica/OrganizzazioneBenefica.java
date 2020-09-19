package organizzazioneBenefica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import static organizzazioneBenefica.OrganizzazioneBenefica.TROVA_TUTTI;
import static organizzazioneBenefica.OrganizzazioneBenefica.TROVA_PER_PROGETTI;
import static organizzazioneBenefica.OrganizzazioneBenefica.TROVA_PER_ID;
import static organizzazioneBenefica.OrganizzazioneBenefica.TROVA_PER_BILANCIO;
import static organizzazioneBenefica.OrganizzazioneBenefica.TROVA_PER_TRASPARENZA;

@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_TUTTI, query = "SELECT o FROM OrganizzazioneBenefica o"),
    @NamedQuery(name = TROVA_PER_PROGETTI, query = "SELECT o FROM OrganizzazioneBenefica o WHERE o.progetti = :progetti"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT o FROM OrganizzazioneBenefica o WHERE o.id = ?1"),
    @NamedQuery(name = TROVA_PER_BILANCIO, query = "SELECT o FROM OrganizzazioneBenefica o WHERE o.bilancio > 50000000.00F"),
    @NamedQuery(name = TROVA_PER_TRASPARENZA, query = "SELECT o FROM OrganizzazioneBenefica o WHERE o.percentualeTrasparenza = 100"),
})
@XmlRootElement
public class OrganizzazioneBenefica implements Serializable{
    public static final String TROVA_TUTTI = "OrganizzazioneBenefica.trovaTutti";
    public static final String TROVA_PER_PROGETTI = "OrganizzazioneBenefica.trovaPerProgetti";
    public static final String TROVA_PER_ID = "OrganizzazioneBenefica.trovaPerId";
    public static final String TROVA_PER_BILANCIO = "OrganizzazioneBenefica.trovaPerBilancio";
    public static final String TROVA_PER_TRASPARENZA = "OrganizzazioneBenefica.trovaPerTrasparenza";
    
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String sede;
    private Integer progetti;
    private Integer numeroPaesiCoperti;
    private Integer numeroDonatori;
    private Float bilancio;
    private Integer percentualeTrasparenza;

    public OrganizzazioneBenefica() {
    }

    public OrganizzazioneBenefica(String nome, String sede, Integer progetti, Integer numeroPaesiCoperti, Integer numeroDonatori, Float bilancio, Integer percentualeTrasparenza) {
        this.nome = nome;
        this.sede = sede;
        this.progetti = progetti;
        this.numeroPaesiCoperti = numeroPaesiCoperti;
        this.numeroDonatori = numeroDonatori;
        this.bilancio = bilancio;
        this.percentualeTrasparenza = percentualeTrasparenza;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Integer getProgetti() {
        return progetti;
    }

    public void setProgetti(Integer progetti) {
        this.progetti = progetti;
    }

    public Integer getNumeroPaesiCoperti() {
        return numeroPaesiCoperti;
    }

    public void setNumeroPaesiCoperti(Integer numeroPaesiCoperti) {
        this.numeroPaesiCoperti = numeroPaesiCoperti;
    }

    public Integer getNumeroDonatori() {
        return numeroDonatori;
    }

    public void setNumeroDonatori(Integer numeroDonatori) {
        this.numeroDonatori = numeroDonatori;
    }

    public Float getBilancio() {
        return bilancio;
    }

    public void setBilancio(Float bilancio) {
        this.bilancio = bilancio;
    }

    public Integer getPercentualeTrasparenza() {
        return percentualeTrasparenza;
    }

    public void setPercentualeTrasparenza(Integer percentualeTrasparenza) {
        this.percentualeTrasparenza = percentualeTrasparenza;
    }

    @Override
    public String toString() {
        return "OrganizzazioneBenefica{" + "id=" + id + ", nome=" + nome + ", sede=" + sede + ", progetti=" + progetti + ", numeroPaesiCoperti=" + numeroPaesiCoperti + ", numeroDonatori=" + numeroDonatori + ", bilancio=" + bilancio + ", percentualeTrasparenza=" + percentualeTrasparenza + '}';
    }
    
    
    
    
    
}
