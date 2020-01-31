import csv
data = dict()
file_name = 11
text = []
tmp = []
for i in range(11,36):
    print(i)
    file = open('C:/programming/text/'+str(file_name)+'.txt','r',encoding = 'utf-8')
    for line in file:
        line = line.strip()
        text.extend(line)
    file_name += 1
    file.close()
for ch in text:
    data[ch] = data.get(ch,0)+1


data = sorted(data.items(), key=lambda x: x[1],reverse = True)
number = dict()
for item in data:
    number[item[0]] = item[1]
print(number)



with open('names.csv', 'w', newline='') as csvfile:
    fieldnames = ['index','char', 'number']
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)

    writer.writeheader()
    for idx,tmp in enumerate(data):
        
        writer.writerow({'index':idx,'char': tmp[0],'number':tmp[1]})
    


