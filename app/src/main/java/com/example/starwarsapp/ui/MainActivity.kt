package com.example.starwarsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.starwarsapp.R
import com.example.starwarsapp.model.CharacterDetails
import com.example.starwarsapp.model.CharacterListItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val characterLuke = CharacterListItem("Maria", 24)
        val character2 = CharacterListItem("Gigel", 99)
        val characterDetails = CharacterDetails("Mihai", 1968, 174, "alien", "unknown", "Marte", 67 )

        println("Mara" + " " + characterLuke.age)
        println("Mara" + " " + character2.name)

        findViewById<TextView>(R.id.text2).text = characterDetails.language_of_species

    }
}