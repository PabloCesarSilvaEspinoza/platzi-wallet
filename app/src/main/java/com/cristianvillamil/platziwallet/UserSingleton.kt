package com.cristianvillamil.platziwallet

class UserSingleton private constructor() {

    var username = "UserName"

    companion object {
        private var instance: UserSingleton? = null

        fun getIsntance(): UserSingleton {
            if (instance == null)
                instance = UserSingleton()
            return instance as UserSingleton
        }
    }


}

/*
Otra forma de crear un objeto Singleton de forma mas simple es utilizando la palabra clave object

object UserSingleton {
    var username = "UserName"
}

En este caso no es necesario crear un constructor privado ni una variable de instancia, ya que el objeto es un Singleton por defecto.
Para utilizarlo solo se debe acceder a la propiedad username de la siguiente forma:

UserSingleton.username


 */