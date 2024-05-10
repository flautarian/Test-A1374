package com.fgiacconi.demoproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RequestDto {

    @JsonProperty
    @Min(value = 1, message = "X value must be greater than 0")
    @Max(value = 50000, message = "X value must be less than 50000")
    private Integer x = 0;

    @JsonProperty
    @Min(value = 0, message = "Y value must be greater or equal than 0")
    @Max(value = 50000, message = "Y value must be less than 50000")
    private Integer y;

    @JsonProperty
    @Min(value = 1, message = "N value must be greater than 0")
    @Max(value = 50000, message = "N value must be less than 50000")
    private Integer n;
}
