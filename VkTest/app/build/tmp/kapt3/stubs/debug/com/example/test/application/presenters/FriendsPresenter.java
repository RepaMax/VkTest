package com.example.test.application.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tJ\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/test/application/presenters/FriendsPresenter;", "Lcom/arellomobile/mvp/MvpPresenter;", "Lcom/example/test/application/views/FriendsView;", "()V", "friendsLoaded", "", "friendsList", "Ljava/util/ArrayList;", "Lcom/example/test/application/models/FriendModel;", "Lkotlin/collections/ArrayList;", "loadFriends", "showError", "textResource", "", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class FriendsPresenter extends com.arellomobile.mvp.MvpPresenter<com.example.test.application.views.FriendsView> {
    
    public final void loadFriends() {
    }
    
    public final void friendsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.test.application.models.FriendModel> friendsList) {
    }
    
    public final void showError(int textResource) {
    }
    
    public FriendsPresenter() {
        super();
    }
}