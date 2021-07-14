import boto3
import boto3.s3

s3r = boto3.resource('s3',
    aws_access_key_id="*****************",
    aws_secret_access_key="***********************",
)

for bucket in s3r.buckets.all():
    for key in bucket.objects.all():
        print(key.key)

s3c = boto3.client('s3',
    aws_access_key_id="****************",
    aws_secret_access_key="****************************",
)

with open('Student.json', 'wb') as f:
    s3c.download_fileobj('ameytestbucket', 'students/Student.json', f)
