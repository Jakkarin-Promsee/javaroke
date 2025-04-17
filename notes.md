# Gradle command For Mac or Linux

```bash
./gradlew build      # compiles everything
./gradlew run        # runs the Main class
./gradlew test       # runs unit tests
```

# Gradle command For Window

```powershell
./gradlew.bat build # compiles everything
./gradlew.bat run   # runs the Main class
./gradlew.bat test  # runs unit tests
```

# Graddle .gitignore

```gitignore
# Gradle

.gradle/
build/

# IDEs

.idea/
.vscode/

# Java

\*.class
```

# Abstract Queue Plan

- class NodeSong

  - string id

- class NodeLyric

  - string time
  - string line

- class abstract Node<T> // Recipt T as NodeSong or NodeLyric class
- class abstract Queue<T>

  - class QueueSong extend Queue
    - manage NodeSong on Queue
  - class QueueLyric extend Queue
    - manage NodLyric on Queue
