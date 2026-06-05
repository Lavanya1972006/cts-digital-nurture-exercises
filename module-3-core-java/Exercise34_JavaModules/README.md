# Exercise34 - Java Modules

## Objective
Demonstrate Java Module System using two modules:
- com.utils
- com.greetings

---

## Project Structure
Exercise34_JavaModules/
- com.utils
- com.greetings

---

## Compilation

javac -d out --module-source-path . com.utils/Util.java com.greetings/Main.java

---

## Run

java --module-path out -m com.greetings/com.greetings.Main

---

## Output
Hello Cognizant