package commands

import Position

class ForwardCommand: Command() {
    override fun updatePosition(position: Position) = position.withDeltaY(1)
}
