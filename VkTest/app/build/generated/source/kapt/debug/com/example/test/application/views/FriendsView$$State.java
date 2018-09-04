package com.example.test.application.views;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.example.test.application.models.FriendModel;
import java.lang.Override;
import java.util.ArrayList;

public class FriendsView$$State extends MvpViewState<FriendsView> implements FriendsView {
	@Override
	public void showError(int textResource) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(textResource);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (FriendsView view : mViews) {
			view.showError(textResource);
		}

		mViewCommands.afterApply(showErrorCommand);
	}

	@Override
	public void setupEmptyList() {
		SetupEmptyListCommand setupEmptyListCommand = new SetupEmptyListCommand();
		mViewCommands.beforeApply(setupEmptyListCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (FriendsView view : mViews) {
			view.setupEmptyList();
		}

		mViewCommands.afterApply(setupEmptyListCommand);
	}

	@Override
	public void setupFriendsList(ArrayList<FriendModel> friendsList) {
		SetupFriendsListCommand setupFriendsListCommand = new SetupFriendsListCommand(friendsList);
		mViewCommands.beforeApply(setupFriendsListCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (FriendsView view : mViews) {
			view.setupFriendsList(friendsList);
		}

		mViewCommands.afterApply(setupFriendsListCommand);
	}

	@Override
	public void startLoading() {
		StartLoadingCommand startLoadingCommand = new StartLoadingCommand();
		mViewCommands.beforeApply(startLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for (FriendsView view : mViews) {
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

		for (FriendsView view : mViews) {
			view.endLoading();
		}

		mViewCommands.afterApply(endLoadingCommand);
	}

	public class ShowErrorCommand extends ViewCommand<FriendsView> {
		public final int textResource;

		ShowErrorCommand(int textResource) {
			super("showError", AddToEndSingleStrategy.class);

			this.textResource = textResource;
		}

		@Override
		public void apply(FriendsView mvpView) {
			mvpView.showError(textResource);
		}
	}

	public class SetupEmptyListCommand extends ViewCommand<FriendsView> {
		SetupEmptyListCommand() {
			super("setupEmptyList", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(FriendsView mvpView) {
			mvpView.setupEmptyList();
		}
	}

	public class SetupFriendsListCommand extends ViewCommand<FriendsView> {
		public final ArrayList<FriendModel> friendsList;

		SetupFriendsListCommand(ArrayList<FriendModel> friendsList) {
			super("setupFriendsList", AddToEndSingleStrategy.class);

			this.friendsList = friendsList;
		}

		@Override
		public void apply(FriendsView mvpView) {
			mvpView.setupFriendsList(friendsList);
		}
	}

	public class StartLoadingCommand extends ViewCommand<FriendsView> {
		StartLoadingCommand() {
			super("startLoading", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(FriendsView mvpView) {
			mvpView.startLoading();
		}
	}

	public class EndLoadingCommand extends ViewCommand<FriendsView> {
		EndLoadingCommand() {
			super("endLoading", AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(FriendsView mvpView) {
			mvpView.endLoading();
		}
	}
}
