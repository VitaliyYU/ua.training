package ua.training.controller;

import ua.training.model.Note;
import ua.training.view.MessageConstants;
import ua.training.view.View;

/**
 * Created by vitaliy on 22.04.17.
 */
public class TemplateNotebook {
    private Note note;
    private View view;

    private String  nickname;
    private String phoneNumbers;
    private String email;
    private String address;

    private UtilController utilController;

    public TemplateNotebook(UtilController utilController,Note note,View view) {
        this.utilController = utilController;
        this.note=note;
        this.view=view;
    }

    public void saveInNote(){
        checkAllData();
        note.setAddress(address);
        note.setEmail(email);
        note.setNickname(nickname);
        note.setPhoneNumbers(phoneNumbers);
        note.setCreateTime();
    }

    public void checkAllData(){
        checkNickname();
        checkPhoneNummber();
        checkEmail();
        checkAddress();
    }

    public void checkNickname(){
        view.printMessage(MessageConstants.INPUT_NICKNAMME);
        nickname=utilController.inputValueWithRegex(NoteRegex.NICK_REGEX);
    }

    public void checkPhoneNummber(){
        view.printMessage(MessageConstants.INPUT_PHONE);
        phoneNumbers=utilController.inputValueWithRegex(NoteRegex.PHONE_NUMBER_REGEX);
    }

    public void checkAddress() {
        view.printMessage(MessageConstants.INPUT_ADDRESS);
        address=utilController.inputValueWithRegex(NoteRegex.ADDRESS_REGEX);
    }

    public void checkEmail(){
        view.printMessage(MessageConstants.Input_EMAIL);
        email=utilController.inputValueWithRegex(NoteRegex.EMAIL_REGEX);
    }
}
