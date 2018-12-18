package ge.luka.communicator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_authentication.*


class AuthenticationActivity : AppCompatActivity() {

    /// FireBase
    var database = FirebaseDatabase.getInstance()
    var myRef = database.getReference("Lukaie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        signUpButtonAuth.setOnClickListener {
            val intent = Intent(this,RegistrationActivity::class.java)

            startActivity(intent)
        }
        signInButtonAuth.setOnClickListener {
            val intent = Intent(this,Lobby::class.java)

            var status=if(userNameEditTextAuth.text.toString().equals("smth")
            && passwordEditTextAuth.text.toString().equals("smth"))  "გამარჯობა"

            else "იმეილი ან პაროლი არასწორია"

            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }
    }
}





