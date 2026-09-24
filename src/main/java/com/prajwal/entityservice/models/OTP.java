package com.prajwal.entityservice.models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OTP extends BaseModel {
    private String code;
    private String sentToNumber;

    public OTP generateOTP(String phoneNumber) {
        Random random = new Random();
        int code = random.nextInt(9000) + 1000;
        return OTP.builder()
                .code(Integer.toString(code))
                .sentToNumber(phoneNumber).build();
    }

}
