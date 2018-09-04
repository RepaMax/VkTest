package com.example.test.application.presenters;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.viewstate.MvpViewState;
import com.example.test.application.views.LoginView$$State;
import java.lang.Override;

public class LoginPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new LoginView$$State();
	}
}
