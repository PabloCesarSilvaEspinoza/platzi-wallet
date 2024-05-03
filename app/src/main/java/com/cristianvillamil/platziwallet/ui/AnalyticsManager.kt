package com.cristianvillamil.platziwallet.ui

class AnalyticsManager {
    fun registerTransfer(token: String, amount: Double) {
        println("Transferencia registrada en el sistema de analitica. Token: $token, Monto: $amount")
    }
}