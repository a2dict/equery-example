# EQuery-Example

## usage

```
# 1. install depencencies
git clone https://github.com/a2dict/equery.git
cd equery && mvn install

# 2. run
git clone https://github.com/a2dict/equery-example.git
mvn spring-boot:run

# 3. test
# `%5B` = urlencode('[') 
# `%5D` = urlencode(']') 
curl 'http://localhost:8080/customers?q%5Bid::gt%5D=3'
curl 'http://localhost:8080/customers?q%5Bcity::ilike%5D=shen%'
```