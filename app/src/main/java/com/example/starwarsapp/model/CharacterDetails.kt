package com.example.starwarsapp.model

class CharacterDetails(
        var name: String,
        val birth_year: Int,
        var height: Int,
        val species_name: String,
        val language_of_species: String,
        val homeworld_of_species: String,
        var population: Int
) {

    fun heightInInches(): Int {
        return height + 1
    }

    fun mihai() {
        name = "Mihai"
    }

    fun transformareInlocuire() {
        if (height > 160) {
            height = 160
        }
    }

    fun kilBill() {
        if (population > 10 && population < 80) {
            population = 0
        }

    }
}
