package spring.demo.first.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import spring.demo.first.bean.Users;
@Component
public class UserDAOService {
	private static List <Users> user= new ArrayList();
	
	
	public List<Users> findAll(){
		
		return user;
		
	}
	
	public Users findOne(int  id)
	{
		user.add(new Users("Animesh",5));
		user.add(new Users("Shweta",6));
		user.add(new Users("Rashi",7));
		for(int i =0; i < user.size(); i++)
        {
            Users s;
            s = user.get(i);
            if (s.getId()==id)
            
            	return s;
        }
		return new Users("no user",2);
	}

}
