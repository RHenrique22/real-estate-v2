package br.edu.ifpb.padroes.realstatev2.domain;

import java.math.BigDecimal;

public interface Property {
    Property   setAddress(String address);
    Property   setBuilder(String builder);
    Property   setPrice(BigDecimal price);
    BigDecimal getPrice();
}
