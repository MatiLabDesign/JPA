
package library.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "AUTHOR")
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name= "ID_AUTHOR")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name="NAME")
    private String name;
    @Column (name="CHARGE")
    private Boolean charge;

    public Author() {
    }

    public Author(Long id, String name, Boolean alta) {
        this.id = id;
        this.name = name;
        this.charge = alta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCharge() {
        return charge;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
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
        if (!(object instanceof Author)) {
            return false;
        }
        Author other = (Author) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", name=" + name + ", charge=" + charge + '}';
    }

    
    
}
