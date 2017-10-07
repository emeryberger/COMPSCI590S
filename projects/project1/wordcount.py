# Wordcount
# Prints words and frequencies in decreasing order of frequency.
# To invoke:
#   python wordcount.py file1 file2 file3...
# Author: Emery Berger, www.emeryberger.com

import sys
import operator

# The map of words -> counts.
wordcount={}

# Read filenames off the argument list.
for filename in sys.argv[1:]:
    file=open(filename,"r+")
    # Process all words.
    for word in file.read().split():
        # Get the previous count (possibly 0 if new).
        count = wordcount.get(word, 0)
        # Increment it.
        wordcount[word] = count + 1
    file.close();

# Sort in reverse order by frequency.
sort1 = sorted(wordcount.iteritems(), key=operator.itemgetter(0))
sort2 = sorted(sort1, key=operator.itemgetter(1), reverse = True)

for pair in sort2:
    print ("%s : %s" %(pair[0] , pair[1]))
                          
