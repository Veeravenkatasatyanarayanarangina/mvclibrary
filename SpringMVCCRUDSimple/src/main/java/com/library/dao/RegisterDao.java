package com.library.dao;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.library.beans.Register;

public class RegisterDao {
	

	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public int saveRegister(Register register)
	{
		String sql = "INSERT INTO register (username,password,email, phone) VALUES ('"+register.getUsername()+"','"+register.getPassword()+"','"+register.getEmail()+"','"+register.getPhone()+"')";

		return template.update(sql);
	}
	
	public Register registerLogin(Register register)
	{
		String sql = "select * from register where email = '"+register.getEmail()+"'and password ='"+register.getPassword()+"'";
//		Register responseregister =(Register) template.execute(sql);
		return template.queryForObject(sql, new BeanPropertyRowMapper<Register>(Register.class));
	}
	
	
	

}
