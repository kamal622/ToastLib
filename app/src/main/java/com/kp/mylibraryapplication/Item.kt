package com.kp.mylibraryapplication

class Item {

    var id: String? = null
    var name: String? = null
    var description: String? = null
    var isSelected = false

    val isSelect: Unit
        get() {
            isSelected = true
        }

    override fun toString(): String {
        return """{ 
	 id='$id',
	 name='$name',
	 description='$description',
	 isSelected=$isSelected}"""
    }

}
