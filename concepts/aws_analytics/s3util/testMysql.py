import mysql.connector

# establishing the connection with python by importing mysql.connector
#auth_plugins for the native connection
conn = mysql.connector.connect(
    user='root', password='Aries@21', host='127.0.0.1', database='mysql',auth_plugin='mysql_native_password')

print(conn)

#Creating a cursor object using the cursor() method
cursor = conn.cursor()
print(cursor)

#create_query = "create table test2(id int,name varchar(30))"

#cursor.execute(create_query)

insert_query = "insert into test2 values(102,'rajesh')"

cursor.execute(insert_query)

select_query = "select * from test2"

cursor.execute(select_query)

result = cursor.fetchall()
print(result)