package com.splab.sql.domain;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @OneToOne
    private UserDetails userDetails;
    @OneToOne
    private ShoppingCart shoppingCart;
    @OneToMany
    private List<Order> orders;



}
