package com.chat.auth.authDto;


import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

import java.util.Set;

@Getter
@Setter
@Builder
public class UserAuthDto {
    private long id;
    private String userName;
    private String email;
    private Set<RoleId> authorityList;

}
