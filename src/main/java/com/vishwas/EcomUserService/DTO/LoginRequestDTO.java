package com.vishwas.EcomUserService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDTO {
    private String emailId;
    private String password;
}
