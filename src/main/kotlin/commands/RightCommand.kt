package commands

import Directions

class RightCommand: Command() {
    override fun updateDirection(direction: Directions) = direction.rotatedRight()
}
