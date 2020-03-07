file1 = open("C:/d1.txt", 'r')

sentence1 = []
cnt = 0
img_cnt = 0
img1 = " vdkevfr"
img2 = "fedvdv  "
for line1 in file1:
    line1 = line1.strip()
    line1 = line1.replace('!',img1+str(img_cnt)+img2)
    img_cnt += 1
    line1 = line1.replace('?',img1+str(img_cnt)+img2)
    img_cnt += 1
    line1 = line1.replace('.',img1+str(img_cnt)+img2)
    img_cnt += 1
    table = str.maketrans('`~@#$%^&*()-_=+\|[{]};:<>,', '                          ')
    line1 = line1.translate(table)
    line1 = line1.split()
    sentence1.extend(line1)

file2 = open("C:/d2.txt", 'r')

sentence2 = []

for line2 in file2:
    line2 = line2.strip()
    line2 = line2.replace('!',img1+str(img_cnt)+img2)
    img_cnt += 1
    line2 = line2.replace('?',img1+str(img_cnt)+img2)
    img_cnt += 1
    line2 = line2.replace('.',img1+str(img_cnt)+img2)
    img_cnt += 1
    table = str.maketrans('`~@#$%^&*()-_=+\|[{]};:<>,', '                          ')
    line2 = line2.translate(table)
    line2 = line2.split()
    sentence2.extend(line2)
#print(sentence1)
#print(sentence2)
idx1 = 0
idx2 = 0
line = []
text = []
while(True):
#    print("idx1:  ",idx1)
#    print("idx2:  ",idx2)
#    print("cnt:   ",cnt)
#    print("########")
    if idx2 > len(sentence2) - 1 and idx1 > len(sentence1) -1:
        if cnt >= 4:
            #print("append1")
            text.append(line)
        break
    elif idx2 > len(sentence2) - 1:
        idx1 += 1
        idx2 = 0      
    elif sentence1[idx1] == sentence2[idx2]:
        line.append(sentence2[idx2])
        cnt += 1
        idx1 += 1
        idx2 += 1
    elif sentence1[idx1] != sentence2[idx2] and cnt>=4:
        for _ in range(cnt):
            del sentence2[idx2 - cnt]
        #print("append2")
        text.append(line)
        line = []
        cnt = 0
        idx1 += 1
        idx2 = 0
    elif sentence1[idx1] != sentence2[idx2]:
        cnt = 0
        line = []
        idx2 += 1
    
for jool in text:
    print(' '.join(jool))
        