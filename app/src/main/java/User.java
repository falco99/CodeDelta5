/*
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;



@Entity(tableName = "user")
public class User {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "Username")
    private String userName;

    @ColumnInfo(name = "Password")
    private String passWord;

    @ColumnInfo(name = "Email")
    private String emailAdd;


    @Ignore
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.emailAdd = "";
        this.passWord = "";
    }


    //set userID
    public void setUserId(int idNo){ this.uid = idNo;}
    //get userID
    public int getUserId(){return this.uid;}

    public void setFirst(String first){this.firstName = first;}

    public String getFirst(){return this.firstName;}

    public void setLast(String last) {this.lastName = last;}

    public String getLast(){return this.lastName;}
    // getting user
    public String getuser(){
        return this.userName;
    }

    // setting user
    public void setuser(String userN){
        this.userName = userN;
    }

    // getting Pass
    public String getPass(){
        return this.passWord;
    }

    // setting pass
    public void setName(String passW){
        this.passWord = passW;
    }

    // getting email
    public String getmail(){
        return this.emailAdd;
    }

    // setting email
    public void setmail(String mail){
        this.emailAdd = mail;
    }


}
*/