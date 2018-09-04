package com.example.test.application.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0016J \u0010\u0018\u001a\u00020\u00132\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/test/application/activities/FriendsActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lcom/example/test/application/views/FriendsView;", "()V", "friendsPresenter", "Lcom/example/test/application/presenters/FriendsPresenter;", "getFriendsPresenter", "()Lcom/example/test/application/presenters/FriendsPresenter;", "setFriendsPresenter", "(Lcom/example/test/application/presenters/FriendsPresenter;)V", "mAdapter", "Lcom/example/test/application/adapter/FriendsAdapter;", "mCpvWait", "Lcom/github/rahatarmanahmed/cpv/CircularProgressView;", "mRvFriends", "Landroid/support/v7/widget/RecyclerView;", "mTxtNoItem", "Landroid/widget/TextView;", "endLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupEmptyList", "setupFriendsList", "friendsList", "Ljava/util/ArrayList;", "Lcom/example/test/application/models/FriendModel;", "Lkotlin/collections/ArrayList;", "showError", "textResource", "", "startLoading", "app_debug"})
public final class FriendsActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements com.example.test.application.views.FriendsView {
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.example.test.application.presenters.FriendsPresenter friendsPresenter;
    private android.support.v7.widget.RecyclerView mRvFriends;
    private android.widget.TextView mTxtNoItem;
    private com.github.rahatarmanahmed.cpv.CircularProgressView mCpvWait;
    private com.example.test.application.adapter.FriendsAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.test.application.presenters.FriendsPresenter getFriendsPresenter() {
        return null;
    }
    
    public final void setFriendsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.test.application.presenters.FriendsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showError(int textResource) {
    }
    
    @java.lang.Override()
    public void setupEmptyList() {
    }
    
    @java.lang.Override()
    public void setupFriendsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.test.application.models.FriendModel> friendsList) {
    }
    
    @java.lang.Override()
    public void startLoading() {
    }
    
    @java.lang.Override()
    public void endLoading() {
    }
    
    public FriendsActivity() {
        super();
    }
}