package com.example.May3.UserSignUp;

import com.example.May3.Domain.Roles;

public class SignUpResponse {

       private String message;
        private String firstName;
        private String lastName;
        private String username;
        private String email;
        private Roles roles;
        private String password;
        private String confirmPassword;
        private String typesOfServices;


        public SignUpResponse(String message) {
            this.message = message;
        }

        public SignUpResponse(String username,
                              Roles roles,
                              String message,
                              String firstName,
                              String lastName,
                              String password,
                              String confirmPassword,
                              String email,
                              String typesOfServices
                           ) {
            this.username = username;
            this.roles = roles;
            this.message = message;
            this.firstName =firstName;
            this.lastName = lastName;
            this.password = password;
            this.confirmPassword = confirmPassword;
            this.email = email;
            this.typesOfServices = typesOfServices;

        }






    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



    public String getUsername() {
            return username;
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
    }



