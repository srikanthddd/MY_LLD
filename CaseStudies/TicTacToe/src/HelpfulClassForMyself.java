public class HelpfulClassForMyself {
    // How Game works :
        // 1. Start a game
        // 2. Create players, choose symbols etc..
        // 3. Determine the size and create board.
        // 4. Decide winning rules.

    // Rules for yourself
        // 1. Make classes with private attributes
        // 2. Create getters and setters for those
        // 3. Always create a constructor that initializes those attributes
        // 4. Use builder pattern, if there are many attributes
        // 5. Use strategy pattern, if you need to change strategy during the runtime
        // 6. Use factory pattern, if you need to create object based on the input.

    // Game Class uses builder pattern, because
        // 1. Lot of classes
        // 2. Need validation (Every player must have a different Symbol)

    // Client -> Main -> Controller -> Models
        // The client basically interacts with the main class (giving inputs), then main class
            // interacts with controller and then it interacts with models.


    // Assignment
    // 1. Implement All winning strategies
    // 2. After the game status is no longer IN_PROGRESS, print if draw => draw
        // else, print congrats {playerName}

}
