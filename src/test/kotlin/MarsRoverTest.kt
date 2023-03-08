import Directions.North
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class MarsRoverTest {
    @Test
    fun `forward command moves one to the front`() {
        val marsRover = marsRoverAt(Position(0, 0))

        val newPosition = marsRover.execute('F')

        assertThat(newPosition).isEqualTo(positionedAt("0:1"))
    }

    @Test
    fun `rover's position is updated after moving`() {
        val marsRover = marsRoverAt(Position(0, 0))
        marsRover.execute('F')

        val newPosition = marsRover.execute('F')

        assertThat(newPosition).isEqualTo(positionedAt("0:2"))
    }

    @Test
    fun `backward command moves one to the back`() {
        val marsRover = marsRoverAt(Position(0, 1))

        val newPosition = marsRover.execute('B')

        assertThat(newPosition).isEqualTo(positionedAt("0:0"))
    }

    @ParameterizedTest
    @CsvSource (
        "East, N",
        "North, W",
        "West, S",
        "South, E"
    )
    fun `left command rotates rover to the left`(initialDirection: Directions, endDirection: String) {
        val marsRover = marsRoverAt(Position(3, 7), initialDirection)

        val output = marsRover.execute('L')

        assertThat(output).isEqualTo("3:7:$endDirection:OK")
    }

    @ParameterizedTest
    @CsvSource (
        "East, S",
        "North, E",
        "West, N",
        "South, W"
    )
    fun `right command rotates rover to the right`(initialDirection: Directions, endDirection: String) {
        val marsRover = marsRoverAt(Position(1, 2), initialDirection)

        val output = marsRover.execute('R')

        assertThat(output).isEqualTo("1:2:$endDirection:OK")
    }

    private fun positionedAt(position: String) = "$position:N:OK"

    private fun marsRoverAt(position: Position, direction: Directions = North) = MarsRover(position, direction)
}
