package dophanha.aprotrain.customprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.github.ybq.android.spinkit.style.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar1: ProgressBar = findViewById(R.id.progress_bar_1)
        val progressBar2: ProgressBar = findViewById(R.id.progress_bar_2)
        val progressBar3: ProgressBar = findViewById(R.id.progress_bar_3)
        val progressBar4: ProgressBar = findViewById(R.id.progress_bar_4)
        val progressBar5: ProgressBar = findViewById(R.id.progress_bar_5)
        val progressBar6: ProgressBar = findViewById(R.id.progress_bar_6)
        val progressBar7: ProgressBar = findViewById(R.id.progress_bar_7)
        val progressBar8: ProgressBar = findViewById(R.id.progress_bar_8)
        val progressBar9: ProgressBar = findViewById(R.id.progress_bar_9)
        val progressBar10: ProgressBar = findViewById(R.id.progress_bar_10)
        val progressBar11: ProgressBar = findViewById(R.id.progress_bar_11)
        val progressBar12: ProgressBar = findViewById(R.id.progress_bar_12)

        progressBar1.indeterminateDrawable = RotatingPlane()
        progressBar2.indeterminateDrawable = DoubleBounce()
        progressBar3.indeterminateDrawable = Wave()
        progressBar4.indeterminateDrawable = WanderingCubes()
        progressBar5.indeterminateDrawable = Pulse()
        progressBar6.indeterminateDrawable = ChasingDots()
        progressBar7.indeterminateDrawable = ThreeBounce()
        progressBar8.indeterminateDrawable = Circle()
        progressBar9.indeterminateDrawable = CubeGrid()
        progressBar10.indeterminateDrawable = FadingCircle()
        progressBar11.indeterminateDrawable = FoldingCube()
        progressBar12.indeterminateDrawable = RotatingCircle()

    }
}