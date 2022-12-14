package com.cydeo.dto;

import com.cydeo.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    private String email;
    @JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
    // this mean I won't see password on postman, which means I can't read it
    private String password;
    private String username;
    private UserRole role;

    @JsonManagedReference  // This field is going to be serialized
    private AccountDTO account;

}
