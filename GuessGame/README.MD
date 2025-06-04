# 🎯 Guess Game

A simple guessing game in Java where three players compete to guess a randomly generated secret number.

## 📋 Description

**Guess Game** is a game where the computer chooses a random number between 0 and 9, and three players make guesses until someone hits the secret number. The game continues round after round until at least one player guesses correctly.

## 🎮 How It Works

1. The game generates a random secret number between 0 and 9
2. Three players automatically make guesses each round
3. The game compares the guesses with the secret number
4. If someone guesses correctly, the game ends and declares the winner(s)
5. If no one guesses correctly, a new round begins

## 🏗️ Project Structure

The project is organized into three main classes:

```
GuessGame/
├── Player.java        # Class representing a player
├── GuessGame.java     # Main game logic
└── GameLauncher.java  # Program entry point
```

### Player.java
- Stores player information (name, guess, winner status)
- `Guess()` method to generate random guesses
- Getters and setters to access attributes

### GuessGame.java
- Controls the main game flow
- Manages the three players
- Implements comparison and victory logic

### GameLauncher.java
- Program entry point
- Instantiates and starts the game

## 🚀 How to Run

1. **Compile the project:**
   ```bash
   javac GuessGame/*.java
   ```

2. **Run the game:**
   ```bash
   java GuessGame.GameLauncher
   ```

## 📊 Sample Output

```
=== GUESS GAME ===
Starting the game...

Thinking of a number between 0 and 9..
Number to guess: 7
Player 1 guessed: 3
Player 1 guessed 3
Player 2 guessed: 8
Player 2 guessed 8
Player 3 guessed: 1
Player 3 guessed 1
No right answers! Let's try again.
Number to guess: 7
Player 1 guessed: 7
Player 1 guessed 7
Player 2 guessed: 2
Player 2 guessed 2
Player 3 guessed: 9
Player 3 guessed 9
We have a winner!
Player 1 got it right? true
Player 2 got it right? false
Player 3 got it right? false
Game is over.

Thanks for playing!
```

## 🎲 Features

- **Randomness**: Both the secret number and guesses are randomly generated
- **Multiple winners**: More than one player can win in the same round
- **Simple interface**: Clear console output showing game progress
- **Encapsulation**: Proper use of access modifiers (private/public)

## 🛠️ Technologies Used

- **Java**: Main programming language
- **Math.random()**: For random number generation
- **Object-Oriented Programming**: Classes, objects, encapsulation

## 📝 Possible Improvements

- Add graphical user interface (GUI)
- Allow user to choose number of players
- Implement different difficulty levels
- Add scoring system
- Save game history

## 👨‍💻 Author

Developed as a Java learning project.

*Have fun playing! 🎉*