package com.nt.ctrl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dao.AccountDao;
import com.nt.entity.Account;
import com.nt.service.AccountService;

@RestController
public class HomeController {

	@Autowired
	private AccountService service;

	@PostMapping("/add")
	public String add(@RequestBody Account a) {
		service.add(a);
		return "added";
	}

	@PostMapping("/update")
	public String update(@RequestBody Account a) {
		service.update(a);
		return "added1";
	}

	@GetMapping("/account/delete/id/{id}")
	public String deleteRecordById(@PathVariable int id) {
		service.deleteRecordById(id);
		return "deleted";
	}

	@GetMapping("/account/id/{id}")
	public Account findById(@PathVariable int id) {
		Account a = service.getById(id);
		return a;
	}

	@GetMapping("/all-records")
	public List<Account> getAllRecords() {
		List<Account> list = service.getAllRecords();
		return list;
	}
	
	@GetMapping("/account/acc_type/{acc_type}")
	public List<Account> selectByType(@PathVariable String acc_type) {
		List<Account> a = service.selectByType(acc_type);
		return a;
	}
	
	@GetMapping("/account/address/{address}")
	public List<Account> selectByArea(@PathVariable String address) {
		List<Account> a = service.selectByArea(address);
		return a;
	}
	
	@GetMapping("/account/Status/inactive")
	public List<Account> selectByStatus(String status) {
		List<Account> a = service.selectByStatus(status);
		return a;
	}
	
	 @GetMapping("/minusBalance")
	    public  List<Account> showLowBalanceAccounts() {
	        List<Account> lowBalanceAccounts = service.getLowBalanceAccounts();
	        return lowBalanceAccounts;
	    }
}