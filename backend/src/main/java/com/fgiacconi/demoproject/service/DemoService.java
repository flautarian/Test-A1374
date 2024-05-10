package com.fgiacconi.demoproject.service;

import com.fgiacconi.demoproject.dto.RequestDto;
import com.fgiacconi.demoproject.dto.ResponseDto;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public ResponseDto calculate1374Result(RequestDto data) {
        int r1 = data.getN() - data.getN() % data.getX() + data.getY();
        return new ResponseDto(r1 > data.getN() ? r1 - data.getX() : r1);
    }
}
