package indep.projects.preworkcodepathandroid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val greetings_button: Button = findViewById(R.id.greetings_button)
            greetings_button.setOnClickListener{
                Toast.makeText(this,"Hello to you too!", Toast.LENGTH_SHORT).show()
            }
    }
}

