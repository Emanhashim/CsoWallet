package com.example.May3.UserSignUp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@ApiModel
public class SignUpRequest {

    @ApiModelProperty(value= "This is users first name ")
    @NotBlank
    @Size(min = 4, message = "Name must be at least 4 characters")
    private String firstName;

    @ApiModelProperty(value= "This is users father name ")
    @NotBlank
    @Size(min = 4, message = "Name must be at least 4 characters")
    private String lastName;

    @ApiModelProperty(value= "This is users Password ")
    @NotBlank
    @Size(min = 6, message = "Password should be atlease 6 characters")
    private String password;

    @ApiModelProperty(value= "This is users Phone Number ")
    @NotBlank
    @Size(min = 4)
    private String username;

    @ApiModelProperty(value= "This is Users Email ")
    @NotBlank(message = "Enter your email")
    @Column(unique = true)
    @Email
    private String email;


    @NotBlank
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String confirmPassword;
    @NotBlank
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String typesOfServices;

    @ApiModelProperty(value= "This is Users Country ")


//    below  we generate getters and setters  for each data field's










    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTypesOfServices() {
        return typesOfServices;
    }

    public void setTypesOfServices(String typesOfServices) {
        this.typesOfServices = typesOfServices;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }




//    below override the toString method's

    @Override
    public String toString() {
        return "SignUpRequest [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
                + ",  username=" + username + ", confirmPassword=" + confirmPassword + "]";
    }
}
