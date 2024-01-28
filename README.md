This repository contains a simple javafx application that exposes a bug in openjdk-21 (Oracle OpenJDK version 21), from there infecting other openjdk-21 versions.

In the process of upgrading an OpenSource, multi-platform scientific software package (https://github.com/G-String-Legacy/GS_MV) to Java 21, access to log files was facilitated by inclusion of a **FileChooser.ExtensionFilter**. During due-diligence testing it turned out that this extension filter did not function for MacOS (Sonoma), while it worked properly for Linux and Windows platforms.

This bug was reported to http://bugs.java.com/. They requested  a short example application, which was returned to them within 2 hours. To my consternation I found out that the decision had already been made to ignore the bug!

![This was the Oracle response: ](https://github.com/Papa-26/ExtensionBug/blob/main/ExtensionFilterBug/TestFiles/OpenjdkExFilBug.png)

Not only shows this reaction that Oracle does not seem to care about the quality of their product, they also show great disrespect for the efforts of developers by requesting additional work, while they had already made their decision.

The attached little software enables interested parties to experiment with this bug on various platforms. Included are two test files (test.log, and test.grb in folder TestFiles). They should be placed in the user home directory. On Linux and Windows, only the file with the extension '.log' will show up, on macs both will show.
