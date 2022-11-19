# Compile application
javac DriverExec.java

# Build class file
java DriverExec

# Test files
javac -cp junit-4.12.jar;. AddTrain.java
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore AddTrain

javac -cp junit-4.12.jar;. GetTrain.java
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore GetTrain

javac -cp junit-4.12.jar;. MoveTrain.java
java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore MoveTrain