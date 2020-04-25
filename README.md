# Deploying

To deploy your app:
```bash
 mvn clean package appengine:deploy -Dapp.deploy.promote=false
```

To view your app:
```
gcloud app browse
```

