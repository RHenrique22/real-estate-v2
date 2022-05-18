package br.edu.ifpb.padroes.realstatev2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
public class Bungalow implements Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal price;
    private String address;
    private String builder;

    @Override
    public Bungalow setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Bungalow setBuilder(String builder) {
        this.builder = builder;
        return this;
    }

    @Override
    public Bungalow setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

}
