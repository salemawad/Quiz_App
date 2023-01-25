package com.salem.myapp.modle;

import android.os.Parcel;
import android.os.Parcelable;

public class Item2 implements Parcelable {
    private int id;
    private String name;
    private int categoryId;

    public Item2() {
        this.name = name;
        this.categoryId = categoryId;
    }

    protected Item2(Parcel in) {
        id = in.readInt();
        name = in.readString();
        categoryId = in.readInt();
    }

    public static final Creator<Item2> CREATOR = new Creator<Item2>() {
        @Override
        public Item2 createFromParcel(Parcel in) {
            return new Item2(in);
        }

        @Override
        public Item2[] newArray(int size) {
            return new Item2[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public static final String TABLE_NAME = "item2";

    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_CATEGORY_ID = "category";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT,"
            + COL_NAME + " TEXT NOT NULL,"
            + COL_CATEGORY_ID + " INTEGER)";

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeInt(categoryId);
    }
}
