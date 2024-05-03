package com.cristianvillamil.platziwallet.ui.home.data

import com.cristianvillamil.platziwallet.ui.home.view.UserViewModel

class UserAdapter(
    val userResponse: UserResponse
) {
    fun getUserViewModel(): UserViewModel {
        return UserViewModel(
            userResponse.name,
            userResponse.userPhotoURL
        )
    }
    
}