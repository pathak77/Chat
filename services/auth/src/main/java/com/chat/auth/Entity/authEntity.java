package com.chat.auth.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class authEntity {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

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
