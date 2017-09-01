import requests
from lxml import html
import lxml.html as parser
import re
from selenium import webdriver

links = []
falha = []
i = 0
index = 0
'driver = webdriver.Firefox()'

def cria_lista_links(r):
    global links
    global i
    global index
    global falha

    web = requests.get(r)
    site = web.content
    '''driver = webdriver.Firefox()
    driver.get(r)
    links = []
    html = parser.fromstring(driver.page_source)'''
    html = parser.fromstring(site)
    linkss = html.xpath('//a/@href')

    for link in linkss:
        if ('http://' not in link and 'https://' not in link and 'downloads' not in link):
          valido = requests.get("http://fatecsjc-prd.azurewebsites.net/" + link)
          if (valido.status_code != 200):
              if(link not in falha):
                 falha.append(link)
          elif (link not in links):
             print link
             links.append(link)
             cria_lista_links("http://fatecsjc-prd.azurewebsites.net/" + link)

    print id(links)

    i = len(links)
    '''while (index < i):

       print i
       print index
       print id(i)
       print id(index)
       print links[index]
       lins = (cria_lista_links(r + links[index]))
'''



    '''nomearq = "fatec0.txt"

    arq = open(nomearq, "w")

    for lin in linkss:
       if ('http://' not in lin and 'https://' not in lin):
          arq.write(r + lin)
          arq.write('\n')

    arq.close()
    return links'''
    return falha

r = "http://fatecsjc-prd.azurewebsites.net/"
print '\n'.join(cria_lista_links(r))
