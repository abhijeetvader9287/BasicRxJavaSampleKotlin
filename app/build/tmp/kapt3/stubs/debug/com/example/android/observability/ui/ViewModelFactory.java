package com.example.android.observability.ui;

import java.lang.System;

/**
 * * Factory for ViewModels
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/observability/ui/ViewModelFactory;", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "dataSource", "Lcom/example/android/observability/persistence/UserDao;", "(Lcom/example/android/observability/persistence/UserDao;)V", "create", "T", "Landroid/arch/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroid/arch/lifecycle/ViewModel;", "app_debug"})
public final class ViewModelFactory implements android.arch.lifecycle.ViewModelProvider.Factory {
    private final com.example.android.observability.persistence.UserDao dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends android.arch.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public ViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.android.observability.persistence.UserDao dataSource) {
        super();
    }
}