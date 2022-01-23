package com.bmsti.hrmspayroll.services.feign;

import com.bmsti.hrmspayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-ms-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
