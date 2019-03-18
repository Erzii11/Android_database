package com.example.weibelyo.myapplication.db.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.weibelyo.myapplication.db.entity.Country;

import java.util.List;

import static java.nio.charset.CodingErrorAction.REPLACE;

@Dao
public class CountryDAO {
    @insert(onConflict = REPLACE)
    void insert(Country country);

    @Query("SELECT * from countries")
    List<Country> getAll();
}

