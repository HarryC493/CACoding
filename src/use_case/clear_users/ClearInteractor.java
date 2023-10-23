package use_case.clear_users;

// TODO Complete me

import data_access.FileUserDataAccessObject;
import interface_adapter.clear_users.ClearPresenter;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearPresentor;

    //final FileUserDataAccessObject FileUserDataAccessObject;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
        this.clearPresentor = clearOutputBoundary;
    }

    @Override
    public void execute() {
        clearUserDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData("Success");
        clearPresentor.prepareSuccessView(clearOutputData);
    }
}
