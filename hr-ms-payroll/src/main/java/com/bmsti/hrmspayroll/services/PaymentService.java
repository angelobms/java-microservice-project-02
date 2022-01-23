package com.bmsti.hrmspayroll.services;

import com.bmsti.hrmspayroll.entities.Payment;
import com.bmsti.hrmspayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-ms-payroll.host}")
    private String workerHost;

    private RestTemplate restTemplate;

    @Autowired
    public PaymentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment getPayment(long workerId, int days) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
