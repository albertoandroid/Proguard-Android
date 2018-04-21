package com.androiddesdecero.proguardandroid.user;

/**
 * Created by albertopalomarrobledo on 21/4/18.
 */

public class UserPrueba2 {
    private String nameProfessor;
    private String emailProfessor;

    public UserPrueba2() {
    }

    public UserPrueba2(String nameProfessor, String emailProfessor) {
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
