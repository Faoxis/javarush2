package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
<<<<<<< HEAD

=======
>>>>>>> a7107a0e7c5a6d54741a92aafbd62681a0379d4c
        return modelData;
    }

    @Override
<<<<<<< HEAD
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("A", 2, 1));
=======
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
>>>>>>> a7107a0e7c5a6d54741a92aafbd62681a0379d4c
        modelData.setUsers(users);
    }
}
