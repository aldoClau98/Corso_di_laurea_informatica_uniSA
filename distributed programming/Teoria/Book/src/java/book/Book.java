/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import static book.Book.FIND_ALL;
import static book.Book.FIND_BYID;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author ALDO
 */
@Entity
@NamedQueries({
    @NamedQuery(name =FIND_ALL, query ="SELECT b FROM Book b"),
    @NamedQuery(name = FIND_BYID, query="SELECT b FROM Book b WHERE b.id=?1")
})
@XmlRootElement
public class Book implements Serializable{
     
    
    public static final String  FIND_ALL = "Book.find_all";
    public static final String FIND_BYID="Book.find_id";
            
    @Id
    private String id;
    private String title,author;
    float price;

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }

    public Book() {
    }

    public Book(String id, String title, String author, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
