package com.javarush.task.task36.task3608.controller;

<<<<<<< HEAD

import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.model.ModelData;
import com.javarush.task.task36.task3608.view.EditUserView;
import com.javarush.task.task36.task3608.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public void setEditUserView(EditUserView editUserView) {
        this.editUserView = editUserView;
    }

    private EditUserView editUserView;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }


=======
import com.javarush.task.task36.task3608.model.Model;

public class Controller {
    private Model model;

    public void onShowAllUsers() {
        model.loadUsers();
    }

    public void setModel(Model model) {
        this.model = model;
    }
>>>>>>> a7107a0e7c5a6d54741a92aafbd62681a0379d4c
}
