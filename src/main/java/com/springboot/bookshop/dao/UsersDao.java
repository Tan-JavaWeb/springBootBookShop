package com.springboot.bookshop.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.bookshop.entity.Users;

@Repository
public class UsersDao {

	@Autowired
	private EntityManager entityManager;
	
	public Users findUserAccount(String userName) {
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("Select u from users u ");
			sql.append("where e.userName = :userName");
			
			Query query = entityManager.createQuery(sql.toString());
			query.setParameter("userName", userName);
			return (Users) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
