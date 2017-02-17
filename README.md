# segment-loader

Please add segment write key in appconfig.properties

refer: https://segment.com/docs/sources/server/java/#initialize-the-sdk

Feel free to update below properties in appconfig.properties


segment.groupcount=50 //Number of groups.

segment.usercount=700 //Number of Users per group hence that many identify calls

segment.trackcount=6 //Number of track events per user

// Update main thread sleep time to allow sufficient time for async sending of queued segment events
thread.minutes.sleep=20
