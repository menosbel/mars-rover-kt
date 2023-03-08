import commands.CommandFactory

class MarsRover(var position: Position, var direction: Directions) {
    private val commandFactory = CommandFactory()

    fun execute(commandSymbol: Char): String {
        process(commandSymbol)
        return generateOutput()
    }

    private fun process(commandSymbol: Char) {
        val command = commandFactory.create(commandSymbol)
        direction = command.updateDirection(direction)
        position = command.updatePosition(position)
    }

    private fun generateOutput() = "${position.x}:${position.y}:${direction.name.first()}:OK"
}
