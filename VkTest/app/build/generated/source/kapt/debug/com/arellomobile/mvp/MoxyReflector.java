package com.arellomobile.mvp;

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.example.test.application.activities.FriendsActivity;
import com.example.test.application.activities.FriendsActivity$$PresentersBinder;
import com.example.test.application.activities.LoginActivity;
import com.example.test.application.activities.LoginActivity$$PresentersBinder;
import com.example.test.application.presenters.FriendsPresenter;
import com.example.test.application.presenters.FriendsPresenter$$ViewStateProvider;
import com.example.test.application.presenters.LoginPresenter;
import com.example.test.application.presenters.LoginPresenter$$ViewStateProvider;
import java.lang.Class;
import java.lang.Object;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MoxyReflector {
	private static Map<Class<?>, Object> sViewStateProviders;

	private static Map<Class<?>, List<Object>> sPresenterBinders;

	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(FriendsPresenter.class, new FriendsPresenter$$ViewStateProvider());
		sViewStateProviders.put(LoginPresenter.class, new LoginPresenter$$ViewStateProvider());

		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(FriendsActivity.class, Arrays.<Object>asList(new FriendsActivity$$PresentersBinder()));
		sPresenterBinders.put(LoginActivity.class, Arrays.<Object>asList(new LoginActivity$$PresentersBinder()));

		sStrategies = new HashMap<>();
		sStrategies.put(AddToEndSingleStrategy.class, new AddToEndSingleStrategy());
	}

	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}

		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
