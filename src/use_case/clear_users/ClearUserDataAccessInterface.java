package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;
import java.util.Set;

public interface ClearUserDataAccessInterface {
    void delete();
    Set<String> getallusers();
}
