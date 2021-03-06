# -*- coding: utf-8 -*-
"""
Created on Wed Feb 19 23:58:43 2020

@author: didrm
"""
import numpy as np
import pandas as pd
import time
start = time.time()
ques1, ques2 = {'G1':{1:[],2:[],3:[],4:[],5:[]},'G2':{1:[],2:[],3:[],4:[],5:[]}}, {10:{1:[],2:[],3:[],4:[],5:[]},20:{1:[],2:[],3:[],4:[],5:[]},30:{1:[],2:[],3:[],4:[],5:[]},40:{1:[],2:[],3:[],4:[],5:[]},50:{1:[],2:[],3:[],4:[],5:[]},60:{1:[],2:[],3:[],4:[],5:[]}}
for line in open('./asset.csv'):
    line = line.strip().split(',')
    (ques1[line[0]])[int(line[1]) if int(line[1])<5 else 5].append(int(line[3]) - int(line[4]))
    (ques2[(int(line[2]) - (int(line[2])%10) if int(line[2]) <60 else 60)])[int((line)[1]) if int((line)[1])<5 else 5].append(int((line)[3]) - int((line)[4]))
for key in [[i,j] for i in list(ques1.keys())+list(ques2.keys()) for j in list(ques1['G1'].keys())]:
    if type(key[0]) != int: ques1[key[0]][key[1]] = round(np.mean(ques1[key[0]][key[1]]))
    else: ques2[key[0]][key[1]] = round(np.mean(ques2[key[0]][key[1]]))
print(pd.DataFrame(ques1),'\n',pd.DataFrame(ques2))    
print(time.time() - start)



    
    