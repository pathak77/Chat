package com.chat.auth.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class authEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

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

    }
