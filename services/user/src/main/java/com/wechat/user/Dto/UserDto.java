package com.chat.user.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Object authorityList;
}
