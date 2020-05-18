package com.lan.dao;

import com.lan.entity.Account;

import java.util.List;

/**
 * @author xuminghao
 */
public interface AccountDao {
    List<Account> findAll();
}
