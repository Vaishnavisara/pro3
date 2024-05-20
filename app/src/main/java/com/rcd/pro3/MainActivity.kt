package com.rcd.pro3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var list: ListView?=null
    var cityChennai: ImageView = findViewById(R.id.imageView1)
    var cityHosur: ImageView = findViewById(R.id.imageView2)
    var streamImage: ImageView = findViewById(R.id.stream)
    var firstMovie : ImageView = findViewById(R.id.firstMovie)
    var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setContentView(R.layout.activity_main2)


        list=findViewById(R.id.list)
        val array= listOf( "Ariyalur", "Chennai", "Coimbatore", "Cuddalore", "Dharmapuri",
            "Dindigul", "Erode", "Kanchipuram", "Kanyakumari", "Karur",
            "Krishnagiri", "Madurai", "Nagapattinam", "Namakkal", "Perambalur",
            "Pudukkottai", "Ramanathapuram", "Salem", "Sivaganga", "Tenkasi",
            "Thanjavur")

        val arrayAdopter : ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_activated_1,array
        )
        list?.adapter=arrayAdopter
    }


//    fun click() {
//        var imageList = listOf(R.drawable.stream2, R.drawable.ghilli, R.drawable.siren)
//        cityChennai.setOnClickListener {
//            setContentView(R.layout.activity_main2)
//            streamImage.setImageResource(imageList[0])
//            firstMovie.setImageResource(imageList[1])
//
//        }
//    }

    fun click(view: View) {
        var imageList = listOf(R.drawable.stream2, R.drawable.ghilli, R.drawable.siren)
        cityChennai.setOnClickListener {
            setContentView(R.layout.activity_main2)
            streamImage.setImageResource(imageList[0])
            firstMovie.setImageResource(imageList[1])

        }
    }
}
//private operator fun Int.get(i: Int): Int {
//    TODO("Not yet implemented")
//}