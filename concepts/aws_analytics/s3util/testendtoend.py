import boto3.s3
import  json
import json
import pandas as pd
import mysql.connector
from pandas.io import sql
from sqlalchemy import create_engine
import pymysql

# import boto3.s
#
# s3c = boto3.client('s3',
#                    aws_access_key_id="AKIA4DZ4H26U2LLDGYPR",
#                    aws_secret_access_key="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"
# )


# Downloading file form the s3 bucket
# with open('Clicks0.json', 'wb') as f:
#     s3c.download_fileobj('ameytestbucket', 'click-data/Clicks0.json', f)

# reading file and grouping data
#
# df = pd.read_json('Clicks0.json')
# df.info()

with open('Clicks.json','r') as jf:
    clicksDict = json.loads(jf.read())
    #print(clicksDict)
df = pd.json_normalize(clicksDict)
groupedData = df.groupby("impression_id").sum('revenue').reset_index()
print(groupedData)

#********imporiting data to RDS Database

# client = boto3.client('rds-data',region_name='ap-south-1',aws_access_key_id="AKIA4DZ4H26U2LLDGYPR",
#                          aws_secret_access_key="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")
# print(client)
#
db_name = 'adsdb'
connection = mysql.connector.connect(
     host='database-2.c0tg4lplom2z.ap-south-1.rds.amazonaws.com',
     port=3306,
     user='admin',
     password='datadata123',
     database=db_name,
 )
#
cursor = connection.cursor()
print(cursor.column_names)
#
# create_query = "create table clicks0(id varchar(50),revenue float)"
# # cursor.execute(create_query)
#
# print("Printing each JSON Decoded Object", len(groupedData))
# for i in groupedData:
#     print(i)
#     #print(i['impression_id'], i['revenue'])
#     # insert_query = "insert into clicks values( '"+i['impression_id']+"',"+ i['revenue']+")"
#     #insert_query = f"insert into clicks0 values( '{i['impression_id']} ', {i['revenue']})"
#     #print(insert_query)
#     #cursor.execute(insert_query)
#
# select_query = "select * from clicks0"
#
# cursor.execute(select_query)
#
# result = cursor.fetchall()
# print(result)
# connection.commit()

engine = create_engine("mysql+pymysql://{user}:{pw}@database-2.c0tg4lplom2z.ap-south-1.rds.amazonaws.com/{db}"
                       .format(user="admin",
                               pw="datadata123",
                               db="adsdb"))
groupedDatae3.to_sql(con=engine,index=False, name='clicks0', if_exists='replace')

select_query = "select * from clicks0"
cursor.execute(select_query)
#
result = cursor.fetchall()
print(result)
connection.commit()
