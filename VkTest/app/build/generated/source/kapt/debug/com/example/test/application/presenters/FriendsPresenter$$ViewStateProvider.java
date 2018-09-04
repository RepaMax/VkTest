package com.example.test.application.presenters;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.viewstate.MvpViewState;
import com.example.test.application.views.FriendsView$$State;
import java.lang.Override;

public class FriendsPresenter$$ViewStateProvider extends ViewStateProvider {
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new FriendsView$$State();
	}
}
