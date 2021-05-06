package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name="expense")
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
}
