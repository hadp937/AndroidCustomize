package dophanha.aprotrain.customdialog

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOpenDialogCenter: Button = findViewById(R.id.btn_open_dialog_center)
        val btnOpenDialogBottom: Button = findViewById(R.id.btn_open_dialog_bottom)

        btnOpenDialogCenter.setOnClickListener {
            openFeedBack(Gravity.CENTER)
        }
        btnOpenDialogBottom.setOnClickListener {
            openFeedBack(Gravity.BOTTOM)
        }
    }

    private fun openFeedBack(gravity: Int) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.layout_dialog_feedback)

        val window: Window? = dialog.window
        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val windowAttributes: WindowManager.LayoutParams? = window?.attributes
        windowAttributes?.gravity = gravity
        window?.attributes = windowAttributes

        if (Gravity.BOTTOM == gravity) {
            dialog.setCancelable(true)
        } else {
            dialog.setCancelable(false)
        }

        val edtFeedBack: EditText = dialog.findViewById(R.id.edt_feedback)
        val btnNoThank: Button = dialog.findViewById(R.id.btn_no_thanks)
        val btnSend: Button = dialog.findViewById(R.id.btn_send)

        btnNoThank.setOnClickListener {
            dialog.dismiss()
        }
        btnSend.setOnClickListener {
            Toast.makeText(this@MainActivity, "Send Feedback", Toast.LENGTH_SHORT).show()
        }
        dialog.show()
    }
}