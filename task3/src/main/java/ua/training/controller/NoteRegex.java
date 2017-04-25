package ua.training.controller;

/**
 * Created by vitaliy on 22.04.17.
 */
public interface NoteRegex {
    public static String NICK_REGEX="^[a-zA-Z]+[0-9a-zA-Z]+$";
    public static String PHONE_NUMBER_REGEX="^0(96|97|98|50|44|67|63)[0-9]{7}$";
    public static String ADDRESS_REGEX="^[a-zA-Z]+\\s[0-9]+$";
    public static  String EMAIL_REGEX="^[a-zA-Z0-9]+@(gmail.com|ukr.net|i.ua)$";

}
