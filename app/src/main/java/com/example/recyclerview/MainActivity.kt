package com.example.recyclerview

import Adapter.CityAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listaCitta= listOf(Mondo("https://065551.it/wp-content/uploads/2019/05/visitare-roma-di-notte-min.png","Roma","Descrizione Roma",1)
            , Mondo("https://lh3.googleusercontent.com/proxy/oQIE06loUGiOrDnM4qGOuXA23fgpOenNjM2bOBeff9NZJ4C41GuXzvXR02tGcwRY-s-SYFg047MyU85fCXpH_q9jvcXVt_-ZcrPN9W4UauDXmV4uy_jSXlvO0QXMrmkO6szZIeey9hhzfdoZYqU","Londra","Descrizione Londra",2)
            , Mondo("https://images.fidhouse.com/fidelitynews/wp-content/uploads/sites/9/2015/01/o.173363.jpg","Tokyo","Descrizione Tokyo",3)
            , Mondo("https://viviparigi.it/images/viviparigi/parigi_di_notte/Parigi_di_notte.jpg","Parigi","Descrizione Parigi",4)
        )
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=CityAdapter(listaCitta,this)
    }

}