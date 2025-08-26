package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dao.AccountDao;
import com.nt.entity.Account;

@Component
public class AccountService {
	@Autowired
	private AccountDao dao;

	public void add(Account a) {
		dao.save(a);
	}

	public void update(Account a) {
		dao.save(a);
	}

	public void deleteRecordById(int id) {
		dao.deleteById(id);
	}

	public Account getById(int id) {
		Optional<Account> opt = dao.findById(id);
		return opt.get();
	}

	public List<Account> getAllRecords() {
		List<Account> list = dao.findAll();
		return list;
	}

	public List<Account> selectByType(String acc_type) {
		List<Account> list= dao.findByAccType(acc_type);
		return list;
	}

	public List<Account> selectByArea(String address) {
		List<Account> list= dao.findByAddress(address);
		return list;
	}

	public List<Account> selectByStatus(String status) {
		List<Account> list= dao.findBystatus("inactive");
		return list;
	}
	public List<Account> getLowBalanceAccounts() {
	    return dao.findAccountsWithLowEffectiveBalance();
	}


}
