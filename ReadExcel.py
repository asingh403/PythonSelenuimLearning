import xlrd

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec
from webdriver_manager.chrome import ChromeDriverManager

import time

driver = webdriver.Chrome(ChromeDriverManager().install())
driver.implicitly_wait(10)

driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/")

url = driver.find_element(By.ID, "Form_submitForm_subdomain")
first_name = driver.find_element(By.ID, "Form_submitForm_FirstName")
last_name = driver.find_element(By.ID, "Form_submitForm_LastName")
email_id = driver.find_element(By.ID, "Form_submitForm_Email")
job_title = driver.find_element(By.ID, "Form_submitForm_JobTitle")
comp_name = driver.find_element(By.ID, "Form_submitForm_CompanyName")
contact = driver.find_element(By.ID, "Form_submitForm_Contact")
total_emp = driver.find_element(By.ID, "Form_submitForm_NoOfEmployees")
industry = driver.find_element(By.ID, "Form_submitForm_Industry")
cont_name = driver.find_element(By.ID, "Form_submitForm_Country")

workbook = xlrd.open_workbook("DataFile.xlsx")
sheet = workbook.sheet_by_name("registration")

# get total  no of rows

rowCount = sheet.nrows
colCount = sheet.ncols
print(rowCount)
print(sheet.ncols)

'''Here it'll fill the registration page feilds'''

for curr_row in range(1, rowCount):
    urlValue = sheet.cell_value(curr_row, 0)
    firstName = sheet.cell_value(curr_row, 1)
    lastName = sheet.cell_value(curr_row, 2)
    emailID = sheet.cell_value(curr_row, 3)
    jobTitle = sheet.cell_value(curr_row, 4)
    company = sheet.cell_value(curr_row, 5)
    phoneNumber = sheet.cell_value(curr_row, 6)
    totalEmp = sheet.cell_value(curr_row, 7)
    industry_name = sheet.cell_value(curr_row, 8)
    countryName = sheet.cell_value(curr_row, 9)

    # first it will clear the existing value then fill again.
    url.clear()
    url.send_keys(urlValue)
    first_name.clear()
    first_name.send_keys(firstName)
    last_name.clear()
    last_name.send_keys(lastName)
    email_id.clear()
    email_id.send_keys(emailID)
    job_title.clear()
    job_title.send_keys(jobTitle)
    comp_name.clear()
    comp_name.send_keys(company)
    contact.clear()
    contact.send_keys(phoneNumber)
    # total_emp.send_keys(totalEmp)
    # industry.send_keys(industry_name)
    # countryName.send_keys(cont_name)
    print(url, firstName, lastName, emailID)

    time.sleep(3)
