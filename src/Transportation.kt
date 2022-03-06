class Transportation<T:Transport>(val t:T?) {
    override fun toString(): String {
        return "$t"
    }
}