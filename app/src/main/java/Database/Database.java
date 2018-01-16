package Database;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Valentin CLOUP on 17/11/2017.
 */

public class Database extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MyDatabase.db";


    public Database(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Personne(" +
                "idPersonne Integer PRIMARY KEY AUTOINCREMENT," +
                "nomPersonne VARCHAR(255)," +
                "prenomPersonne VARCHAR(255)," +
                "agePersonne VARCHAR(255)," +
                "poidPersonne VARCHAR(255)," +
                "dateMajPersonne Datetime," +
                "loginPersonne VARCHAR(255))");

        Date currentTime = Calendar.getInstance().getTime();

        //AJout des livres
        db.execSQL("INSERT INTO \"Personne\" VALUES(1,'Meiller','Kévin',34,120,"+currentTime+",'kéké'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(2,'Lafont','Antoine',24,75,"+currentTime+",'mamène'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(3,'Daclin','Vincent',22,75,"+currentTime+",'Jura'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(4,'Bidault','Guillaume',72,33,"+currentTime+",'StringJohanne'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(5,'Dereims','Léonard',24,93,"+currentTime+",'Zidane'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(6,'Walter','Maxime',23,65,"+currentTime+",'MisterWalt'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(7,'Barthélémy','Maxime',23,90,"+currentTime+",'Wasmax'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(8,'Cloup','Valentin',23,76,"+currentTime+",'Jimmy'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(9,'Kiene','Benjamin',22,60,"+currentTime+",'Benny'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(10,'Manca','Ruslan',22,75,"+currentTime+",'Exelion'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(11,'Fernandez','Thomas',22,67,"+currentTime+",'Trouelle'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(12,'Revenu','Simon',22,78,"+currentTime+",'KFC'); ");
        db.execSQL("INSERT INTO \"Personne\" VALUES(13,'Potherat','Léonard',31,92,"+currentTime+",'DjLeop'); ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {

    }


}
