package com.javarush.test.level36.lesson04.big01.controller;

import com.javarush.test.level36.lesson04.big01.model.Model;
import com.javarush.test.level36.lesson04.big01.view.UsersView;
import com.javarush.test.level36.lesson04.big01.view.View;

public class Controller
{
    public Model model;
    public View usersView;
    public void setModel(Model model)
    {
        this.model = model;
    }
    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }
    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }
    public void setUsersView(UsersView usersView)
    {
        this.usersView = usersView;
    }
}