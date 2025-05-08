package com.example.basededatos;

import android.os.AsyncTask;

import androidx.room.Room;

import java.util.List;
public class Repositorio {

    static String databaseName = "database.zeus";

            privete DatabaseOperation handler;

    public Repositorio(DatabaseOperation handler){
        this.handler = handler;

        AsyncTask.execute(() -> {
            AppDatabase db = Room.databaseBuilder(
                    getApplicationContext(),
                    AppDatabase.class, databaseName
            ).build();
        }
    }
    interface DatabaseOperation {
        void onSaved(User user);
        void onDelete();
        void onList();

        void onList(List<User> users);
    }

    public void listUsers() {

        AsyncTask.execute(() -> {

            UserDao userDao = db.userDao();
            List<User> users = userDao.getAll();
            return handler.onList(user);
        }
    }

    public createUser (User user){
        AsyncTask.execute(() -> {

            UserDao userDao = db.userDao();
            userDao.insert(user);
            return handler.onList(user);
        }
    }

    public createUser (User user){
        AsyncTask.execute(() -> {
            UserDao userDao = db.userDao();
            userDao.insert(user);
            return handler.onList(user);
        }
    }
}
