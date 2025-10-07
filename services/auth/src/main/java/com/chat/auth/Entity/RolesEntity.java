package com.chat.auth.Entity;

import com.chat.auth.authDto.RoleId;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roles")
public class RolesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private RoleId name;

    @ManyToMany(fetch = FetchType.EAGER)
     private Set<UserEntity> users = new HashSet<>();;
}
