package stepDefinitions;

import io.cucumber.java.af.Dan;
import io.cucumber.java.nl.Als;
import io.cucumber.java.nl.Gegeven;

public class StepDefinition {

    @Gegeven("ik ben op de log in pagina")
    public void ik_ben_op_de_log_in_pagina() {
        System.out.println("ik ben ingelogd");
    }
    @Als("ik mijn gebruikersnaam {string} invul")
    public void ik_mijn_gebruikersnaam_invul(String naam) {
        System.out.println("ik vul mijn gebruikersnaam " + naam);
     }
    @Als("ik mijn wachtwoord {string} invul")
    public void mijn_wachtwoord_invul(String pass) {
        System.out.println("Mijn wachtwoord invult " + pass);

    }
    @Als("ik klik op Inloggen")
    public void ik_klik_op_inloggen() {
        System.out.println("Ik klik op inloggen");

    }
    @Dan("ben ik op de welkom pagina")
    public void ben_ik_op_de_welkom_pagina() {
        System.out.println("Ik ben op de welkom pagina");

    }

    @Gegeven("ik ben ingelogd")
    public void ik_ben_ingelogd() {
        System.out.println("Ik ben ingelogd");
    }
    @Gegeven("ik zoek naar {string}")
    public void ik_zoek_naar(String product) {
        System.out.println("Ik zoek naar " + product);
     }
    @Dan("krijg ik {string} op het scherm")
    public void krijg_ik_op_het_scherm(String aantal) {
        System.out.println("krijg ik aantal " + aantal + "op het scherm");

    }


}
