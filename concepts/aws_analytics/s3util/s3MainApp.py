import boto3
import boto3.s3

s3r = boto3.resource('s3',
    aws_access_key_id="AKIA4DZ4H26UUOSO67GF",
    aws_secret_access_key="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",
)

s3c = boto3.client('s3',
    aws_access_key_id="AKIA4DZ4H26U2LLDGYPR",
    aws_secret_access_key="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",
)

with open('Student.json', 'wb') as f:
    s3c.download_fileobj('ameytestbucket', 'students/Student.json', f)