package yongs.temp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.db.vo.User;
import yongs.temp.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);	

    @Autowired
    UserService service;
    
    @GetMapping("")
    public List<User> getUsers() throws Exception{
    	logger.debug("yongs-user|UserController|getUsers()");
        return service.getUsers();
    }
}