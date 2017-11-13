import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
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

    public User(String first, String last, String userN, String passW, String mailad){
        this.firstName = first;
        this.lastName = last;
        this.userName = userN;
        this.passWord = passW;
        this.emailAdd = mailad;
    }

    //get userID
    public int getUserId(){return this.uid;}
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

    // setting pass
    public void setmail(String mail){
        this.emailAdd = mail;
    }


}