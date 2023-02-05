package com.library.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.beans.Book;

import com.library.beans.Register;
import com.library.dao.BookDao;

import com.library.dao.RegisterDao;  
@Controller  
public class HomeController1 {  
    
	@Autowired
	RegisterDao registerDao;
	
	@Autowired
	BookDao bookdao;
   
    
    //===============================================================================
    
    
    @RequestMapping("/")
    public String home(Model m)
    {
    	return "index";
    }
    @RequestMapping("/registerform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Register());
    	return "registerform"; 
    } 
    @RequestMapping("/userlogin")
    public String userloginpage(Model m) {
    	return "userlogin";
    
    }
    
    @RequestMapping("/addbook")
    public String addBookPage(Model m)
    {
    	return "addbook";
    }
    @RequestMapping("viewbooks")
    public String viewBooksPage(Model model)
    {
    	List<Book> list = bookdao.getBooks();
    	 model.addAttribute("list",list);
    	return "viewbooks";
    }
    
    @RequestMapping(value="/saveRegister",method = RequestMethod.POST)
	public String saveRegister(@ModelAttribute Register register)
	{
		registerDao.saveRegister(register);
		return "userlogin";
	}
    @RequestMapping(value="/userlogin",method =RequestMethod.POST)
    public String userLogin(@ModelAttribute Register register)
    {
    	Register response=registerDao.registerLogin(register);
    	System.out.print(response.getEmail());
    	if(response!=null)
    	{
    		if(response.getEmail().equalsIgnoreCase(register.getEmail())&&response.getPassword().equals(register.getPassword()))
    		{
    			return "redirect:/viewbooks";
    		}
    		else
    		{
    			return("userlogin");
    		}
    	}
    	return "registerform";
    }
    
    @RequestMapping(value = "/bookRegister", method = RequestMethod.POST)
    public String addingBook(@ModelAttribute Book book)
    {
    	int k = bookdao.saveBook(book);
    	if(k==1)
    	{
    		return "redirect:/viewbooks";
    	}
    	else
    	{
    		return "addbook";
    	}
    }
    
    @RequestMapping(value = "/deletebook/{bkid}")
    public String deleteBook(@PathVariable int bkid, Model m)
    {
    	bookdao.delete(bkid);
    	return "redirect:/viewbooks";
    	
    }
    @RequestMapping(value = "/updatebook/{bkid}")
    public String updateBook(@PathVariable int bkid, Model m)
    {
    	Book book=bookdao.getByBookId(bkid);
    	 m.addAttribute("command",book);
    	return "updatebook";
    	
    }
    @RequestMapping(value = "/updatebook", method = RequestMethod.POST)
    public String updateBooks(@ModelAttribute Book book)
    {
    	bookdao.update(book);
    	return "redirect:/viewbooks";
    	
    }
}  