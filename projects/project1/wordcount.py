import sys
import operator

wordcount={}

for filename in sys.argv[1:]:
    file=open(filename,"r+")
    for word in file.read().split():
        if word not in wordcount:
            wordcount[word] = 1
        else:
            wordcount[word] += 1
    file.close();
            
for pair in sorted(wordcount.iteritems(), key=operator.itemgetter(1), reverse = True):
    print ("%s, %s" %(pair[0] , pair[1]))
                          
