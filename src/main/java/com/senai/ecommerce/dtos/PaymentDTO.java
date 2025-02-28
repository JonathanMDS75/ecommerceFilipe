package com.senai.ecommerce.dtos;

import lombok.Data;
import java.time.Instant;

@Data
public class PaymentDTO {
    private Long id;
    private Instant moment;

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }
}
