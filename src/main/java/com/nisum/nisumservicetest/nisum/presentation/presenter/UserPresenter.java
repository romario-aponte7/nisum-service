package com.nisum.nisumservicetest.nisum.presentation.presenter;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPresenter {
    private UUID id;
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private Date created;
    private Date modified;
    private Date lastLogin;
    private String token;
    private Boolean isActive;
    private Set<PhonePresenter> phonePresenters;
}
