package com.springboot.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootJdbcApplication.class, args);
        AccountDao dao = context.getBean(AccountDao.class);
        /*Account acct = new Account();
        acct.setAccountNum(101);
        acct.setAccountType("Savings");
        acct.setAccountBalance(10000);
        dao.openAccount(acct);*/
        //dao.updateAccount(101, 15000);
        //dao.deleteAccount(101);
        List<Map<String,Object>> accountList=dao.getAllAccounts();
        for (Map accnt : accountList)
        {
        	System.out.println(accnt.get("account_number")+" "+accnt.get("account_type")+" "+accnt.get("account_balance"));
        }
        
        
	}
	
	
	

}
