class Position(val x: Int, val y: Int) {
    fun withY(newY: Int) = Position(x, newY)

    fun withDeltaY(delta: Int) = withY(y + delta)
}
