import requests
from lxml import html
import lxml.html as parser
import re
from selenium import webdriver


def cria_lista_links(r):
    '''site = r.content'''
    driver = webdriver.Chrome()
    driver.get(r)
    links = []
    html = parser.fromstring(driver.page_source)
    linkss = html.xpath('//a/@href')

    for link in linkss:
       links.append("link")

    for linknovo in link:
        cria_lista_links(r + linknovo)
    '''nomearq = "fatec0.txt"

    arq = open(nomearq, "w")

    for lin in linkss:
       if ('http://' not in lin and 'https://' not in lin):
          arq.write(r + lin)
          arq.write('\n')

    arq.close()'''
    return links

r = "http://fatecsjc-prd.azurewebsites.net/"
print '\n'.join(cria_lista_links(r))
