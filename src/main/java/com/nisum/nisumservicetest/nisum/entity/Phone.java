package com.nisum.nisumservicetest.nisum.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "phones")
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Builder
@AllArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String number;

    private String cityCode;

    private String countryCode;

    @ManyToOne
    @NotNull
    private User user;
}
