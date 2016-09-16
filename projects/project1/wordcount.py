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
    file.close()

# Build a list of words for each count.
revwordcount = {}  # revwordcount: count -> [word]
for pair in wordcount.iteritems():
    if not pair[1] in revwordcount:
        revwordcount[pair[1]] = []
    revwordcount[pair[1]].append(pair[0])

# Sort the counts in reverse order.
for pair in sorted(revwordcount.iteritems(), key=lambda s: s[0], reverse = True):
    # Print word and count, with words sorted in alphabetical order.
    for v in sorted(pair[1]):
        print ("%s : %s" %(pair[0] , v))
                          
