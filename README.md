# COP2047 - Python Programming

Course lab solutions for **COP2047 (FIU)**. Every lab is implemented in **both Python and Java**.

- **Python** labs are written and run in **PyCharm**.
- **Java** labs are written and run in **IntelliJ IDEA**.

## Repository structure

```
COP2047-Python-Programming/
├── README.md
├── .gitignore
├── python/                # Open this folder in PyCharm
│   ├── lab01/    lab01.py
│   ├── lab1_5/   lab1_5.py
│   └── lab02/    lab02.py
└── java/                  # Open this folder in IntelliJ IDEA
    ├── lab01/    Lab01.java
    ├── lab1_5/   Lab1_5.java
    └── lab02/    Lab02.java
```

## Getting the repo

```powershell
git clone <repo-url>
cd COP2047-Python-Programming
```

---

## Running Python labs in PyCharm

1. Open **PyCharm** → **File ▸ Open** and select the **`python`** folder (open this subfolder, not the whole repo, so PyCharm treats it as the project root).
2. Configure the interpreter if prompted: **File ▸ Settings ▸ Project ▸ Python Interpreter** → select your Python 3.x interpreter (or create a virtualenv).
3. In the **Project** tool window, open the lab you want, e.g. `lab01/lab01.py`.
4. Click the green **▶ Run** arrow next to `main`, or right-click the file → **Run 'lab01'**.
5. Output appears in the **Run** tool window at the bottom.

**Run from a terminal instead:**

```powershell
python python/lab01/lab01.py
```

---

## Running Java labs in IntelliJ IDEA

1. Open **IntelliJ IDEA** → **File ▸ Open** and select the **`java`** folder.
2. Set the SDK if prompted: **File ▸ Project Structure ▸ Project** → choose a **JDK 17+**.
3. Each lab folder holds one class whose name matches the file (`Lab01.java` → `class Lab01`).
4. Open the file and click the green **▶ Run** arrow next to `main`, or right-click the file → **Run 'Lab01.main()'**.
5. Output appears in the **Run** tool window at the bottom.

**Run from a terminal instead (JDK 17+):**

```powershell
cd java/lab01
javac Lab01.java
java Lab01
```

---

## Labs

| Lab     | Due    | Python (PyCharm) | Java (IntelliJ) |
| ------- | ------ | ---------------- | --------------- |
| Lab 1   | Aug 30 | `python/lab01`   | `java/lab01`    |
| Lab 1.5 | Aug 30 | `python/lab1_5`  | `java/lab1_5`   |
| Lab 2   | Sep 6  | `python/lab02`   | `java/lab02`    |

## Adding a new lab

1. **Python:** create `python/labNN/labNN.py` and open it in PyCharm.
2. **Java:** create `java/labNN/LabNN.java` with a matching `public class LabNN` and open it in IntelliJ.
3. Add a row to the table above.

## Notes

- Keep the Java class name identical to its file name, or IntelliJ/`javac` will not compile it.
- `.gitignore` already excludes Python (`__pycache__/`, venvs) and Java (`*.class`, `out/`, `bin/`) build artifacts, plus IDE folders.
