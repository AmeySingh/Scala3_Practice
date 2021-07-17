import json
import mysql.connector
import boto3
from mysql.connector import errorcode

client = boto3.client('rds-data', region_name='ap-south-1', aws_access_key_id="AKIA4DZ4H26U2LLDGYPR",
                      aws_secret_access_key="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")
print(client)

db_name = 'adsdb'
connection = mysql.connector.connect(
    host='database-2.c0tg4lplom2z.ap-south-1.rds.amazonaws.com',
    port=3306,
    user='admin',
    password='datadata123',
    database=db_name,
)

cursor = connection.cursor()
print(cursor.column_names)

# #creates db
# def create_database(cursor, database):
#     try:
#         cursor.execute(
#             "CREATE DATABASE {} DEFAULT CHARACTER SET 'utf8'".format(database))
#     except mysql.connector.Error as err:
#         print("Failed creating database: {}".format(err))
#         exit(1)
# try:
#     cursor.execute("USE {}".format(db_name))
# except mysql.connector.Error as err:
#     print("Database {} does not exists.".format(db_name))
#     if err.errno == errorcode.ER_BAD_DB_ERROR:
#         create_database(cursor, db_name)
#         print("Database {} created successfully.".format(db_name))
#         connection.database = db_name
#     else:
#         print(err)
#         exit(1)
#
# print(cursor)

# clicksList = []
with open('Clicks.json', 'r') as jf:
    clicksDict = json.loads(jf.read())
    print(clicksDict)

create_query = "create table clicks(id varchar(50),revenue float)"
cursor.execute(create_query)

print("Printing each JSON Decoded Object", len(clicksDict))
for i in clicksDict:
    print(i['impression_id'], i['revenue'])
    # insert_query = "insert into clicks values( '"+i['impression_id']+"',"+ i['revenue']+")"
    insert_query = f"insert into clicks values( '{i['impression_id']} ', {i['revenue']})"
    print(insert_query)
    cursor.execute(insert_query)

select_query = "select * from clicks"

cursor.execute(select_query)

result = cursor.fetchall()
print(result)
connection.commit()
