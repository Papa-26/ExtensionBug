This repository contains a simple javafx application that exposes a bug in openjdk-21 (Oracle OpenJDK version 21) and from there infecting other openjdk-21 versions:

The ### FileChooser.ExtensionFilter ### works in Linux and Windows applications, but fails in macos (14) Sonoma.
