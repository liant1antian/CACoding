package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private String deletedUsers = "";
    private String deletedUsersError = null;


    public ClearState(ClearState copy){
        deletedUsers = copy.deletedUsers;
        deletedUsersError = copy.getDeletedUsersError();
    }

    public ClearState(){
    }

    public String getDeletedUsers() {
        return deletedUsers;
    }
    public String getDeletedUsersError(){
        return deletedUsersError;
    }

    public void setDeletedUsers(String deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public void setDeletedUsersError(String deletedUsersError) {
        this.deletedUsersError = deletedUsersError;
    }
}
