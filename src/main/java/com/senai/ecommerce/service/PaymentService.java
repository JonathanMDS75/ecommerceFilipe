package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.PaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private com.senai.ecommerce.repository.PaymentRepository paymentRepository;

    @Transactional(readOnly = true)
    public List<PaymentDTO> findAll() {
        return paymentRepository.findAll().stream().map(payment
                -> new PaymentDTO(payment.getId(), payment.getMoment())).toList();
    }
}
