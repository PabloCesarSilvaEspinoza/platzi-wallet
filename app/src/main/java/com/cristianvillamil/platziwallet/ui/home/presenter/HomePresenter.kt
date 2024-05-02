package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view: HomeContract.view) : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retriveFavoriteTransfersFromCache(object : HomeContract.OnResponseCallback {

            override fun onResponse(response: List<FavoriteTransfer>) {
                UserSingleton.getIsntance().username = "Cristian"
                val user = User.Builder()
                        .setUserName("Pablo")
                        .setPassword("1234")
                        .build()

                view.hideLoader()
                view.showFavoriteTransfers(response)
            }
        })
    }
}