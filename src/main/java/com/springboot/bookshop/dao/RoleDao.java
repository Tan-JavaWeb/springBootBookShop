package com.springboot.bookshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDao {
	
	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<String> getRoleNames(Long userId){
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select rl.role.roleName from appRoleUser rl ");
			sql.append("where rl.users.id = :userId ");
			
			
			Query query = entityManager.createQuery(sql.toString());
			query.setParameter("userId", userId);
			
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
