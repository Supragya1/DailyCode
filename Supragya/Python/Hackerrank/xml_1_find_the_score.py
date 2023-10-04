# Day50_Q1.py
'''XML 1 Find the score Hackerrank'''
import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
     return len(node.attrib)+sum([get_attr_number(x) for x in node])

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))