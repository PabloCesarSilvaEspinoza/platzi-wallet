package com.cristianvillamil.platziwallet.ui.home

interface HomeContract {
    interface view {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfers: List<FavoriteTransfer>)
    }

    interface Presenter {
        fun retrieveFavoriteTransfers()

    }

    interface OnResponseCallback {
        fun onResponse(response: List<FavoriteTransfer>)
    }
}