package com.bits.wilp.RestService1.Controller;

import com.bits.wilp.RestService1.APIRequestBody;
import com.bits.wilp.RestService1.APIResponse;
import com.opencsv.CSVWriter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Map;


@RestController
@RequestMapping("/api/service-2/performance-test")
public class Controller {
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public APIResponse getMappingRequest() {
        APIResponse response = new APIResponse();
        response.setError("");
        response.setStatus("Success");
        response.setResult("");
        return response;
    }

    @PostMapping
    public APIResponse postMappingRequest(@RequestBody Map<String, Object> apiRequestBody) throws InterruptedException {
        APIResponse response = new APIResponse();
        response.setError("");
        response.setStatus("Success");
        response.setResult(apiRequestBody.toString());
        return response;
    }
}
