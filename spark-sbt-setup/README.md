
Simple Test Project to configure Spark with Scala using SBT

Steps (Assumption SBT is installed and configured)
===================================================

1. Create the project Directory -> mkdir /path/spark-sbt-setup
2. cd spark-sbt-setup
3. mkdir -p src/main/scala
4. sbt eclipse
5. Import into Eclipse
6. Inside imported project create sample.sbt and add the dependencies (refer project files)
7. sbt
8. reload
9. eclipse with-source=true
10. Reload project in eclipse.

Note: Sometimes dependecies might not get resolved in eclipse, we can use ctrl+shift+o cmd to resolve

