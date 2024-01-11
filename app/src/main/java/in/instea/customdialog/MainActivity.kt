package `in`.instea.customdialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showBtn = findViewById<Button>(R.id.openDialog_button)

        showBtn.setOnClickListener {  }
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
//        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.dialog_bg))
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg)

        val feedbackBtn = dialog.findViewById<Button>(R.id.btnFeedback)
        val goodBtn = dialog.findViewById<Button>(R.id.btnGood)

        showBtn.setOnClickListener {
            dialog.show()
        }

        feedbackBtn.setOnClickListener {
            Toast.makeText(this, "feedback sent...", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        goodBtn.setOnClickListener {
            Toast.makeText(this, "Congratulations...", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }
}