import re
import requests
from bs4 import BeautifulSoup

def getImage(keyword,no):
    url="https://search.naver.com/search.naver?where=image&sm=tab_jum&query="+keyword
    html = requests.get(url)
    bs_html = BeautifulSoup(html.content,"html.parser")
    photowall = bs_html.find('div',{"class":"photowall"})
    img_list = photowall.find_all("img",{"class":"_img"})

    # for i in range(len(img_list)):
    for i in range(no):
        img_link = re.findall('data-source="(.+?)"',str(img_list[i]))[0]
        img_con = requests.get(img_link).content
        file = open("search_img/"+keyword+str(i+1)+".jpg","wb")
        file.write(img_con)
        file.close()
        print(img_link)


epochs = 30
lr = 0.001

self.model = nn.Sequential(
        nn.Dropout(p = p),
        nn.Linear(28*28,128),
        nn.ReLU(),
        nn.Dropout(p = p),
        nn.Linear(128,64),
        nn.ReLU(),

        nn.Linear(64,10),
        nn.LogSoftmax(dim = 1)
    )
model = MNIST(p = 0.1).to(device)



self.con = nn.Sequential(
                nn.Conv2d(1, 9, 3),
                nn.ReLU(True),
                
                nn.Conv2d(9, 16, 3),
                nn.ReLU(True),
                nn.MaxPool2d(2,2),

            )
self.fcl = nn.Sequential(
        
        nn.Linear(12*12*16,128),
        nn.ReLU(True),
        
        nn.Dropout(p = p),
        nn.Linear(128, 64),
        nn.ReLU(True),
        
        nn.Linear(64,10),
        nn.LogSoftmax(dim = 1)
)
model = MNIST(p = 0.1).to(device)