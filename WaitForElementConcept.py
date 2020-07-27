from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as ec
from webdriver_manager.chrome import ChromeDriverManager

import time

driver = webdriver.Chrome(ChromeDriverManager().install())
driver.get("https://www.freshworks.com/")

wait= WebDriverWait(driver, 10)
footer_links_list = wait.until(ec.presence_of_all_elements_located((By.CSS_SELECTOR, 'ul.footer-nav li')))
print(len(footer_links_list))

for ele in footer_links_list:
    print(ele.text)

#wait.until(ec.frame_to_be_available_and_switch_to_it((By.ID, "")))




#wait.until(ec.element_located_to_be_selected('checkbox'))