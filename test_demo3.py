import pytest


def test_m1():
    a = 3
    b = 4
    assert a + 1 == b, "Test Failed"
    assert a == b, "test failed as a is not eq to b"


def test_m2():
    name = "selenium"
    assert name.upper() == "SELENIUM"


def test_m3():
    assert True


def test_login():
    assert "admin" == "admin"


'''we can execute or testCases like that also in terminal'''
# py.test PytestSessions/test_demo3.py
