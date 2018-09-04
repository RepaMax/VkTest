package com.example.test.application.activities;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.presenter.PresenterType;
import com.example.test.application.presenters.FriendsPresenter;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class FriendsActivity$$PresentersBinder extends PresenterBinder<FriendsActivity> {
	@Override
	public List<PresenterField<FriendsActivity>> getPresenterFields() {
		List<PresenterField<FriendsActivity>> presenters = new ArrayList<>(1);
		presenters.add(new friendsPresenterBinder());
		return presenters;
	}

	public class friendsPresenterBinder extends PresenterField<FriendsActivity> {
		public friendsPresenterBinder() {
			super("friendsPresenter", PresenterType.LOCAL, null, FriendsPresenter.class);
		}

		@Override
		public void bind(FriendsActivity target, MvpPresenter presenter) {
			target.friendsPresenter = (FriendsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(FriendsActivity delegated) {
			return new FriendsPresenter();
		}
	}
}
