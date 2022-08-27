package com.nisum.nisumservicetest.nisum.service;


import com.nisum.nisumservicetest.nisum.presentation.presenter.UserPresenter;

import java.util.UUID;

public interface UserService {

    UserPresenter getUserById(UUID userId);

    UserPresenter saveUpdateUser(UserPresenter userPresenter);

    void deleteUserById(UUID userId);
}
