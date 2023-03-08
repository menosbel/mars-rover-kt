package commands

class CommandFactory {
    fun create(command: Char) = when (command) {
        'F' -> ForwardCommand()
        'B' -> BackwardCommand()
        'L' -> LeftCommand()
        'R' -> RightCommand()
        else -> throw Throwable("Invalid command $command")
    }
}