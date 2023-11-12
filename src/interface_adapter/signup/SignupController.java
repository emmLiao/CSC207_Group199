package interface_adapter.signup;

import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

public class SignupController {

    private SignupInputBoundary signupInteractor;

    public SignupController(SignupInputBoundary signupInteractor){
        this.signupInteractor = signupInteractor;
    }

    public void execute(String username, String password, String repeatPassword) {
        SignupInputData signupInputData = new SignupInputData(username,password,repeatPassword);
        signupInteractor.execute(signupInputData);
    }

    public void back_to_login(){
        signupInteractor.back_to_login();
    }

}
