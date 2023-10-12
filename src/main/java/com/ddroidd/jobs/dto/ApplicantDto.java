package com.ddroidd.jobs.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ApplicantDto {

    @NotNull(message = "First name is required")
    private String firstName;

    @NotNull(message = "Last name is required")
    private String lastName;

    @NotNull(message = "Email address is required")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Invalid email address")
    private String emailAddress;

    @NotNull(message = "Phone is required")
    @Pattern(regexp = "^\\d{4}-\\d{3}-\\d{3}$", message = "Invalid phone number format. Use format: xxxx-xxx-xxx")
    private String phone;

    @NotNull
    private AddressDto address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
