package yongs.temp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yongs.temp.db.mapper.UserMapper;
import yongs.temp.vo.User;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);	

    @Autowired
    UserMapper mapper;
    
    public List<User> getUsers() throws Exception {
    	logger.debug("yongs-user|UserService|getUsers()");
        return mapper.getUsers();
    }
}