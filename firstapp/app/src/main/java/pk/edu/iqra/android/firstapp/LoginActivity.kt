package pk.edu.iqra.android.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pk.edu.iqra.android.firstapp.models.BUser
import pk.edu.iqra.android.firstapp.models.Customer
import pk.edu.iqra.android.firstapp.models.KUser
import pk.edu.iqra.android.firstapp.utils.DataHolder

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btn_sign_in).setOnClickListener {
            //val kUser = KUser(1,"Muhammad","Wasim","Aziz","421873823293","10102010")
            val bUser = BUser(1,"Muhammad","Wasim","Aziz","421873823293","10102010")
            DataHolder.bUser = bUser
            Intent(this@LoginActivity,HomeActivity::class.java).apply {
                //putExtra("name","Muhammad Wasim")
                //putExtra("user",bUser)
                startActivity(this)
            }
        }
    }
}