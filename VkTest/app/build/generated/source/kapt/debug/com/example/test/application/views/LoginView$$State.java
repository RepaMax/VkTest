package com.example.test.application.views;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import java.lang.Override;

public class LoginView$$State extends MvpViewState<LoginView> implements LoginView {
	@Override
	public void startLoading() {
		StartLoadingCommand startLoadingCommand = new StartLoadingCommand();
		mViewCommands.beforeApply(startLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (LoginView view : mViews) {
			view.startLoading();
		}

		mViewCommands.afterApply(startLoadingCommand);
	}

	@Override
	public void endLoading() {
		EndLoadingCommand endLoadingCommand = new EndLoadingCommand();
		mViewCommands.beforeApply(endLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (LoginView view : mViews) {
			view.endLoading();
		}

		mViewCommands.afterApply(endLoadingCommand);
	}

	@Override
	public void showError(int textResource) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(textResource);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (LoginView view : mViews) {
			view.showError(textResource);
		}

		mViewCommands.afterApply(showErrorCommand);
	}

	@Override
	public void openFriends() {
		OpenFriendsCommand openFriendsCommand = new OpenFriendsCommand();
		mViewCommands.beforeApply(openFriendsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (LoginView view : mViews) {
			view.openFriends();
		}

		mViewCommands.afterApply(openFriendsCommand);
	}

	public class StartLoadingCommand extends ViewCommand<LoginView> {
		StartLoadingCommand() {
			super("startLoading", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(LoginView mvpView) {
			mvpView.startLoading();
		}
	}

	public class EndLoadingCommand extends ViewCommand<LoginView> {
		EndLoadingCommand() {
			super("endLoading", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(LoginView mvpView) {
			mvpView.endLoading();
		}
	}

	public class ShowErrorCommand extends ViewCommand<LoginView> {
		public final int textResource;

		ShowErrorCommand(int textResource) {
			super("showError", AddToEndSingleStrategy.class);

			this.textResource = textResource;
		}

		@Override
		public void apply(LoginView mvpView) {
			mvpView.showError(textResource);
		}
	}

	public class OpenFriendsCommand extends ViewCommand<LoginView> {
		OpenFriendsCommand() {
			super("openFriends", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(LoginView mvpView) {
			mvpView.openFriends();
		}
	}
}
