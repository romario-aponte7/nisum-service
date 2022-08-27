package com.nisum.nisumservicetest.nisum.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "default_configurations")
@EqualsAndHashCode(of = "default_configuration_id")
@ToString(of = "default_configuration_id")
@Builder
@AllArgsConstructor
public class DefaultConfiguration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID defaultConfigurationId;

    @NotNull
    @Column(unique = true)
    private String name;

    @NotNull
    private String value;
}
