package com.example.test.application.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/test/application/views/FriendsView;", "Lcom/arellomobile/mvp/MvpView;", "endLoading", "", "setupEmptyList", "setupFriendsList", "friendsList", "Ljava/util/ArrayList;", "Lcom/example/test/application/models/FriendModel;", "Lkotlin/collections/ArrayList;", "showError", "textResource", "", "startLoading", "app_debug"})
@com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface FriendsView extends com.arellomobile.mvp.MvpView {
    
    public abstract void showError(int textResource);
    
    public abstract void setupEmptyList();
    
    public abstract void setupFriendsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.test.application.models.FriendModel> friendsList);
    
    public abstract void startLoading();
    
    public abstract void endLoading();
}