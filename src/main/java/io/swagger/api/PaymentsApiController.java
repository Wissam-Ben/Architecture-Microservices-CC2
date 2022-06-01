package io.swagger.api;

import io.swagger.model.Payment;
import io.swagger.model.PaymentProcess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.PaymentService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-31T12:37:02.602Z[GMT]")
@RestController
public class PaymentsApiController implements PaymentsApi {

    private static  Logger log = LoggerFactory.getLogger(PaymentsApiController.class);

    private  ObjectMapper objectMapper;

    private  HttpServletRequest request;

    /*@org.springframework.beans.factory.annotation.Autowired
    public PaymentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }*/

    private PaymentService paymentService;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentsApiController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public List<Payment> getPayments() {
       return this.paymentService.getPayments();
    }

    public ResponseEntity<Payment> getPaymentById( @PathVariable("paymentId") String paymentId) {
        return new ResponseEntity<>(this.paymentService.getPaymentById(paymentId),HttpStatus.OK);
    }

    public ResponseEntity<Payment> processPayment(@RequestBody Payment body) {
        return new ResponseEntity<>(this.paymentService.createPayment(body),HttpStatus.CREATED);

    }

}
