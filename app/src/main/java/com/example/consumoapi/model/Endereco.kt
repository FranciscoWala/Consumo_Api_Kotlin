package com.example.consumoapi.model

import com.google.gson.annotations.SerializedName

data class Endereco (
    val cep: String = "",

    //Logradouro
    @SerializedName("logradouro")
    val rua: String = "",
    //Localidade
    @SerializedName("localidade")
    val cidade: String = "",

    val bairro: String = "",
    val uf: String = ""
)