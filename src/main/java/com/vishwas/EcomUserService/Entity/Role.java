package com.vishwas.EcomUserService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity(name = "ECOM_ROLE")
public class Role {
    private String roleName;
    private String description;
    @ManyToMany
    private List<User> users;
}
