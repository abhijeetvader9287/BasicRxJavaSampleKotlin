package com.example.android.observability.ui;

import java.lang.System;

/**
 * * View Model for the [UserActivity]
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/observability/ui/UserViewModel;", "Landroid/arch/lifecycle/ViewModel;", "dataSource", "Lcom/example/android/observability/persistence/UserDao;", "(Lcom/example/android/observability/persistence/UserDao;)V", "updateUserName", "Lio/reactivex/Completable;", "userName", "", "Lio/reactivex/Flowable;", "Companion", "app_debug"})
public final class UserViewModel extends android.arch.lifecycle.ViewModel {
    private final com.example.android.observability.persistence.UserDao dataSource = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "1";
    public static final com.example.android.observability.ui.UserViewModel.Companion Companion = null;
    
    /**
     * * Get the user name of the user.
     *
     *     * @return a [Flowable] that will emit every time the user name has been updated.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.String> userName() {
        return null;
    }
    
    /**
     * * Update the user name.
     *     * @param userName the new user name
     *     * *
     *     * @return a [Completable] that completes when the user name is updated
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.observability.persistence.UserDao dataSource) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/observability/ui/UserViewModel$Companion;", "", "()V", "USER_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}