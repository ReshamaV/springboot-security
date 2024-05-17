package service;

import org.springframework.stereotype.Service;

import entity.User;
import model.UserModel;

@Service
public interface UserService {

	User registerUser(UserModel userModel);

}
