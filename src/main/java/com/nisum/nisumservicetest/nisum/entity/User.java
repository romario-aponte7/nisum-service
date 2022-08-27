package com.nisum.nisumservicetest.nisum.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    private Date created;
    private Date modified;
    private Date lastLogin;
    private String token;
    private Boolean active;


    @OneToMany(mappedBy = "user")
    private Collection<Phone> phones;
}
