package com.chat.auth.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UserEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long userId;

        @Column(nullable = false, length = 20)
        private String firstName;

        private String lastName;

        @JsonIgnore
        private String password;


        @Column(nullable = false,unique = true)
        private String email;

        private String phone;


        private String verificationCode;

        private boolean enabled=false;

        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "Roles", joinColumns =  @JoinColumn(name = "userId"))
        private Set<RolesEntity> roles = new HashSet<>();


    }
