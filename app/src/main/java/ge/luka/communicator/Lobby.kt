package ge.luka.communicator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase

class Lobby : AppCompatActivity() {

    /// FireBase
    var database = FirebaseDatabase.getInstance()
    var myRef = database.getReference("Lukaie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lobby)
    }
}
