package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void openAccount(Account acct) {
     String SQL="insert into Account values(?,?,?)";
     jdbcTemplate.update(SQL, acct.getAccountNum(),acct.getAccountType(),acct.getAccountBalance());
     System.out.println("Account Created");
	}

	@Override
	public void updateAccount(int accountNum, int accountBalance) {
      String SQL="update Account set account_balance=? where account_number=?";
      jdbcTemplate.update(SQL, accountBalance,accountNum);
      System.out.println("Account Updated");
	}

	@Override
	public void deleteAccount(int accountNum) {
      String SQL="delete from Account where account_number=?";
      jdbcTemplate.update(SQL,accountNum);
      System.out.println("Account deleted");
	}

	@Override
	public List<Map<String, Object>> getAllAccounts() {
		String SQL="select * from Account";
		return jdbcTemplate.queryForList(SQL);
	}

}
