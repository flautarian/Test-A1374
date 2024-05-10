package com.fgiacconi.demoproject.controller;

import com.fgiacconi.demoproject.dto.RequestDto;
import com.fgiacconi.demoproject.dto.ResponseDto;
import com.fgiacconi.demoproject.service.DemoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Demo controller", description = "Controller of the 1374A functionality")
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    @Operation( summary = "GET operation to calculate https://codeforces.com/problemset/problem/1374/A logic",
            description = "find  the maximum integer k such that (0 ≤ k ≤ n) that (k mod x) =y")
    @GetMapping("/calculatetest")
    public ResponseEntity<ResponseDto> getCalculateTestResult(
            @RequestParam
            @Min(value = 1, message = "X value must be greater than 0")
            @Max(value = 50000, message = "X value must be less than 50000")
            Integer x,
            @RequestParam
            @Min(value = 0, message = "Y value must be greater or equal than 0")
            @Max(value = 50000, message = "Y value must be less than 50000")
            Integer y,
            @Min(value = 1, message = "N value must be greater than 0")
            @Max(value = 50000, message = "N value must be less than 50000")
            @RequestParam Integer n) {
        return ResponseEntity.ok(demoService.calculate1374Result(new RequestDto(x, y, n)));
    }

    @Operation( summary = "POST operation to calculate https://codeforces.com/problemset/problem/1374/A logic",
            description = "find  the maximum integer k such that (0 ≤ k ≤ n) that (k mod x) =y")
    @PostMapping("/calculatetest")
    public ResponseEntity<ResponseDto> postCalculateTestResult(@Valid @RequestBody RequestDto data) {
        return ResponseEntity.ok(demoService.calculate1374Result(data));
    }
}
