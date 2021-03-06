package com.javarush.test.level36.lesson04.big01.model;
import com.javarush.test.level36.lesson04.big01.bean.User;
import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model
{
    ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData()
    {
        return modelData;
    }
    @Override
    public void loadUsers()
    {
        List<User> users = new ArrayList<>();
        users.add(new User("A",1,1));
        users.add(new User("B",2,1));
        modelData.setUsers(users);
    }
    @Override
    public void loadDeletedUsers() throws UnsupportedOperationException
    {
        List<User> users = new ArrayList<>();
        users.add(new User("C",3,1));
        users.add(new User("D",4,2));
        modelData.setUsers(users);
    }
}