package pk.edu.iqra.android.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pk.edu.iqra.android.firstapp.models.BUser
import pk.edu.iqra.android.firstapp.models.KUser
import pk.edu.iqra.android.firstapp.utils.DataHolder

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setTheme(R.style.AppTheme_PremiumCustomer)
        setContentView(R.layout.activity_home)

        val txName = findViewById<TextView>(R.id.txName)
        //val name = intent.extras?.getString("name")
        //val kUser = intent.extras?.getSerializable("user") as KUser
        //val bUser = intent.extras?.getParcelable<BUser>("user")
        val bUser = DataHolder.bUser

        txName.text = "Hi, ${bUser?.fatherName}"
    }
}