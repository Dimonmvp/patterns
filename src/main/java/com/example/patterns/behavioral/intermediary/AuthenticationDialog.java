//package com.example.patterns.behavioral.intermediary;
//
//import com.example.patterns.generating.abstractFactory.CheckBox;
//
//public class AuthenticationDialog implements Mediator{
//    private String title;
//    private CheckBox loginOrRegisterChkBx;
//    private Textbox loginUsername, loginPassword;
//    private Textbox registrationEmail;
//    private Button okBtn, cancelBtn;
//    private Textbox loginOrRegister;
//    private int registrationUsername, registrationPassword;
//
//    public AuthenticationDialog() {
//    }
//
//    @Override
//    public void myNotify(Component sender, String event) {
//        if (sender==loginOrRegisterChkBx && event =="check")
//        {
////            if (loginOrRegisterChkBx.checked)
//            {
//                title= "Log in";
//                // 1. Показать компоненты формы входа.
//                // 2. Скрыть компоненты формы регистрации.
//            }
//            else {
//                title = "Register";
//                // 1. Показать компоненты формы регистрации.
//                // 2. Скрыть компоненты формы входа.
//            }
//        }
//        if (sender == okBtn && event == "click")
////            if (loginOrRegister.checked)
//                // Попробовать найти пользователя с данными из
//                // формы логина.
////                if (!found)
//                // Показать ошибку над формой логина.
//            else {
//                // 1. Создать пользовательский аккаунт с данными
//                // из формы регистрации.
//                // 2. Авторизировать этого пользователя.
//                // ...
//            }
//    }
//}
