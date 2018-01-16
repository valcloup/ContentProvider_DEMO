package Model;

import java.util.Date;

/**
 * Created by Valentin CLOUP on 17/11/2017.
 */

public class Personne
{
    public int idPersonne;
    public String nomPersonne;
    public String prenomPersonne;
    public int agePersonne;
    public String poidsPersonne;
    public Date dateMajPersonne;
    public String loginPersonne;

    public String getLoginPersonne() {
        return loginPersonne;
    }

    public void setLoginPersonne(String loginPersonne) {
        this.loginPersonne = loginPersonne;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public int getAgePersonne() {
        return agePersonne;
    }

    public void setAgePersonne(int agePersonne) {
        this.agePersonne = agePersonne;
    }

    public String getPoidsPersonne() {
        return poidsPersonne;
    }

    public void setPoidsPersonne(String poidsPersonne) {
        this.poidsPersonne = poidsPersonne;
    }

    public Date getDateMajPersonne() {
        return dateMajPersonne;
    }

    public void setDateMajPersonne(Date dateMajPersonne) {
        this.dateMajPersonne = dateMajPersonne;
    }


}
