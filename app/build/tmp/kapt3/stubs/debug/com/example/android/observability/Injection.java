package com.example.android.observability;

import java.lang.System;

/**
 * * Enables injection of data sources.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/android/observability/Injection;", "", "()V", "provideUserDataSource", "Lcom/example/android/observability/persistence/UserDao;", "context", "Landroid/content/Context;", "provideViewModelFactory", "Lcom/example/android/observability/ui/ViewModelFactory;", "app_debug"})
public final class Injection {
    public static final com.example.android.observability.Injection INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.observability.persistence.UserDao provideUserDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.observability.ui.ViewModelFactory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private Injection() {
        super();
    }
}