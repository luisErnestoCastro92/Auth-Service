package com.authservice.authservice.common.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 576821690486039563L;

    @NotNull
    private String email;
    @NotNull
    private String password;

}
