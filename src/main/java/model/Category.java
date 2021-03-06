package model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    private Long id;

    private String name;

//    @ManyToOne(cascade= CascadeType.PERSIST)
//    private User user;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
