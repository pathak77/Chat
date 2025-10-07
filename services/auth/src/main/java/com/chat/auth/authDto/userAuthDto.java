package com.chat.auth.authDto;


import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Builder
public class userAuthDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Object authorityList;

}
