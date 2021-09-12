package br.com.cotemig.praticav.ui.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.cotemig.praticav.R
import br.com.cotemig.praticav.models.Account

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var name = findViewById<EditText>(R.id.name)
        var phone = findViewById<EditText>(R.id.phone)
        var birthDate = findViewById<EditText>(R.id.birthDate)
        var btnCreateAccount = findViewById<Button>(R.id.btnCreateAccount)
        var account = Account()

        btnCreateAccount.setOnClickListener {
            account.createAccount(name.text.toString(), phone.text.toString(), birthDate.text.toString())
            Toast.makeText(this, "Conta ${account.accountNumber} Criada", Toast.LENGTH_LONG).show()
        }

    }


}
