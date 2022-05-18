package br.edu.ifpb.padroes.realstatev2.payment;

import br.edu.ifpb.padroes.realstatev2.domain.Apartment;
import br.edu.ifpb.padroes.realstatev2.domain.Bungalow;
import br.edu.ifpb.padroes.realstatev2.domain.Property;
import br.edu.ifpb.padroes.realstatev2.domain.Tenement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PropertiesService {

    private final PaymentService paymentService;
    private final Composite      composite = new Composite();

    public void payProperties() {

        this.composite.add(
                new Apartment().setAddress("Rua x").setBuilder("Apartamento construtura")
                               .setPrice(BigDecimal.valueOf(200000))
                ,
                new Bungalow().setAddress("Rua y").setBuilder("Bangalô construtura")
                              .setPrice(BigDecimal.valueOf(150000))
                ,
                new Tenement().setAddress("Rua y").setBuilder("Cortiço construtura")
                              .setPrice(BigDecimal.valueOf(100000))
        );

        for (Property property: this.composite.getProperties()) {
            paymentService.pay(property);
        }
    }

}
