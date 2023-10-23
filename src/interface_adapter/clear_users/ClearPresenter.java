package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.logged_in.LoggedInState;
import interface_adapter.login.LoginState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData success) {
        ClearState clearState = clearViewModel.getState();
        //loggedInState.setUsername(response.getUsername());
        this.clearViewModel.setState(clearState);
        //this.loggedInViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(clearViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }
    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setError(error);
        clearViewModel.firePropertyChanged();
    }
}
