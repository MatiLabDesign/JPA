
package library.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table (name="BOOK")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column (name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "ISBN")
    private Long isbn;
    @Column (name = "TITLE")
    private String title;
    @Column (name = "PYEAR")
    private Integer pyear;
    @Column (name = "UNIT")
    private Integer units;
    @Column (name = "UNIT_LENDED")
    private Integer unitsLended;
    @Column (name = "UNIT_LEFT")
    private Integer unitsLeft;
    @Column (name = "CHARGE")
    private Boolean charge;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;

    public Book() {
    }

    public Book(Long id, Long isbn, String title, Integer pyear, Integer units, Integer unitsLended, Integer unitsLeft, Boolean charge, Author author, Publisher publisher) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.pyear = pyear;
        this.units = units;
        this.unitsLended = unitsLended;
        this.unitsLeft = unitsLeft;
        this.charge = charge;
        this.author = author;
        this.publisher = publisher;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPyear() {
        return pyear;
    }

    public void setPyear(Integer pyear) {
        this.pyear = pyear;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getUnitsLended() {
        return unitsLended;
    }

    public void setUnitsLended(Integer unitsLended) {
        this.unitsLended = unitsLended;
    }

    public Integer getUnitsLeft() {
        return unitsLeft;
    }

    public void setUnitsLeft(Integer unitsLeft) {
        this.unitsLeft = unitsLeft;
    }

    public Boolean getCharge() {
        return charge;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
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
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", isbn=" + isbn + ", title=" + title + ", year=" + pyear + ", units=" + units + ", unitsLended=" + unitsLended + ", unitsLeft=" + unitsLeft + ", charge=" + charge + ", author=" + author + ", publisher=" + publisher + '}';
    }

    
    
}
