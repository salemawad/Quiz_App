package com.salem.myapp.modle;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Category_tow implements Parcelable {
    String name ;
    int id ;

    public Category_tow(String name) {
        this.name = name;
    }

    public Category_tow() {

    }

    protected Category_tow(Parcel in) {
        name = in.readString();
        id = in.readInt();
    }

    public static final Creator<Category_tow> CREATOR = new Creator<Category_tow>() {
        @Override
        public Category_tow createFromParcel(Parcel in) {
            return new Category_tow(in);
        }

        @Override
        public Category_tow[] newArray(int size) {
            return new Category_tow[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public static final String TABLE_NAME = "category_tow";

    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_NAME + " TEXT NOT NULL)";

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(id);
    }
}
