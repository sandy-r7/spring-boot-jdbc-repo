package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

public interface AccountDao {
     public void openAccount(Account accnt);
     public void updateAccount(int accountNum, int accountBalance);
     public void deleteAccount(int accountNum);
     public List<Map<String, Object>> getAllAccounts();
     
     
}
