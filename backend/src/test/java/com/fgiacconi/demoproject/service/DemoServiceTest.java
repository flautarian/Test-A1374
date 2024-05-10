package com.fgiacconi.demoproject.service;

import com.fgiacconi.demoproject.DemoProject1374AApplication;
import com.fgiacconi.demoproject.dto.RequestDto;
import com.fgiacconi.demoproject.dto.ResponseDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class) // Load Spring application context
@SpringBootTest(classes = DemoProject1374AApplication.class) // Load Spring Boot application context
class DemoServiceTest {
    @Autowired
    DemoService demoService;

    List<Integer> xValues = Arrays.asList(7, 5, 10, 17, 499999993, 10, 2);
    List<Integer> yValues = Arrays.asList(5, 0, 5, 8, 9, 5, 0);
    List<Integer> nValues = Arrays.asList(12345, 4, 15, 54321, 1000000000, 187, 999999999);

    // CORRECT VALUES
    List<Integer> answersValues = Arrays.asList(12339, 0, 15, 54306, 999999995, 185, 999999998);

    // INCORRECT VALUES
    List<Integer> answersIncorrectValues = Arrays.asList(12346, -1, 7, 54300, 999999990, 182, 999999990);

    @Test
    void testToCalculateAllCorrectMatchesOfcalculate1374Result() {
        for(int i =0; i < xValues.size(); i++){
            RequestDto request = new RequestDto(xValues.get(i),yValues.get(i),nValues.get(i));
            ResponseDto response = demoService.calculate1374Result(request);
            assertEquals(response.getResponse(), answersValues.get(i));
        }
    }

    @Test
    void testToCalculateAllIncorrectMatchesOfcalculate1374Result() {
        for(int i =0; i < xValues.size(); i++){
            RequestDto request = new RequestDto(xValues.get(i),yValues.get(i),nValues.get(i));
            ResponseDto response = demoService.calculate1374Result(request);
            assertNotEquals(response.getResponse(), answersIncorrectValues.get(i));
        }
    }
}
