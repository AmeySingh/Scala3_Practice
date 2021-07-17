import json
import mysql.connector

#auth_plugins for the native connection
conn = mysql.connector.connect(
    user='root', password='Aries@21', host='127.0.0.1', database='mysql',auth_plugin='mysql_native_password')

print(conn)

#Creating a cursor object using the cursor() method
cursor = conn.cursor()
print(cursor)

#clicksList = []
with open('Clicks.json','r') as jf:
    clicksDict = json.loads(jf.read())
    print(clicksDict)

#create_query = "create table clicks(id varchar(50),revenue float)"
#cursor.execute(create_query)

print("Printing each JSON Decoded Object", len(clicksDict))
for i in clicksDict:
    print(i['impression_id'],i['revenue'])
    #insert_query = "insert into clicks values( '"+i['impression_id']+"',"+ i['revenue']+")"
    insert_query = f"insert into clicks values( '{ i['impression_id'] } ', {i['revenue'] })"
    print(insert_query)
    cursor.execute(insert_query)

select_query = "select * from clicks"

cursor.execute(select_query)

result = cursor.fetchall()
print(result)
conn.commit()
