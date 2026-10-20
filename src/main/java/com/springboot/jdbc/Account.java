package com.springboot.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
    private int accountNum;
    private String accountType;
    private int accountBalance;
}
