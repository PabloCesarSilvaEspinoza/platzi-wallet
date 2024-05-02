package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = 0
        val TYPE_SUCCESS = 1
    }

    fun getDialogMessage(context: Context, type: Int): AlertDialog.Builder {
        val msg = when(type) {
            TYPE_ERROR -> "Ha ocurrido un error"
            TYPE_SUCCESS -> "Operación exitosa"
            else -> "Operación desconocida"
        }

        return AlertDialog.Builder(context).setMessage(msg)
    }
}