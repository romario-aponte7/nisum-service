package com.nisum.nisumservicetest.nisum.enums;

public enum DefaultConfigurationNames {
    DEFAULT_EMAIL_REGULAR_EXPRESSION("DEFAULT_EMAIL_REGULAR_EXPRESSION"),
    DEFAULT_PASSWORD_REGULAR_EXPRESSION("DEFAULT_PASSWORD_REGULAR_EXPRESSION");

    private String value;

    DefaultConfigurationNames(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
