package com.example.wazitoecommerce.models

class User {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var it:String = ""

    constructor(name: String, email: String, password: String, it: String) {
        this.name = name
        this.email = email
        this.password = password
        this.it = it
    }
    constructor()
}