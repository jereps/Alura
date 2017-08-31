import requests
from lxml import html
import lxml.html as parser


 
def cria_lista_links(content):
    links = []
    html = parser.fromstring(content)
    linkss = html.xpath('//a/@href')
    for link in linkss:
       links.append("link")

    arq = open("fatec.txt", "w")

    for lin in linkss:
       arq.write(lin)
       arq.write('\n')
    
    arq.close()
    
    return links

r = requests.get("http://fatecsjc-prd.azurewebsites.net/")
print '\n'.join(cria_lista_links(r.content))
