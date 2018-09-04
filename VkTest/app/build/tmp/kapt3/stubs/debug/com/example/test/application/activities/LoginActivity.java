package com.example.test.application.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/test/application/activities/LoginActivity;", "Lcom/arellomobile/mvp/MvpAppCompatActivity;", "Lcom/example/test/application/views/LoginView;", "()V", "loginPresenter", "Lcom/example/test/application/presenters/LoginPresenter;", "getLoginPresenter", "()Lcom/example/test/application/presenters/LoginPresenter;", "setLoginPresenter", "(Lcom/example/test/application/presenters/LoginPresenter;)V", "mBtnEnter", "Landroid/widget/Button;", "mCpvWait", "Lcom/github/rahatarmanahmed/cpv/CircularProgressView;", "mTxtHello", "Landroid/widget/TextView;", "endLoading", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openFriends", "showError", "textResource", "startLoading", "app_debug"})
public final class LoginActivity extends com.arellomobile.mvp.MvpAppCompatActivity implements com.example.test.application.views.LoginView {
    private android.widget.TextView mTxtHello;
    private android.widget.Button mBtnEnter;
    private com.github.rahatarmanahmed.cpv.CircularProgressView mCpvWait;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public com.example.test.application.presenters.LoginPresenter loginPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.test.application.presenters.LoginPresenter getLoginPresenter() {
        return null;
    }
    
    public final void setLoginPresenter(@org.jetbrains.annotations.NotNull()
    com.example.test.application.presenters.LoginPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void startLoading() {
    }
    
    @java.lang.Override()
    public void endLoading() {
    }
    
    @java.lang.Override()
    public void showError(int textResource) {
    }
    
    @java.lang.Override()
    public void openFriends() {
    }
    
    public LoginActivity() {
        super();
    }
}