package com.nisum.nisumservicetest.nisum.presentation.presenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhonePresenter {

    private UUID id;
    private String number;
    private String cityCode;
    private String countryCode;
    private UUID userId;
}
