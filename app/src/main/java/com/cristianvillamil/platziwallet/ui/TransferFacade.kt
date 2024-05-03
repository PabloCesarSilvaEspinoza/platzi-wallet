package com.cristianvillamil.platziwallet.ui

class TransferFacade {
    val analitycsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val transferManager = TransferManager()

    fun transfer() {
        val token = securityManager.getToken()
        analitycsManager.registerTransfer(token, 100.0)
        transferManager.trasnfer(token)
    }
}