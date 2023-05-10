import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var currentRoom = Room.DUSTY_CASTLE_ROOM
    
    while (true) {
        println("You are in ${currentRoom.description}")
        println(currentRoom.directions)
        print("What direction? ")
        
        val input = scanner.nextLine().trim().toLowerCase()
        val newRoom = currentRoom.getRoomInDirection(input)
        
        if (newRoom == null) {
            println("Can't go that way.")
        } else {
            currentRoom = newRoom
        }
    }
}

enum class Room(val description: String, val directions: String, val north: Room?, val south: Room?, val east: Room?, val west: Room?) {
    DUSTY_CASTLE_ROOM("a dusty castle room.", "Passages lead to the north and south.", null, ARMORY, null, null),
    ARMORY("the armory.", "There is a room off to the south.", null, null, null, DUSTY_CASTLE_ROOM),
    TORCH_LIT_HALLWAY("a torch-lit hallway.", "There are rooms to the east and west.", BEDROOM, KITCHEN, EAST_ROOM, WEST_ROOM),
    BEDROOM("a bedroom. A window overlooks the castle courtyard.", "A hallway is to the west.", null, null, TORCH_LIT_HALLWAY, null),
    KITCHEN("the kitchen. It looks like a roast is being made for supper.", "A hallway is to the east.", null, null, null, TORCH_LIT_HALLWAY);

    fun getRoomInDirection(direction: String): Room? {
        return when (direction) {
            "n" -> north
            "s" -> south
            "e" -> east
            "w" -> west
            else -> null
        }
    }
    
    companion object {
        private val EAST_ROOM = Room("an east room.", "There is a hallway to the west.", null, null, null, TORCH_LIT_HALLWAY)
        private val WEST_ROOM = Room("a west room.", "There is a hallway to the east.", null, null, TORCH_LIT_HALLWAY, null)
    }
}
