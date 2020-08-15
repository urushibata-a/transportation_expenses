package com.example.transportationexpenses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"data"}, unique = true)})
public class User {
    @PrimaryKey
    public long id;

    @ColumnInfo
    public String data;
}