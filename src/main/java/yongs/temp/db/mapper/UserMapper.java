package yongs.temp.db.mapper;

import java.util.List;

import yongs.temp.vo.User;

public interface UserMapper {
	public List<User> getUsers() throws Exception;
}