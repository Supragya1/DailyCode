# Day53_Q1.py
'''Detect HTML Tags, Attributes and Attribute Values Hackerrank'''
import re
import sys

comment_pattern = r'<!--[\s\S]+?-->'
tag_pattern = r'(?!</)<([a-zA-Z0-9]+)([\s\S]*?)/?>'
    
no_of_lines = int(input())
html_content = sys.stdin.read()
content_without_comments = re.sub(comment_pattern, '', html_content)

tags = re.findall(tag_pattern, content_without_comments)
for tag, attrs in tags:
    print(tag)
    if not attrs:
        continue
    attr_value_pairs = re.findall(r'([a-zA-Z0-9-]+)=[\'"](.+?)[\'"]', attrs)
    for attr, value in attr_value_pairs:
        print(f'-> {attr} > {value}')
        