# Day47_Q1.py
# ''' HTML Parser - Part 1 Hackerrank '''
from html.parser import HTMLParser
n_lines = int(input())
class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print("Start :", tag)
        for attr in attrs:
            value_list = list(attr)
            print('->', attr[0], '>', attr[1])
    def handle_endtag(self, tag):
        print("End   :", tag)
    def handle_startendtag(self, tag, attrs):
        print("Empty :", tag)
        for attr in attrs:
            print('->', attr[0], '>', attr[1])   
parser = MyHTMLParser()
html_input = '\n'.join([input() for _ in range(n_lines)])
parser.feed(html_input)