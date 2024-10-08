package com.example.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.banking.model.Account;
import com.example.banking.model.AccountType;
import com.example.banking.model.User;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByAccountNumber(String accountNumber);
	
	List<Account> findByUser(User user); 
	
	Account findByUserIdAndAccountType(Long userId, AccountType accountType);
}
