# Day47_Q2.py
# ''' HTML Parser - Part 2 Hackerrank '''
from html.parser import HTMLParser
n_lines = int(input())
class MyHTMLParser(HTMLParser):
    def handle_comment(self, data):
        if '\n' in data:
            print(">>> Multi-line Comment")
        else:
            print(">>> Single-line Comment")
        print(data)
    def handle_data(self, data):
        if data != '\n':
            print(">>> Data")
            print(data)
parser = MyHTMLParser()
html_input = '\n'.join([input() for _ in range(n_lines)])
parser.feed(html_input)