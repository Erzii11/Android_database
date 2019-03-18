package com.example.weibelyo.myapplication.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Country {
    @PrimaryKey
    @NonNull
    public  String numCountry;

    @ColumnInfo (name="name")
    public  String nameCountry;

    @ColumnInfo (name="topLevelDomain")
    public  String topLevelDomain;

    @ColumnInfo (name = "capital")
    public  String capital;

}
