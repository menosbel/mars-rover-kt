package commands

import Position

class BackwardCommand: Command() {
    override fun updatePosition(position: Position) = position.withDeltaY(-1)
}
