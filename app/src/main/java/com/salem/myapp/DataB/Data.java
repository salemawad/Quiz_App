package com.salem.myapp.DataB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.salem.myapp.modle.Category_tow;
import com.salem.myapp.modle.Item2;

import java.util.ArrayList;

public class Data extends SQLiteOpenHelper {

    SQLiteDatabase database;

    public Data(@Nullable Context context) {
        super(context, "name", null, 1);
        database = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Category_tow.CREATE_TABLE);
        db.execSQL(Item2.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + Category_tow.TABLE_NAME);
        db.execSQL("drop table if exists " + Item2.TABLE_NAME);
        onCreate(db);
    }
    //add category new

    public boolean insert_Ca(String name) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Category_tow.COL_NAME, name);
        return database.insert(Category_tow.TABLE_NAME, null, contentValues) > 0;
    }

    //استرجاع التي تم اضافتها
    public ArrayList<Category_tow> get_Ca() {
        ArrayList<Category_tow> category_tows = new ArrayList<>();
        Cursor cursor = database.rawQuery("select * from " + Category_tow.TABLE_NAME, null);
        while (cursor.moveToNext()) {
            Category_tow category_tow = new Category_tow();
            category_tow.setId(cursor.getInt(cursor.getColumnIndex(Category_tow.COL_ID)));
            category_tow.setName(cursor.getString(cursor.getColumnIndex(Category_tow.COL_NAME)));
            category_tows.add(category_tow);

        }
        cursor.close();
        return category_tows;
    }

    // اضافة مهمات جديدة
    public boolean insert_item(String name, int category) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(Item2.COL_NAME, name);
        contentValues.put(Item2.COL_CATEGORY_ID, category);
        return database.insert(Item2.TABLE_NAME, null, contentValues) > 0;
    }

    //استرجاع التي تم اضافتها
    public ArrayList<Item2> get_item(int id) {
        ArrayList<Item2> item2s = new ArrayList<>();
        Cursor cursor = database.rawQuery("select * from " + Item2.TABLE_NAME+ " where "+Item2.COL_CATEGORY_ID+"=?" , new String[]{String.valueOf(id)});
        while (cursor.moveToNext()) {
            Item2 item2 = new Item2();
            item2.setId(cursor.getInt(cursor.getColumnIndex(Item2.COL_ID)));
            item2.setCategoryId(cursor.getInt(cursor.getColumnIndex(Item2.COL_CATEGORY_ID)));
            item2.setName(cursor.getString(cursor.getColumnIndex(Item2.COL_NAME)));
            item2s.add(item2);

        }
        cursor.close();
        return item2s;
    }

}
