package com.example.transportationexpenses;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public abstract class UserDao {
    @Query("select id from user order by id desc limit 1")
    public abstract long getMaxId();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract void insert(User user);

    @Query("delete from user where id = :id")
    abstract void delete(long id);
}
