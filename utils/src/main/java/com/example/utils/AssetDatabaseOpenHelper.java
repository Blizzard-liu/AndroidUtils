package com.example.utils;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @创建者 Blizzard-liu
 * @创建时间 2017/4/26 17:58
 * @描述 ${读取 Asset 目录中数据库工具类}
 * @更新者 ${Author}
 * @更新时间 2017/4/26
 * @更新描述 ${TODO}
 */

public class AssetDatabaseOpenHelper {
    private Context context;
    private String databaseName;

    public AssetDatabaseOpenHelper(Context context, String databaseName) {
        this.context = context;
        this.databaseName = databaseName;
    }

    /**
     * Create and/or open a database that will be used for reading and writing.
     *
     * @return SQLiteDatabase对象
     * @throws RuntimeException if cannot copy database from assets
     * @throws SQLiteException  if the database cannot be opened
     */
    public synchronized SQLiteDatabase getWritableDatabase() {
        File dbFile = context.getDatabasePath(databaseName);
        if (dbFile != null && !dbFile.exists()) {
            try {
                copyDatabase(dbFile);
            } catch (IOException e) {
                throw new RuntimeException("Error creating source database", e);
            }
        }

        assert dbFile != null;
        return SQLiteDatabase.openDatabase(dbFile.getPath(), null,
                SQLiteDatabase.OPEN_READWRITE);
    }

    /**
     * Create and/or open a database that will be used for reading only.
     *
     * @return SQLiteDatabase对象
     * @throws RuntimeException if cannot copy database from assets
     * @throws SQLiteException  if the database cannot be opened
     */
    public synchronized SQLiteDatabase getReadableDatabase() {
        File dbFile = context.getDatabasePath(databaseName);
        if (dbFile != null && !dbFile.exists()) {
            try {
                copyDatabase(dbFile);
            } catch (IOException e) {
                throw new RuntimeException("Error creating source database", e);
            }
        }

        return SQLiteDatabase.openDatabase(dbFile.getPath(), null,
                SQLiteDatabase.OPEN_READONLY);
    }

    /**
     * 获取数据库名称
     *
     * @return the database name
     */
    public String getDatabaseName() {
        return databaseName;
    }

    private void copyDatabase(File dbFile) throws IOException {
        InputStream stream = context.getAssets().open(databaseName);
        FileUtils.writeFile(dbFile, stream);
        stream.close();
    }
}
