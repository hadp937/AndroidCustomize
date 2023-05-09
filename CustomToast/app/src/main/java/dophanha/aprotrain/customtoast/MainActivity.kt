package dophanha.aprotrain.customtoast


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_show_toast)
        button.setOnClickListener {
            val toast = Toast(this@MainActivity)
            val inflater = layoutInflater
            val view: View = inflater.inflate(R.layout.layout_custom_toast, findViewById<ViewGroup>(R.id.layout_custom_toast))
            val tvMessage: TextView = view.findViewById(R.id.tv_message)
            tvMessage.text = "You received an email from Đỗ Phan Hà"
            toast.view = view
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }
    }
}
