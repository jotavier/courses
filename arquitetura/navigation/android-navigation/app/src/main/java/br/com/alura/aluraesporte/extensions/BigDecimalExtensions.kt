package br.com.alura.aluraesporte.extensions

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.formataParaMoedaBrasileira(): String {
    val formatoBrasileiro = DecimalFormat
        .getCurrencyInstance(Locale("pt", "br"))
    return formatoBrasileiro
        .format(this)
}