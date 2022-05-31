package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Payment;
import io.swagger.model.PaymentProcess;
import io.swagger.model.Payments;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-31T12:37:02.602Z[GMT]")
@RestController
public class PaymentsApiController implements PaymentsApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Payments> getPayments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payments>(objectMapper.readValue("[ {\n  \"amount\" : \"amount\",\n  \"currency\" : \"currency\",\n  \"orders\" : [ {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  }, {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  } ],\n  \"id\" : \"id\",\n  \"seller_account\" : \"seller_account\",\n  \"buyer\" : {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"id\" : \"id\",\n    \"email\" : \"email\"\n  }\n}, {\n  \"amount\" : \"amount\",\n  \"currency\" : \"currency\",\n  \"orders\" : [ {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  }, {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  } ],\n  \"id\" : \"id\",\n  \"seller_account\" : \"seller_account\",\n  \"buyer\" : {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"id\" : \"id\",\n    \"email\" : \"email\"\n  }\n} ]", Payments.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payments>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payments>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> getPaymentById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentId") String paymentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{\n  \"amount\" : \"amount\",\n  \"currency\" : \"currency\",\n  \"orders\" : [ {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  }, {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  } ],\n  \"id\" : \"id\",\n  \"seller_account\" : \"seller_account\",\n  \"buyer\" : {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"id\" : \"id\",\n    \"email\" : \"email\"\n  }\n}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> processPayment(@Parameter(in = ParameterIn.DEFAULT, description = "Request to initiate a payment process", required=true, schema=@Schema()) @Valid @RequestBody PaymentProcess body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{\n  \"amount\" : \"amount\",\n  \"currency\" : \"currency\",\n  \"orders\" : [ {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  }, {\n    \"product\" : \"product\",\n    \"price\" : \"price\",\n    \"id\" : \"id\"\n  } ],\n  \"id\" : \"id\",\n  \"seller_account\" : \"seller_account\",\n  \"buyer\" : {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"id\" : \"id\",\n    \"email\" : \"email\"\n  }\n}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

}
