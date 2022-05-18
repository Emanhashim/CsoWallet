package com.example.May3.Domain;

import io.swagger.annotations.Api;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@EqualsAndHashCode

@Table(name = "reg")
@Api(value = "User Database Structure", description = "The Data base and Data Type")


public class CsoWalletModel implements UserDetails {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String confirmPassword;
    private String username;
    private  String email;
    private String typesOfServices;

    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.USER;
    @Enumerated(EnumType.STRING)
    private Levels levels = Levels.LEVEL_1;
    private Boolean locked = true;
    private Boolean enabled = true;
    private String resetPasswordToken;


//this for getters setters methods also constructors

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setUsername(String username) {
        this.username = username;
    }





    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public String getTypesOfServices() {
        return typesOfServices;
    }

    public void setTypesOfServices(String typesOfServices) {
        this.typesOfServices = typesOfServices;
    }

    //    this for User's signup constructor parameter for signup user
    public CsoWalletModel(String firstName,
                          String lastName,
                          String password,
                          String username,
                            String email
                          ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
        this.email = email;

    }

//this is a defasult constructor for user login
    public CsoWalletModel() {

    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(roles.name());
    return Collections.singletonList(authority);
}

    public Collection<? extends GrantedAuthority> getAuthorities2() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(levels.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }
public String  getConfirmPassword(){
        return confirmPassword;
}

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
