package pk.edu.iqra.android.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pk.edu.iqra.android.firstapp.adapters.ContactAdapter
import pk.edu.iqra.android.firstapp.models.BUser
import pk.edu.iqra.android.firstapp.models.Contact
import pk.edu.iqra.android.firstapp.models.KUser
import pk.edu.iqra.android.firstapp.utils.DataHolder

class HomeActivity : AppCompatActivity() {
    private lateinit var rvMessageList:RecyclerView
    private lateinit var contactAdapter: ContactAdapter
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

        rvMessageList = findViewById(R.id.rvMessageList)
        contactAdapter = ContactAdapter(getContacts())

        rvMessageList.adapter = contactAdapter
    }

    private fun getContacts():List<Contact>{
        val list = ArrayList<Contact>()

        list.add(Contact("1","Mr. John 1","+92-344-2992002"))
        list.add(Contact("2","Mr. John 2","+92-344-2992002"))
        list.add(Contact("3","Mr. John 3","+92-344-2992002"))
        list.add(Contact("4","Mr. John 4","+92-344-2992002"))
        list.add(Contact("5","Mr. John 5","+92-344-2992002"))
        list.add(Contact("6","Mr. John 6","+92-344-2992002"))
        list.add(Contact("7","Mr. John 7","+92-344-2992002"))
        list.add(Contact("8","Mr. John 8","+92-344-2992002"))
        list.add(Contact("9","Mr. John 9","+92-344-2992002"))
        list.add(Contact("10","Mr. John 10","+92-344-2992002"))

        return list
    }
}