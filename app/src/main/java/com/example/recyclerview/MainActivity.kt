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
        val listaCitta= listOf(Mondo("https://065551.it/wp-content/uploads/2019/05/visitare-roma-di-notte-min.png","Roma","È la città con la più alta concentrazione di beni storici e architettonici al mondo",1)
            , Mondo("https://lh3.googleusercontent.com/proxy/oQIE06loUGiOrDnM4qGOuXA23fgpOenNjM2bOBeff9NZJ4C41GuXzvXR02tGcwRY-s-SYFg047MyU85fCXpH_q9jvcXVt_-ZcrPN9W4UauDXmV4uy_jSXlvO0QXMrmkO6szZIeey9hhzfdoZYqU","Londra","La sua estensione territoriale la rende la terza città più estesa d'Europa, preceduta da Mosca e Istanbul",2)
            , Mondo("https://images.fidhouse.com/fidelitynews/wp-content/uploads/sites/9/2015/01/o.173363.jpg","Tokyo","È la capitale del Giappone, situata nella regione di Kantō sul lato sud-orientale dell'isola principale giapponese, Honshū, e comprendente anche le isole Izu e Ogasawara",3)
            , Mondo("https://viviparigi.it/images/viviparigi/parigi_di_notte/Parigi_di_notte.jpg","Parigi","È la capitale e la città più popolata della Francia, capoluogo della regione dell'Île-de-France e l'unico comune a essere nello stesso tempo dipartimento",4)
            , Mondo("https://images.fidhouse.com/fidelitynews/wp-content/uploads/sites/9/2015/01/45.jpg","New York ","È una città degli Stati Uniti d'America situata nello stato di New York",5)
            , Mondo("https://image.nanopress.it/viaggi/fotogallery/780X0/71077/fuochi-a-rio.jpg","Rio","È una città del Brasile, capitale dello Stato di Rio de Janeiro, la seconda città del Brasile dopo San Paolo",6)
            , Mondo("https://lh3.googleusercontent.com/proxy/sHjxs0rYfs7FbMVvaIaY2gE5FMJQoZ0f9GgTXiKkbPHrx-E6lMW_94_zr0j2tgCau_c6TTcfRZtNuK8CyJSt9xVLEHf6pCrhBYh3fuO6ri7NqV6EL0ChHKtTw4a6dBpRRnRpJbq-L21b8EjA3Y3IGivdwBfI8hBjvTtsSLEodoU","Bangkok","È la capitale e la città più estesa e popolosa della Thailandia, situata lungo il fiume Chao Phraya, nei pressi del golfo della Thailandia",7)
        )
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=CityAdapter(listaCitta,this)
    }

}