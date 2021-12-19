package com.redpho.neslitukeniyor

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView)
            val dice = Dice(15)
            val randomNum = dice.roll()
            when (randomNum) {
                1 -> resultTextView.text =
                    "Alageyik ya da Yağmurca(Dama dama) geyikgiller (Cervidae) familyasından, göçmen olmayan ve sürü oluşturan, kürek boynuzlu ve benekli gececil bir geyik türü."
                2 -> resultTextView.text =
                    "Kursaklı Ceylan veya Acem Ceylanı(Gazella subgutturosa) Gürcistan, Azerbaycan, İran, Kürdistan (Irak) ve Pakistan'ın bazı bölgelerinde, Afganistan, Tacikistan, Kırgızistan, Özbekistan, Türkmenistan, Kazakistan, kuzeybatı Çin ve Moğolistan'da, ayrıca Şanlıurfa'nın Ceylanpınar ilçesinde bulunan bir ceylan (Gazella) türü."
                3 -> resultTextView.text =
                    "Çizgili sırtlan (Hyaena hyaena) ya da Andık, sırtlangiller (Hyaenidae) familyasına ait, familyanın diğer üyelerinden daha küçük olan bir sırtlan türü."
                4 -> resultTextView.text =
                    "Akdeniz foku (Monachus monachus), fokgiller (Phocidae) familyasından yeryüzünde sadece doğu Akdeniz sahilleri ile Batı Afrika'nın bir tek sahilinde yaşayan fok türü."
                5 -> resultTextView.text =
                    "Anadolu dikenli faresi (Acomys cilicicus), sıçangiller familyasından Türkiye'de endemik olan bir küçük bir kemirici türü."
                6 -> resultTextView.text =
                    "Hint oklu kirpisi (Hystrix indica), oklu kirpigiller (Hystricidae) familyasından bir kemirici türü."
                7 -> resultTextView.text =
                    "Telli turna (Anthropoides virgo), turnagiller (Gruidae) familyasına ait bir kuş türü."
                8 -> resultTextView.text =
                    "Mezgeldek (Tetrax tetrax), toygiller (Otidae) familyasına ait açıklık alanlarda ve tarlalarda yaşayan bir kuş türü."
                9 -> resultTextView.text =
                    "Bozkır kartalı (Aquila nipalensis), atmacagiller (Accipitridae) familyasından bir kartal türü."
                10 -> resultTextView.text =
                    "Bayağı deniz kartalı (Haliaeetus albicilla), atmacagiller (Accipitridae) familyasından orta büyüklükte bir kartal türü."
                11 -> resultTextView.text =
                    "Ulu doğan (Falco cherrug), doğangiller (Falconidae) familyasından oldukça iri bir doğan türü."
                12 -> resultTextView.text =
                    "Kelaynak (Geronticus eremita), kayalık veya yarı çöl kurak yaşam alanlarında bulunan iri yapılı, suda veya çamurda yürüyen ince uzun kıvrık gagalı, 70–80 cm uzunluğunda, 120–135 cm kanat genişliğinde bir kuş türü."
                13 -> resultTextView.text =
                    "Toros kurbağası (Rana holtzi), Ranidae familyasından ortalama boyları 6 cm ile 7.5 cm arasında değişen Türkiye'de endemik bir kurbağa türü."
                14 -> resultTextView.text =
                    "Bozkır tuygunu (Circus macrourus), atmacagiller (Accipitridae) familyasından tıknaz bir tuygun türü."
                else -> {
                    resultTextView.text =
                        "Kolan balığı (Acipenser sturio), Atlantik mersin balığı, Baltık mersin balığı, bayağı mersin balığı olarak da bilinmektedir. Avrupa'nın en kıyılarında bulunan mersin balığı olan bir türü."
                }
            }
            val diceImage: ImageView = findViewById(R.id.imageView)
            val drawableResource = when (randomNum) {
                1 -> R.drawable.r1
                2 -> R.drawable.r2
                3 -> R.drawable.r3
                4 -> R.drawable.r4
                5 -> R.drawable.r5
                6 -> R.drawable.r6
                7 -> R.drawable.r7
                8 -> R.drawable.r8
                9 -> R.drawable.r9
                10 -> R.drawable.r10
                11 -> R.drawable.r11
                12 -> R.drawable.r12
                13 -> R.drawable.r13
                14 -> R.drawable.r14
                else -> {
                    R.drawable.r15
                }
            }
            diceImage.setImageResource(drawableResource)
        }

    }
}
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
