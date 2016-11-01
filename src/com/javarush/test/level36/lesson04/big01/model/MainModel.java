package com.javarush.test.level36.lesson04.big01.model;

import com.javarush.test.level36.lesson04.big01.bean.User;
import com.javarush.test.level36.lesson04.big01.model.service.UserService;
import com.javarush.test.level36.lesson04.big01.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model
{
    ModelData modelData = new ModelData();
    UserService userService = new UserServiceImpl();
    @Override
    public ModelData getModelData()
    {
        return modelData;
    }
    @Override
    public void loadUsers()
    {
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }
    public void loadDeletedUsers()
    {
        modelData.setUsers(userService.getAllDeletedUsers());
    }
}
