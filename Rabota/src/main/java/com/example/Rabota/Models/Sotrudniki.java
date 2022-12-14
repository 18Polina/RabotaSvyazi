package com.example.Rabota.Models;

import javax.persistence.*;

@Entity
@Table(name = "sotr")
public class Sotrudniki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Sotrudniki(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Sotrudniki() {
    }
}
