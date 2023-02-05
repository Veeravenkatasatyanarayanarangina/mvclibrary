package com.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.library.beans.Book;


public class BookDao {
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	} 
	public int saveBook(Book book)
	{
		String sql = "insert into book(book_name,book_price,book_author,publisher,year) values"
				+ "('"+book.getBook_name()+"',"+book.getBook_price()+",'"+book.getBook_auther()+"','"
				+book.getPublisher()+"','"+book.getYear()+"')";
		return template.update(sql);
	}
	public int update(Book book){  
	    String sql="update Book set book_name='"+book.getBook_name()+"',book_price="+book.getBook_price()+",book_author='"+book.getBook_auther()+"',publisher='"+book.getPublisher()+"',year='"+book.getYear()+"' where id="+book.getBkid()+"";  
	    return template.update(sql);  
	}
	public int delete(int id){  
	    String sql="delete from Book where bkid="+id+"";  
	    return template.update(sql);  
	}  
	
	public List<Book> getBooks()
	{
		return template.query("select * from Book",new RowMapper<Book>(){
			public Book mapRow(ResultSet rs,int row) throws SQLException{
				Book book = new Book();
				book.setBkid(rs.getInt(1));
				book.setBook_name(rs.getString(2));
				book.setBook_price(rs.getFloat(3));
				book.setBook_auther(rs.getString(4));
				book.setPublisher(rs.getString(5));
				book.setYear(rs.getString(6));
				return book;
			}
			
		});
	}
	
	public Book getByBookId(int id)
	{
		 String sql="select * from Book where bkid=?";  
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));  

	}
	
	

}

