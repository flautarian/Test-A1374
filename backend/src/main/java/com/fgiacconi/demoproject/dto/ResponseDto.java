package com.fgiacconi.demoproject.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto {

    @NonNull
    @JsonProperty
    Integer response;
}
