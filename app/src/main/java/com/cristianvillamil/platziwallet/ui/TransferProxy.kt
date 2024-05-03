package com.cristianvillamil.platziwallet.ui

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 1000000.0
    val MIN_TRANSFER_AMOUNT = 10.0

    fun checkTransfer(amount: Double): String {
        return when {
            amount > MAX_TRANSFER_AMOUNT -> {
                "The amount is higher than the maximum allowed"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "The amount is lower than the minimum allowed"
            }
            else -> {
                doTransfer(amount)
                "The transfer is correct"
            }
        }
    }

    private fun doTransfer(amount: Double) {
        // Code to do the transfer

    }
}