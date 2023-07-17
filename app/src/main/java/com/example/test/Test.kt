package com.example.test

class Test {


    fun division(a: String, b: String): String {
        var result = ""
        if (a == "0" || b == "0") {
            result = "невазможно делить"
        } else {
            result = (a.removeComma().toDouble() / b.removeComma().toDouble()).toInt().toString()
        }
        return result
    }

    fun String.removeComma(): String = this.replace(",", "")
}