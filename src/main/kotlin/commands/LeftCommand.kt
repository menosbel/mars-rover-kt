package commands

import Directions

class LeftCommand: Command() {
    override fun updateDirection(direction: Directions) = direction.rotatedLeft()
}
