package android.development.com.exploredatabinding.model;

/*  * Purpose : Model class of a person
 *  *
 *  * Created by,
 *  * Name : Mohd. Asfaq-E-Azam Rifat
 *  * Date : 26-Feb-18
 *  * Email : rifat@w3engineers.com
 *  * 
 *  * Last Edited by : Mohd. Asfaq-E-Azam Rifat on 26/02/2018.
 *  * 
 *  * Last Reviewed by : <Reviewer's Name> on <mm/dd/yy> 
 */

public class Person {
    private String mFullName;
    private String mNickName;

    public Person(String fullName, String nickName) {
        mFullName = fullName;
        mNickName = nickName;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        this.mFullName = fullName;
    }

    public String getNickName() {
        return mNickName;
    }

    public void setNickName(String nickName) {
        this.mNickName = nickName;
    }
}
