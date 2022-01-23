package com.bmsti.hrmspayroll.services;

import com.bmsti.hrmspayroll.entities.Payment;
import com.bmsti.hrmspayroll.entities.Worker;
import com.bmsti.hrmspayroll.services.feign.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    private WorkerFeignClient workerFeignClient;

    @Autowired
    public PaymentService(WorkerFeignClient workerFeignClient) {
        this.workerFeignClient = workerFeignClient;
    }

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
