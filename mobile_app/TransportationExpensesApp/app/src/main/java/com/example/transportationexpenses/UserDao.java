package com.example.transportationexpenses;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public abstract class UserDao {
    // 一番大きい値のIDを取り出して、保存する。
//    @Query("select id from user order by id desc limit 1")
//    public abstract long getMaxId();

    @Query("select * from user where id = :id LIMIT 1")
    abstract User get(int id);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract void insert(User user);

    @Query("delete from user where id = :id")
    abstract void delete(int id);

    @Update
    abstract void updateUsers(User user);
}
