package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "expense")
public class Expense {

    @Id
    private Long id;

    private Instant expensedate;
    private String descript;
    private double price;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;


    public Expense() {
    }

    public Expense(Long id, Instant expensedate, String descript, double price, User user, Category category) {
        this.id = id;
        this.expensedate = expensedate;
        this.descript = descript;
        this.price = price;
        this.user = user;
        this.category = category;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setExpensedate(Instant expensedate) {
        this.expensedate = expensedate;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    //Getters

    public Long getId() {
        return id;
    }

    public Instant getExpensedate() {
        return expensedate;
    }

    public String getDescript() {
        return descript;
    }

    public double getPrice() {
        return price;
    }

    public User getUser() {
        return user;
    }

    public Category getCategory() {
        return category;
    }
}
