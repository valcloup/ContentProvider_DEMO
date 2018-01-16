package Database;

import android.provider.BaseColumns;

/**
 * Created by Valentin CLOUP on 04/12/2017.
 */

public class PersonBC implements BaseColumns {

    private PersonBC(){}

    public static final String PERSON_ID = "idPersonne";
    public static final String PERSON_NOM = "nomPersonne";
    public static final String PERSON_PRENOM = "prenomPersonne";
    public static final String PERSON_AGE = "agePersonne";
    public static final String PERSON_POID = "poidPersonne";
    public static final String PERSON_DATE_MAJ = "dateMajPersonne";
    public static final String PERSON_LOGIN = "loginPersonne";
}
