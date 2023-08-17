
## Local Project Build
```gradlew clean build```

## GCP Configuration
* create bucket to upload files(check your permissions for this action)
* open cloud shell editor and run: 
 ```gcloud storage buckets notifications create gs://listened_bucket --topic=topicforlistenedbucket --event-types=OBJECT_FINALIZE ```
* create subscription for topic and set subscription name in applications.yaml:
``` 
gcp:
    topic:
        subscription:
            name: projects/plenary-treat-396208/subscriptions/subs1 
```
                
* setup local gcloud auth:
  Check file `application_default_credentials.json` located in `C:\Users\USER_NAME\AppData\Roaming\gcloud`
  If such file does not exist execute `gcloud auth application-default login` in Google Cloud SDK and login with your project account.

* add to application properties:
```
spring:
  cloud:
    gcp:
      project-id: med-shared-acm-dev
      credentials:
      location: file:C:\\Users\\USER_NAME\\AppData\\Roaming\\gcloud\\application_default_credentials.json
```

Additional documentation about GCP bucket notifications: https://cloud.google.com/sdk/gcloud/reference/storage/buckets/notifications/create#--event-types
