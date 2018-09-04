package com.example.test.application.activities;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.presenter.PresenterType;
import com.example.test.application.presenters.LoginPresenter;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity$$PresentersBinder extends PresenterBinder<LoginActivity> {
	@Override
	public List<PresenterField<LoginActivity>> getPresenterFields() {
		List<PresenterField<LoginActivity>> presenters = new ArrayList<>(1);
		presenters.add(new loginPresenterBinder());
		return presenters;
	}

	public class loginPresenterBinder extends PresenterField<LoginActivity> {
		public loginPresenterBinder() {
			super("loginPresenter", PresenterType.LOCAL, null, LoginPresenter.class);
		}

		@Override
		public void bind(LoginActivity target, MvpPresenter presenter) {
			target.loginPresenter = (LoginPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(LoginActivity delegated) {
			return new LoginPresenter();
		}
	}
}
