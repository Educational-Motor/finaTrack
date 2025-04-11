// package com.finatrack.financeTracker.models;

// import jakarta.persistence.*;
// import java.math.BigDecimal;
// import java.time.LocalDateTime;

// @Entity
// @Table(name="transactions")
// public class Transaction {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "user_id", nullabe = false) // FK to user table
//     private User user;

//     @Column(nullable = false)
//     private BigDecimal amount;

//     @Column (nullable = false, length = 10)
//     private String currency;

//     @ManyToOne
//     @JoinColumn(name = "category_id", nullable = true) // Optional category
//     private Category category;

//     @Column(nullable = false)
//     private LocalDateTime timestamp;

//     @Column(length = 255)
//     private String description;

//     // Constructors
//     public Transaction() {}

//     public Transaction (User user, BigDecimal amount, String currency, TransactionType type, Category category, String description) {
//         this.user = user;
//         this.amount = amount;
//         this.currecy = currency;
//         this.category = category;
//         this.timestamp = LocalDateTime.now();
//         this.description = descrioption;
//     }

//     // G n S
//     public long getId() {return id;}
//     public void setId(Long id) {this.id = id;}

//     public User getUser() {return user;}
//     public void setUser(User user) {this.user = user;}

//     public BigDecimal getAmount() {return amount;}
//     public void setAmount(BigDecimal amount) {this.amount = amount;}

//     public String getCurrency() {return currency;}
//     public void setCurrency(String currency) {this.currency = currency;}

//     public LocalDateTime getTimestamp() {return timestamp;}
//     public void setTimestamp(LocalDateTime timestamp) {this.timestamp = timestamp;}

//     public String getDescription() {return description;}
//     public void setDescription(String description) {this.description = description;}
// }