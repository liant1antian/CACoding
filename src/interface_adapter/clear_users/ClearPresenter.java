package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private final SignupViewModel signupViewModel;
    private final ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel,
                          SignupViewModel signupViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
        this.signupViewModel = signupViewModel;
    }
    public void prepareSuccessView(ClearOutputData response){
        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(response.getDeletedUsers());
        clearViewModel.firePropertyChanged();

        SignupState signupState = signupViewModel.getState();
        this.signupViewModel.setState(signupState);
        this.signupViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(signupViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();


    }

    @Override
    public void prepareFailView(String error) {

    }



    }

