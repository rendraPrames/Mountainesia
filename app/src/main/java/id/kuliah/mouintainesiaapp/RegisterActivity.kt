package id.kuliah.mouintainesiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        REgist_btn_regist.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        textView_Login_regist.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
