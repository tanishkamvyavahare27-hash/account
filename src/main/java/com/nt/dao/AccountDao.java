package com.nt.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Account;

public interface AccountDao extends CrudRepository<Account, Integer> {
	List<Account> findAll();

	List<Account> findByAccType(String acc_type);

	List<Account> findByAddress(String address);

	List<Account> findBystatus(String status);

	@Modifying
	@Transactional
	@Query("SELECT a FROM Account a WHERE (a.bal - a.min_balance) < 500")
	List<Account> findAccountsWithLowEffectiveBalance();

}
