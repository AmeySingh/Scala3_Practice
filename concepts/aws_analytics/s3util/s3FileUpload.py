import logging
import boto3
from botocore.exceptions import ClientError


def upload_file(file_name, bucket, object_name=None):


    # If S3 object_name was not specified, use file_name
    if object_name is None:
        object_name = file_name

    # Upload the file
    s3_client = boto3.client('s3',
                         aws_access_key_id="***************************",
                         aws_secret_access_key="**************************")
    try:
        response = s3_client.upload_file(file_name, bucket, object_name)
    except ClientError as e:
        logging.error(e)
        return False
    return True

for i in range(10):
    print("Uploading file", i)
    obj_name = 'click-data/Clicks'+str(i)+'.json'
    upload_file('Clicks.json','ameytestbucket',obj_name)




