package com.example.android.observability.persistence;

import java.lang.System;

/**
 * * Data Access Object for the users table.
 */
@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/observability/persistence/UserDao;", "", "deleteAllUsers", "", "getUserById", "Lio/reactivex/Flowable;", "Lcom/example/android/observability/persistence/User;", "id", "", "insertUser", "user", "app_debug"})
public abstract interface UserDao {
    
    /**
     * * Get a user by id.
     *
     *     * @return the user from the table with a specific id.
     */
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM Users WHERE userid = :id")
    public abstract io.reactivex.Flowable<com.example.android.observability.persistence.User> getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    /**
     * * Insert a user in the database. If the user already exists, replace it.
     *
     *     * @param user the user to be inserted.
     */
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertUser(@org.jetbrains.annotations.NotNull()
    com.example.android.observability.persistence.User user);
    
    /**
     * * Delete all users.
     */
    @android.arch.persistence.room.Query(value = "DELETE FROM Users")
    public abstract void deleteAllUsers();
}