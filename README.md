# GuessGame – Versions

This repository contains different versions of the "GuessGame" during my first 2 weeks of learning Java (In school)

---
**Versions**

#v1 — Basic, single-file version

-Introduces **three levels* with increasing range and attempts:
  - Level 1: `1–50`, 8 attempts  
  - Level 2: `1–100`, 7 attempts  
  - Level 3: `1–1000`, 10 attempts

  **Structure**  
 - Simple guessing game: the player guesses until the correct number is found.
 - Logic lives inside `main`.
 - Focus of learning: Scanner, if/else, for-loops.

**What it taught me**
- Reading user input
- Validating ranges
- Basic game loop reasoning

---

**v2** — Multi-level & modular version (today’s work)
- Introduces **level 4**:
  - Level 1: `1–50`, 8 attempts  
  - Level 2: `1–100`, 7 attempts  
  - Level 3: `1–1000`, 10 attempts  
  - Level 4: `1–1,000,000`, 20 attempts
- Clean separation of concerns:
  - `Levels.playLevel(level, min, max, attempts, sc)` returns a `Result` (`WIN`, `LOSE`, `QUIT`)
  - `AskPlayAgain.playAgain()` handles restart/exit prompts
  - Enum `Result.Results` centralizes game outcomes
- Game loop: If you **lose or quit** at any level, you’re asked to **play again**. If yes, the game restarts from **level 1**.  
  Winning all four levels prints a final **congratulations** and ends the game.

**What it taught me**
- **Methods** and modular design (splitting logic into focused units)
- Returning **result codes** (enum) to control the flow cleanly
- Designing a level progression and a restart loop
