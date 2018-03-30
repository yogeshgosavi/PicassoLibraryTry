package com.codekul.image

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var i:Int = 1
      //  Glide.with(this).load("https://picsum.photos/200/300/?random").into(      )
      btnShow.setOnClickListener {
          var vw : View =  layoutInflater.inflate(
                  R.layout.image,
                  null,
                  false
          )
          var img: ImageView=  vw.findViewById<ImageView>(R.id.images)
//          Glide.with(this).load("https://picsum.photos/200/300/?random").into(img)
          Picasso.get().load("https://picsum.photos/1000/1000?image="+i++).into(img)
     gridimages.addView(vw)
      }

    }
}
