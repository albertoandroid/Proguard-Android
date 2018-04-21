package com.androiddesdecero.proguardandroid.user;

/**
 * Created by albertopalomarrobledo on 21/4/18.
 */

public class UserPrueba {
    private String nameProfessor;
    private String emailProfessor;

    public UserPrueba() {
    }

    public UserPrueba(String nameProfessor, String emailProfessor) {
        this.nameProfessor = nameProfessor;
        this.emailProfessor = emailProfessor;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }
}
