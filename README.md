# Duck Behavior Simulation

## Project Overview
This project demonstrates the behavior of different types of ducks using the Strategy Design Pattern. It includes swim and fly behaviors that can be dynamically assigned to different ducks.

## Class Structure
The program follows the class diagram as specified in "Head First Design Patterns" and extends it with additional behaviors for swimming.

### Interfaces:
- `FlyBehavior`: Defines the `fly()` method for different flying behaviors.
- `SwimBehavior`: Defines the `swim()` method for different swimming behaviors.

### Concrete Classes:
- `Fly`: Implements `FlyBehavior` and provides the functionality to fly.
- `NotFly`: Implements `FlyBehavior` and provides the functionality for ducks that cannot fly.
- `Swim`: Implements `SwimBehavior` to allow ducks to swim.
- `Float`: Implements `SwimBehavior` to allow ducks to float.
- `Drown`: Implements `SwimBehavior` to simulate a drowning duck.

### Duck Superclass and Subclasses:
- `Duck` (Abstract): Contains `FlyBehavior` and `SwimBehavior` references.
- `MallardDuck`: Implements `Duck`, uses `Fly` and `Swim` behaviors.
- `RedheadDuck`: Implements `Duck`, uses `Fly` and `Swim` behaviors.
- `RubberDuck`: Implements `Duck`, uses `NotFly` and `Float` behaviors.
- `DecoyDuck`: Implements `Duck`, uses `NotFly` and `Float` behaviors.
- `DrowningDuck`: Implements `Duck`, uses `NotFly` and `Drown` behaviors.

## Functionality
1. Each duck object is assigned specific swimming and flying behaviors dynamically.
2. The `display()` method prints each duck's behavior.
3. The behavior of a duck can be changed at runtime using setter methods.

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/rayl_tanmay2/Duck.git
   ```
2. Open the project in IntelliJ IDEA (Professional Edition recommended for class diagram support).
3. Run `Main.java` to execute the program.

## Usage
1. Instantiate different types of ducks.
2. Call their `fly()` and `swim()` methods to see their behavior.
3. Modify their behavior dynamically if needed.

## Coding Guidelines Followed
- Proper class separation and single responsibility principle.
- Interfaces used to ensure flexibility and adherence to the Strategy pattern.
- Code is documented with appropriate comments.
- Each operation is implemented as a separate function.

## Commit History Guidelines
- Each Java file is committed separately.
- Each function has its own commit message.

## Class Diagram
A class diagram representing the entire structure is created using IntelliJ IDEA.

## Author
- **Name:** Tanmay Joshi
- **PRN:** 23070126134 
- **Batch:** AIML B3  



