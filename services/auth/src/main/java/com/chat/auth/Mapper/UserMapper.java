package com.chat.auth.Mapper;

import com.chat.auth.Entity.RolesEntity;
import com.chat.auth.Entity.UserEntity;
import com.chat.auth.Repository.RoleRepository;
import com.chat.auth.authDto.RoleId;
import com.chat.auth.authDto.UserAuthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    @Autowired
    RoleRepository roleRepo;

    public UserAuthDto DtoMapper(UserEntity entity) {

        Set<RoleId> roleIds = entity.getRoles().stream()
            .map(RolesEntity::getName)
            .collect(Collectors.toSet());

        return UserAuthDto
            .builder().firstName(entity.getFirstName())
            .lastName( (entity.getLastName().isEmpty()?"": entity.getLastName()))
            .authorityList(roleIds)
            .build();
    }

    public UserEntity EntityMapper(UserAuthDto authDto) {
        return UserEntity
                    .builder()
                    .firstName(authDto.getFirstName())
                    .lastName( (authDto.getLastName().isEmpty() ? "" : authDto.getLastName()))
                    .email(authDto.getEmail())
                    .build();
    }

}
