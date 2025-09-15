package com.chat.user.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false)
    private  String password;
    private String firstName;
    private String lastName;
    private String profilePicture;
    private  Date lastSeenAt;
    private Boolean enabled;
    private  int phoneNumber;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return  String.valueOf(this.phoneNumber);
    }
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

}
