package commands

import Directions
import Position

abstract class Command {
    open fun updatePosition(position: Position) = position
    open fun updateDirection(direction: Directions) = direction
}
