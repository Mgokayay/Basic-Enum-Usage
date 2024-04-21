package com.example.demo.entity;

import com.example.demo.enums.Gender;
import com.example.demo.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_account",schema = "enum")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.ORDINAL)
    private Status status;
}
