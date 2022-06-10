package library.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="PUBLISHER")
public class Publisher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="ID_PUBLISHER")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name="NAME")
    private String name;
    @Column (name="CHARGE")
    private Boolean charge;

    public Publisher() {
    }

    public Publisher(Long id, String name, Boolean charge) {
        this.id = id;
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlta() {
        return charge;
    }

    public void setAlta(Boolean alta) {
        this.charge = alta;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publisher)) {
            return false;
        }
        Publisher other = (Publisher) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Publisher{" + "id=" + id + ", name=" + name + ", charge=" + charge + '}';
    }

    
    
}
