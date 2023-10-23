package use_case.clear_users;

// TODO Complete me

import entity.User;
import entity.UserFactory;
import use_case.login.LoginInputBoundary;
import use_case.signup.SignupOutputBoundary;
import use_case.signup.SignupUserDataAccessInterface;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;



    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary,
                            UserFactory userFactory) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    public void execute(ClearInputData clearInputData){
        if (userDataAccessObject.getallusers().isEmpty()){
            clearPresenter.prepareFailView("No user for deleting");
        } else {
            userDataAccessObject.delete();
            String joined = String.join(",", userDataAccessObject.getallusers());
            ClearOutputData clearOutputData = new ClearOutputData(joined);
            clearPresenter.prepareSuccessView(clearOutputData);

        }

    }

}
