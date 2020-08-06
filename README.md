# Python and Pytest

[![N|Solid](https://docs.pytest.org/en/stable/_static/pytest1.png)](https://docs.pytest.org/en/stable/)

The pytest framework makes it easy to write small tests, yet scales to support complex functional testing for applications and libraries:
Path: C:\Users\ASHUTOSH SINGH\PycharmProjects\Selenium-Python-Practice\PytestSessions
Files Name:

test_demo1.py
test_demo2.py
test_demo3.py

**pip install --upgrade pip**

To Run entire TCs from a given package and it will execute to those file which have either START/END have "test" --> Keyword

**py.test test_demo2.py**

-k is identifier like that a Group in TestNg

The below command will execute all those TCs which have a login keyword
**py.test -k login -v**

**Commands**
  - py.test test_demo2.py
  - py.test -k login -v

# Reference
Video Links: https://youtu.be/CNB1iRv5hZo


# Parallel Execution
To run in the Parallel mode install the below pkg from  Terminal
- pip install pytest-xdist
 
For running in Parallel mode
 - py.test -n 5
 
 **The below command will  execute all the Test Cases which is having a login keyword :**
 - @pytest.mark.login
 
 Video Links: https://youtu.be/5t36B95MxY8
