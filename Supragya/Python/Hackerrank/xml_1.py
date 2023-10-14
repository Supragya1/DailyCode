# Day49_Q1.py
'''XML 1 Hackerrank'''
import sys
import xml.etree.ElementTree as etree

def get_attr_number(n):
    return len(n.keys()) + sum(get_attr_number(x) for x in n)

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))