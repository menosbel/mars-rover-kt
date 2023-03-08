enum class Directions {
    North {
        override fun rotatedRight() = East
        override fun rotatedLeft() = West
    },
    West {
        override fun rotatedRight() = North
        override fun rotatedLeft() = South
    },
    East {
        override fun rotatedRight() = South
        override fun rotatedLeft() = North
    },
    South {
        override fun rotatedRight() = West
        override fun rotatedLeft() = East
    };

    abstract fun rotatedRight(): Directions
    abstract fun rotatedLeft(): Directions
}
