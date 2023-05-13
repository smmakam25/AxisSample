package com.example.lmstrial2.Model;

import com.example.lmstrial2.Enumm.UserRole;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="Users")

public class User {

    @Id

    private Integer id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
}
