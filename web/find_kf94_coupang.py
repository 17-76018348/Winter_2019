# -*- coding: utf-8 -*-
"""
Created on Tue Mar  3 14:24:07 2020

@author: didrm
"""
import matplotlib.pyplot as plt
from selenium import webdriver
a = [1,2,3,4]

import sys
path = "C:/Users\didrm/Downloads/chromedriver.exe"
driver = webdriver.Chrome(path)

driver.get('https://www.coupang.com/np/search?q=kf94+%EB%8C%80%ED%98%95&brand=&offerCondition=&filter=&availableDeliveryFilter=&filterType=rocket%2Ccoupang_global&isPriceRange=false&priceRange=&minPrice=&maxPrice=&page=1&trcid=&traid=&filterSetByUser=true&channel=user&backgroundColor=&component=&rating=0&sorter=scoreDesc&listSize=36&rocketAll=true')
while(True):
    a = input()
    if a == "go":
        break


while(1):
    driver.get('https://www.coupang.com/np/search?q=kf94+%EB%8C%80%ED%98%95&brand=&offerCondition=&filter=&availableDeliveryFilter=&filterType=rocket%2Ccoupang_global&isPriceRange=false&priceRange=&minPrice=&maxPrice=&page=1&trcid=&traid=&filterSetByUser=true&channel=user&backgroundColor=&component=&rating=0&sorter=scoreDesc&listSize=36&rocketAll=true')
    element = driver.find_elements_by_class_name("price-area")
    for i in range(10):
        if element[i].text[-4:] != "일시품절":
            element = driver.find_elements_by_class_name("search-product-wrap")
            element[0].click()
            plt.plot(a)
            plt.show()
            driver.close()
            sys.exit()
            




driver.get('https://www.coupang.com/np/search?q=kf94+%EB%8C%80%ED%98%95&brand=&offerCondition=&filter=&availableDeliveryFilter=&filterType=rocket%2Ccoupang_global&isPriceRange=false&priceRange=&minPrice=&maxPrice=&page=1&trcid=&traid=&filterSetByUser=true&channel=user&backgroundColor=&component=&rating=0&sorter=scoreDesc&listSize=36&rocketAll=true')

    
    

# driver.close()u