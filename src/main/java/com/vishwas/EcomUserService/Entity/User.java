package com.vishwas.EcomUserService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "ECOM_USER")
@Getter
@Setter
public class User extends BaseModel{
     private String name;
     private String password;
     private String emailId;
     private String mobleNo;
     @ManyToMany
     private List<Role> roles;
}
