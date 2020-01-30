# -*- coding: utf-8 -*-
"""
Created on Thu Jan 30 15:58:59 2020

@author: didrm
"""

    
def clear(line,cnt,idx1,idx2):
    line = []
    cnt = 0
    idx1 += 1
    idx2 = 0
    return line,cnt,idx1,idx2


file1 = open("C:/d1.txt", 'r')
sentence1 = []
cnt = 0
in_end = ' 끝 '
end = '끝'
for line1 in file1:
    line1 = line1.strip()
    for word in line1:
        if word == '.' or word == '?' or  word == '!':    
            line1 = line1.replace(word,in_end)
        elif word.isalpha() == False:
            line1 = line1.replace(word,' ')
    line1 = line1.split()
    sentence1.extend(line1)



file2 = open("C:/d2.txt", 'r')
sentence2 = []

for line2 in file2:
    line2 = line2.strip()
    for word in line2:
        if word == '.' or word == '?' or  word == '!':    
            line2 = line2.replace(word,in_end)
        elif word.isalpha() == False:
            line2 = line2.replace(word,' ')
    line2 = line2.split()
    sentence2.extend(line2)
    

cnt = 0
idx1 = 0
idx2 = 0
line = []
text = []
while(True):

    print(sentence1[idx1],sentence2[idx2])
    if sentence1[idx1] == end :
        print("1")
        if cnt >= 4:
            text.append(line)
            line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2)
        else:
            line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2)
    elif sentence2[idx2] == end:
        if cnt >= 4:
            text.append(line)
            line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2)
        else:
            line = []
            cnt = 0
            idx2 += 1
            
    elif sentence1[idx1] == sentence2[idx2]:
        print("2")
        line.append(sentence2[idx2])
        cnt += 1
        idx1 += 1
        idx2 += 1
        
    elif sentence1[idx1] != sentence2[idx2] and cnt>=4:
        print("3")
        for _ in range(cnt):
            del sentence2[idx2 - cnt]
        
        text.append(line)
        line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2) 
        
    elif sentence1[idx1] != sentence2[idx2]:
        print("4")
        cnt = 0
        line = []
        idx2 += 1
        
    if idx1 > len(sentence1) -1:
        print("5")
        if cnt >= 4:
            text.append(line)
            line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2)
        break
    
    elif idx2 > len(sentence2) - 1:
        print("6")
        if cnt >= 4:
            text.append(line)
            line,cnt,idx1,idx2 = clear(line,cnt,idx1,idx2)
        else:
            line,cnt,idx1,dix2 = clear(line,cnt,idx1,idx2) 
              
    
    
for idx,val in enumerate(text):
    text[idx] = ' '.join(val)
    
text = list(set(text))

for line in text:
    print(line)
