This repository contains a simple javafx application that exposes a bug in openjdk-21 (Oracle OpenJDK version 21), from there infecting other openjdk-21 versions.

In the process of upgrading an OpenSource, multi-platform scientific software package (https://github.com/G-String-Legacy/GS_MV) to Java 21, access to log files was additionally facilitated by inclusion of a **FileChooser.ExtensionFilter**. During due-diligence testing it turned out that this extension filter did not function for MacOS (Sonoma), while it worked properly for Linux and Windows platforms. In fact, https://bugs.openjdk.org/ documents at least 26 issues with this class.

This bug was reported to http://bugs.java.com/. They requested  a short example application, which was returned to them within 2 hours. To my consternation I found out that at this point the decision had already been made to ignore the bug!

![This was the Oracle response: ](https://github.com/Papa-26/ExtensionBug/blob/main/ExtensionFilterBug/TestFiles/OpenjdkExFilBug.png)

This reaction not only demonstates Oracle's attention to the quality of their products, it also shows their respect for the efforts of developers by requesting additional work, while they had already made their decision.

The attached little software enables interested parties to experiment with this bug on various platforms. Included are two test files (test.log, and test.grb in folder TestFiles). They should be placed in the user home directory, or any directory of your choice. On Linux and Windows, only the file with the extension '.log' will show up, on macs, however, both will show.
