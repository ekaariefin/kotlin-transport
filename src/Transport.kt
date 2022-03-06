interface Transport {
    var weight: Float
    var capacity: String
    var speed: Float

    fun load() {
        println("Goods are loaded successfully")
    }

    fun unload() {
        println("Goods are unloaded successfully")
    }

    fun ship()
}