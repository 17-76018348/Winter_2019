#%%
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.naver.com")  

bsObject = BeautifulSoup(html, "html.parser") 


print(bsObject)

#%%

from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.naver.com")  

bsObject = BeautifulSoup(html, "html.parser") 


print(bsObject.head.title)

# %%
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.naver.com")  

bsObject = BeautifulSoup(html, "html.parser") 


print(bsObject.body.script)

# %%
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.naver.com")  

bsObject = BeautifulSoup(html, "html.parser") 

print (bsObject.head.find("meta", {"name":"description"}))



# %%
from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://www.naver.com")  

bsObject = BeautifulSoup(html, "html.parser") 
print (bsObject.head.find("meta", {"name":"description"}).get('content'))



# %%

import re
import requests
from bs4 import BeautifulSoup
url="https://www.naver.com"
html = requests.get(url)
bs_html = BeautifulSoup(html.content,"html.parser")
print(bs_html)
# %%


# %%
